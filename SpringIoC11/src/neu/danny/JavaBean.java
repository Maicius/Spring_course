package neu.danny;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class JavaBean implements InitializingBean,DisposableBean{
//public class JavaBean{//如果在这里不实现那两个接口，并且在配置文件中也没有init-method属性，则不会调用下面的1、2、3方法
    
	private String name;
    
	//1、InitializingBean接口的初始化方法
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean 接口 afterPropertiesSet方法");
        
    }
    //2、DisposableBean接口的销毁方法
    public void destroy() throws Exception {
        System.out.println("DisposableBean 接口 destroy方法");
        
    }
    //3、JavaBean自身定义的初始化方法，需要在配置文件中的init-method属性指向本方法
    public void init() throws Exception {
        System.out.println("JavaBean类init 方法");
        
    }
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}