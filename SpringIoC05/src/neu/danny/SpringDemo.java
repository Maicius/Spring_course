package neu.danny; 

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext; 
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class SpringDemo { 
    public static void main(String[] args) { 
        ApplicationContext context = new ClassPathXmlApplicationContext(
                    "neu/danny/applicationContext.xml");
         
        SomeBean someBean = 
            (SomeBean) context.getBean("someBean");
        
        // ȡ��������̬����ע�����
        System.out.println("-----------------------------------String[]-----------------------------------");
        
        String[] strs = 
            (String[]) someBean.getSomeStrArray();
        
        Some[] somes = 
            (Some[]) someBean.getSomeObjArray();
        
        for(int i = 0; i < strs.length; i++) {
            System.out.println(strs[i] + ", " 
                    + somes[i].getName());
        }

        // ȡ��List��̬����ע�����
        System.out.println("-----------------------------------List-----------------------------------");
        List someList = (List) someBean.getSomeList(); 
        for(int i = 0; i < someList.size(); i++) {
            System.out.println(someList.get(i));
        }
        
        // ȡ��Map��̬����ע�����
        System.out.println("-----------------------------------Map-----------------------------------");
        Map someMap = (Map) someBean.getSomeMap();
        System.out.println(someMap.get("MapTest"));
        System.out.println(someMap.get("someKey1"));
        
        // ȡ��Set��̬����ע�����
        System.out.println("-----------------------------------Set-----------------------------------");
        Set someSet = (Set) someBean.getSomeSet();
        for(Iterator iter = someSet.iterator();iter.hasNext();){
        	System.out.println(iter.next());
        }
        
     // ȡ��Properties��̬����ע�����
        //public class Propertiesextends Hashtable<Object,Object>
        //Properties ���ʾ��һ���־õ����Լ��������б���ÿ���������Ӧֵ����һ���ַ�����
        System.out.println("-----------------------------------Properties-----------------------------------");
        Properties someProps = (Properties) someBean.getSomeProps();
        for(Iterator iter = someProps.keySet().iterator();iter.hasNext();){
        	String key = (String)iter.next();
        	System.out.println(someProps.getProperty(key));
        }
        
        System.out.println("-----------------------------------��ȡProperties��Դ�ļ�����-----------------------------------");
		try {
			Properties props = PropertiesLoaderUtils.loadAllProperties("log4j.properties");
			System.out.println("log4j.appender.stdou = "+props.getProperty("log4j.appender.stdout"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    } 
}

