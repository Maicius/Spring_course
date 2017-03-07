package neu.danny; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.
                      FileSystemXmlApplicationContext; 

public class SpringDemo { 
    public static void main(String[] args){ 
    	ApplicationContext context = new ClassPathXmlApplicationContext(
			"neu/danny/applicationContext.xml");
         
        InternalType i = (InternalType)context.getBean("internalType");
        System.out.println("property isTrue value = " + i.getIsTrue());
        System.out.println("property isDouble value = " + i.getIsDouble());
        System.out.println("property isString value = " + i.getIsString());
        System.out.println("property isColor value = " + i.getIsColor());
        System.out.println("property phoneNumber value = " + i.getPhoneNumber());
        try{
        	Object o = i.getPhoneNumber().newInstance();
        	System.out.println("-------------"+o);
        }catch(Exception e){
        	e.printStackTrace();
        }
        
        System.out.println("property isFile value = " + i.getIsFile().getName());
        System.out.println("property isLocale value = " + i.getIsLocale().getCountry());
        System.out.println("property isURL value = " + i.getIsURL().getHost());
        System.out.println("property isStringArray value = " + i.getIsStringArray()[0]);
    } 
}