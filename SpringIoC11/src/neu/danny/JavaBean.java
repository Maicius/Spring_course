package neu.danny;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class JavaBean implements InitializingBean,DisposableBean{
//public class JavaBean{//��������ﲻʵ���������ӿڣ������������ļ���Ҳû��init-method���ԣ��򲻻���������1��2��3����
    
	private String name;
    
	//1��InitializingBean�ӿڵĳ�ʼ������
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean �ӿ� afterPropertiesSet����");
        
    }
    //2��DisposableBean�ӿڵ����ٷ���
    public void destroy() throws Exception {
        System.out.println("DisposableBean �ӿ� destroy����");
        
    }
    //3��JavaBean������ĳ�ʼ����������Ҫ�������ļ��е�init-method����ָ�򱾷���
    public void init() throws Exception {
        System.out.println("JavaBean��init ����");
        
    }
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}