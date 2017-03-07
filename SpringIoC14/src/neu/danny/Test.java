package neu.danny;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("-----加载Spring配置文件");
         ApplicationContext context =  
                new ClassPathXmlApplicationContext("applicationContext.xml"); 
         System.out.println("-----加载Spring配置文件结束");
         BeanNameAware_Interface bean=(BeanNameAware_Interface)context.getBean("javaBean");
         System.out.println("-----获取name属性："+bean.getName());
         System.out.println("-----程序结束");
    }
}
