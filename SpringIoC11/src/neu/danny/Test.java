package neu.danny;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //ע�⣺��������destroy��������Ҫʹ������ClassPathXmlApplicationContext����������
//         ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml"); 
        //ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         JavaBean bean=(JavaBean)context.getBean("javaBean");
         System.out.println("��ȡname���ԣ�"+bean.getName());
        
//         User bean=(User)context.getBean("user");
         
         //����context.destroy()�������ܹر�����������رյ�ǰ��beanʵ��
         context.destroy();
         System.out.println("�������");
    }
}
