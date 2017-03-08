package neu.danny;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //注意：如果想调用destroy方法，需要使用子类ClassPathXmlApplicationContext来声明对象；
//         ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml"); 
        //ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         JavaBean bean=(JavaBean)context.getBean("javaBean");
         System.out.println("获取name属性："+bean.getName());
        
//         User bean=(User)context.getBean("user");
         
         //调用context.destroy()方法才能关闭容器，因而关闭当前的bean实例
         context.destroy();
         System.out.println("程序结束");
    }
}
