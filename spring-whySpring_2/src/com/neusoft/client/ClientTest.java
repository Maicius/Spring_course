/**
 * 
 */
package com.neusoft.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neusoft.service.iface.UserServiceIface;

/**
 * @author Eddy Yang
 *
 * Dec 3, 2008
 * 
 * 
 * 我们需要在客户端访问这个业务层。所以我们要拿到、拥有业务层的对象，
 * 这里就不要再new 一个业务层对象了，我们应该从IoC容器中取得，即我们
 * 要先装载这个配置文件，这里呢，spring提供了相应的类：BeanFactory，
 * 如何创建这个工厂呢：
 * 只要把之前编写过的这个配置文件applicationContext.xml读取出来的同时
 * 就创建了这个工厂对象。
 * （由于我们把这个配置文件放在了src下，所以我们用ClassPath方式来查找，
 * 其实spring还支持其他的方式） ：
 * new ClassPathXmlApplicationContext(“applicationContext.xml”);
 * 这样就能创建一个BeanFactory对象。这样就可以通过这个工厂bean取得我们要的产品。
 * Factory.getBean(“id”);
 * 【在配置文件中我们都是通过id 来标识我们的产品的，如同一个产品编号一样。】
 * 填充了恰当的id 如”userManager”，就能得到对应的UserManagerImpl对象，
 * SpringIOC容器就会把这个对象交给你，
 * 容器把这个对象交给你的这个过程中，容器会把userManager对象所依赖的所有对象全部实例化好，
 * 并且注入给你，显然那个Dao对象我们不用管，容器已经实例化好并注入到了UserManager，
 * 即全部给你装配好了。然后就可以调用得到的业务对象的方法。 
 * 以上是使用构造方法注入的，它还提供了set方法；
 * 
 * 如果我们这个业务层依赖于很多个dao的话，可能用构造的方式注入就不是很合适了；
 * 那么就可以考虑set方法的实现了。
 * 再一个区别是：传入的时机不同，一个是在构造时即传入，一个是先创建好这个dao，然后调用set方法来set进来！
 * 要使用set 方法注入，在配置文件中需要用<property name=”属性dao必须跟业务里的那个属性对象名相同 ”  
 * 											 ref=”某个dao 的id”/>
 */
public class ClientTest {
	
	public static void main(String[] args){
		
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//call the id which implements with the constructors
		UserServiceIface service_cons = (UserServiceIface)factory.getBean("login_serviceUseCons");
		
		service_cons.selectEmpName();		
		service_cons.validateLogin();
		
//		System.out.println(service_cons.selectEmpName());
		System.out.println("===========================================");
		//call the id which implements with the setters
		UserServiceIface service_setters = (UserServiceIface)factory.getBean("login_serviceUseSetters");
		
		service_setters.selectEmpName();		
		service_setters.validateLogin();
	}
}
