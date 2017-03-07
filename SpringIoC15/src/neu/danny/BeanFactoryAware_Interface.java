package neu.danny;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public class BeanFactoryAware_Interface implements InitializingBean,BeanNameAware,BeanFactoryAware
{
	/*
	 * ʵ��BeanFactoryAware�ӿڵ�Bean�࣬��������ϵ�趨��ɺ󡢳�ʼ������֮ǰ��Spring��������
	 * ͨ��setBeanFactory()������BeanFactory��ʵ��ע��Bean�С�
	 */
	private String name;
    
    public BeanFactoryAware_Interface(){
        System.out.println("JavaBean�๹�췽��");
    }
    
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean �ӿ� afterPropertiesSet()����");
        
    }
    
    public void init() throws Exception {
        System.out.println("JavaBean���Զ����init() ����");
        
    }
   
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        System.out.println("JavaBean��setName() ����");
        this.name = name;
    }

	public void setBeanName(String arg0) {
		System.out.println("Bean��applicationContext.xml�����ļ��ж�������ƣ�"+arg0);
		
	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("---BeanFactoryAware�ӿڵ�setBeanFactory()����");
		System.out.println("---BeanFactory is "+arg0);//���BeanFactory����������
		
	}

    
}