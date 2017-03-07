package neu.danny; 

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

public class SpringDemo { 
    public static void main(String[] args) throws Exception{     	
        ApplicationContext classPathContext = new ClassPathXmlApplicationContext("neu/danny/applicationContext.xml");       
       //���淵�ص�Resource������Ϊorg.springframework.core.io.ClassPathResource
       Resource classResource = classPathContext.getResource("classpath:/neu/danny/log4j.properties");
       if(classResource instanceof org.springframework.core.io.ClassPathResource){
    	   System.out.println("Resource is  :   org.springframework.core.io.ClassPathResource");
    	   String classFileName = classResource.getFilename();
           System.out.println("filename="+classFileName);  
           doPrint(classResource.getInputStream());
       } 
       System.out.println("---------------------------------");
       
       ApplicationContext fileSystemContext = new FileSystemXmlApplicationContext("/src/neu/danny/applicationContext.xml");
       Resource fileSystemResource = fileSystemContext.getResource("/file.txt");
       if(fileSystemResource instanceof org.springframework.core.io.FileSystemResource){
    	   System.out.println("Resource is  :   org.springframework.core.io.FileSystemResource");
    	   System.out.println("filename="+fileSystemResource.getFilename());
    	   doPrint(fileSystemResource.getInputStream());
       }
       System.out.println("---------------------------------");
      
       //���淵�ص�Resource������Ϊorg.springframework.core.io.UrlResource
       /**
        * UrlResource ��װ��java.net.URL�����ܹ������������κ�ͨ��URL���Ի�õĶ���
        * ���磺�ļ���HTTP����FTP����ȡ����е�URL���и���׼�� String��ʾ��
        * ��Щ��׼ǰ׺���Ա�ʶ��ͬ��URL���ͣ�����file:�����ļ�ϵͳ·����
        * http: ͨ��HTTPЭ����ʵ���Դ��ftp: ͨ��FTP���ʵ���Դ�ȵȡ�
        */       
       ApplicationContext context = new FileSystemXmlApplicationContext("/src/neu/danny/applicationContext.xml");
       Resource urlResource = context.getResource("file:src/neu/danny/file.txt");
       if(urlResource instanceof org.springframework.core.io.UrlResource){
    	   System.out.println("Resource is  :   org.springframework.core.io.UrlResource");
    	   System.out.println("filename="+urlResource.getFilename());
    	   doPrint(urlResource.getInputStream());
       } 
    } 
    
    private static void doPrint(InputStream is){
    	try{
	        if(is != null){
	     	   String str = null;
	     	   BufferedReader bf = new BufferedReader(new InputStreamReader(is));
	     	   while((str=bf.readLine())!=null){
	     		   System.out.println(str);
	     	   }
	        }
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
}

