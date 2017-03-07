package neu.danny;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public class BeanNameAware_Interface implements InitializingBean,BeanNameAware
{
	/*
	 * 实现BeanNameAware接口的Bean类，
	 * 在依赖关系设定完成之后、初始化方法之前(例如：InitializingBean的afterPropertiesSet()方法或自定义的init方法)，
	 * 会将Bean于定义文件中的名称透过setBeanName方法设定给Bean。
	 */
	private String name;
    
    public BeanNameAware_Interface(){
        System.out.println("JavaBean类构造方法");
    }
    
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean 接口 afterPropertiesSet方法");
        
    }
    
    public void init() throws Exception {
        System.out.println("JavaBean类init 方法");
        
    }
   
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        System.out.println("JavaBean类setName 方法");
        this.name = name;
    }

	public void setBeanName(String arg0) {
		System.out.println("Bean在applicationContext.xml配置文件中定义的名称："+arg0);
		
	}

    
}