package neu.danny;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public class BeanNameAware_Interface implements InitializingBean,BeanNameAware
{
	/*
	 * ʵ��BeanNameAware�ӿڵ�Bean�࣬
	 * ��������ϵ�趨���֮�󡢳�ʼ������֮ǰ(���磺InitializingBean��afterPropertiesSet()�������Զ����init����)��
	 * �ὫBean�ڶ����ļ��е�����͸��setBeanName�����趨��Bean��
	 */
	private String name;
    
    public BeanNameAware_Interface(){
        System.out.println("JavaBean�๹�췽��");
    }
    
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean �ӿ� afterPropertiesSet����");
        
    }
    
    public void init() throws Exception {
        System.out.println("JavaBean��init ����");
        
    }
   
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        System.out.println("JavaBean��setName ����");
        this.name = name;
    }

	public void setBeanName(String arg0) {
		System.out.println("Bean��applicationContext.xml�����ļ��ж�������ƣ�"+arg0);
		
	}

    
}