package neu.danny; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringDemo { 
    public static void main(String[] args) { 
    	ApplicationContext context = new ClassPathXmlApplicationContext(
			"neu/danny/applicationContext.xml");
      //尝试在有dependency-check属性的情况下，隐藏下面两行；如果配置文件没有指明依赖关系，仍然报UnsatisfiedDependencyException异常
//        HelloBean hello = (HelloBean) context.getBean("helloBean");
//        System.out.print(hello.getDate());
        
    } 
}