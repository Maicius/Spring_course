package neu.danny; 


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 注意：如果提示 java.lang.UnsupportedClassVersionError: Bad version number in .class file
 * 则如下处理：在工程上右键——〉Properties——〉Java Compiler——〉修改Comipiler Compilance Level为“5.0”
 * @author wangdr
 *
 */
public class SpringDemo { 
    public static void main(String[] args) { 
    	/*
    	 * BeanFactory负责读取Bean定义文件，管理对象的加载、生成、维护Bean对象与Bean对象之间的依赖关系，
    	 * 负责Bean的生命周期，对于简单的应用程序来说，使用BeanFactory就已经足够来管理Bean，
    	 * 在对象的管理上就可以获得许多的便利性。
    	 * 不过作为一个应用程序框架，只提供Bean容器管理的功能是不够的，若要利用Spring所提供的一些特色以及
    	 * 高级的容器功能，则可以使用org.springframework.context.ApplicationContext。
    	 * 
    	 * ApplicationContext的基本功能与BeanFactory很相似，它也具有负责读取Bean定义文件，维护
    	 * Bean之间的依赖关系等功能，除此ApplicationContext还提供一个应用程序所需的更完整的框架
    	 * 功能，例如：
    	 * 	提取取得资源文件(Resource file)更方便的方法；
    	 * 	提取文字消息解析的方法；
    	 * 	支持国际化消息；
    	 * 	ApplicationContext可以发布事件，对事件感兴趣的Bean可以接收到这些事件。
    	 * 	Spring的创始者Rod Johnson建议使用ApplicationContext来取代BeanFactory，在实现
    	 * 	ApplicationContext的类中，最常用的大概是以下三个：
    	 * 		1、FileSystemXmlApplicationContext
    	 * 		2、ClassPathXmlAppicationContext
    	 * 		3、XmlWebApplicationContext
    	 */

	   	 /**
	        * 1、FileSystemXmlApplicationContext方式(文件系统应用上下文):	加载单个配置文件
	        */
//	   	ApplicationContext context = new FileSystemXmlApplicationContext("applicationContext.xml");
//	   	HelloBean hello = (HelloBean) context.getBean("helloBean"); //加载单个配置文件
//	   	System.out.println(hello.getHelloWord()); 
	   	
        /**
         * 2、FileSystemXmlApplicationContext方式:	加载多个配置文件
         */
//		String[] locations = {"applicationContext.xml", "applicationContext-1.xml"};
//		ApplicationContext context = new FileSystemXmlApplicationContext(locations);//加载多个配置文件
//		HelloBean hello = (HelloBean) context.getBean("helloBean"); //如果多个配置文件中有同id的bean，那么后面的生效
//		System.out.println(hello.getHelloWord()); 
    	
    	/**
    	 * 3、ClassPathXmlApplicationContext方式(类路径应用上下文)： 加载单个配置文件
    	 * 
    	 * 我们常用这种方式来获取容器。
    	 * 另外，ClassPathXmlApplicationContext也接受 String[] 的参数。
    	 */
		ApplicationContext context = new ClassPathXmlApplicationContext("neu/danny/applicationContext2.xml");
		HelloBean hello = (HelloBean)context.getBean("helloBeanTest"); //加载单个配置文件
		System.out.println(hello.getHelloWord()); 
    	    	
    	/**
    	 * 4、XmlWebApplicationContext方式： 
    	 * 
    	 * 参见示例：SpringIoC021
    	 */
    } 
}