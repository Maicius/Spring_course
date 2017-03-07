package neu.danny; 


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * ע�⣺�����ʾ java.lang.UnsupportedClassVersionError: Bad version number in .class file
 * �����´����ڹ������Ҽ�������Properties������Java Compiler�������޸�Comipiler Compilance LevelΪ��5.0��
 * @author wangdr
 *
 */
public class SpringDemo { 
    public static void main(String[] args) { 
    	/*
    	 * BeanFactory�����ȡBean�����ļ����������ļ��ء����ɡ�ά��Bean������Bean����֮���������ϵ��
    	 * ����Bean���������ڣ����ڼ򵥵�Ӧ�ó�����˵��ʹ��BeanFactory���Ѿ��㹻������Bean��
    	 * �ڶ���Ĺ����ϾͿ��Ի�����ı����ԡ�
    	 * ������Ϊһ��Ӧ�ó����ܣ�ֻ�ṩBean��������Ĺ����ǲ����ģ���Ҫ����Spring���ṩ��һЩ��ɫ�Լ�
    	 * �߼����������ܣ������ʹ��org.springframework.context.ApplicationContext��
    	 * 
    	 * ApplicationContext�Ļ���������BeanFactory�����ƣ���Ҳ���и����ȡBean�����ļ���ά��
    	 * Bean֮���������ϵ�ȹ��ܣ�����ApplicationContext���ṩһ��Ӧ�ó�������ĸ������Ŀ��
    	 * ���ܣ����磺
    	 * 	��ȡȡ����Դ�ļ�(Resource file)������ķ�����
    	 * 	��ȡ������Ϣ�����ķ�����
    	 * 	֧�ֹ��ʻ���Ϣ��
    	 * 	ApplicationContext���Է����¼������¼�����Ȥ��Bean���Խ��յ���Щ�¼���
    	 * 	Spring�Ĵ�ʼ��Rod Johnson����ʹ��ApplicationContext��ȡ��BeanFactory����ʵ��
    	 * 	ApplicationContext�����У���õĴ��������������
    	 * 		1��FileSystemXmlApplicationContext
    	 * 		2��ClassPathXmlAppicationContext
    	 * 		3��XmlWebApplicationContext
    	 */

	   	 /**
	        * 1��FileSystemXmlApplicationContext��ʽ(�ļ�ϵͳӦ��������):	���ص��������ļ�
	        */
//	   	ApplicationContext context = new FileSystemXmlApplicationContext("applicationContext.xml");
//	   	HelloBean hello = (HelloBean) context.getBean("helloBean"); //���ص��������ļ�
//	   	System.out.println(hello.getHelloWord()); 
	   	
        /**
         * 2��FileSystemXmlApplicationContext��ʽ:	���ض�������ļ�
         */
//		String[] locations = {"applicationContext.xml", "applicationContext-1.xml"};
//		ApplicationContext context = new FileSystemXmlApplicationContext(locations);//���ض�������ļ�
//		HelloBean hello = (HelloBean) context.getBean("helloBean"); //�����������ļ�����ͬid��bean����ô�������Ч
//		System.out.println(hello.getHelloWord()); 
    	
    	/**
    	 * 3��ClassPathXmlApplicationContext��ʽ(��·��Ӧ��������)�� ���ص��������ļ�
    	 * 
    	 * ���ǳ������ַ�ʽ����ȡ������
    	 * ���⣬ClassPathXmlApplicationContextҲ���� String[] �Ĳ�����
    	 */
		ApplicationContext context = new ClassPathXmlApplicationContext("neu/danny/applicationContext2.xml");
		HelloBean hello = (HelloBean)context.getBean("helloBeanTest"); //���ص��������ļ�
		System.out.println(hello.getHelloWord()); 
    	    	
    	/**
    	 * 4��XmlWebApplicationContext��ʽ�� 
    	 * 
    	 * �μ�ʾ����SpringIoC021
    	 */
    } 
}