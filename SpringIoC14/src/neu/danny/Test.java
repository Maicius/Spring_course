package neu.danny;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("-----����Spring�����ļ�");
         ApplicationContext context =  
                new ClassPathXmlApplicationContext("applicationContext.xml"); 
         System.out.println("-----����Spring�����ļ�����");
         BeanNameAware_Interface bean=(BeanNameAware_Interface)context.getBean("javaBean");
         System.out.println("-----��ȡname���ԣ�"+bean.getName());
         System.out.println("-----�������");
    }
}
