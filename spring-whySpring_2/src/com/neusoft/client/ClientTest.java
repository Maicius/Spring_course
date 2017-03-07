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
 * ������Ҫ�ڿͻ��˷������ҵ��㡣��������Ҫ�õ���ӵ��ҵ���Ķ���
 * ����Ͳ�Ҫ��new һ��ҵ�������ˣ�����Ӧ�ô�IoC������ȡ�ã�������
 * Ҫ��װ����������ļ��������أ�spring�ṩ����Ӧ���ࣺBeanFactory��
 * ��δ�����������أ�
 * ֻҪ��֮ǰ��д������������ļ�applicationContext.xml��ȡ������ͬʱ
 * �ʹ����������������
 * ���������ǰ���������ļ�������src�£�����������ClassPath��ʽ�����ң�
 * ��ʵspring��֧�������ķ�ʽ�� ��
 * new ClassPathXmlApplicationContext(��applicationContext.xml��);
 * �������ܴ���һ��BeanFactory���������Ϳ���ͨ���������beanȡ������Ҫ�Ĳ�Ʒ��
 * Factory.getBean(��id��);
 * ���������ļ������Ƕ���ͨ��id ����ʶ���ǵĲ�Ʒ�ģ���ͬһ����Ʒ���һ������
 * �����ǡ����id �硱userManager�������ܵõ���Ӧ��UserManagerImpl����
 * SpringIOC�����ͻ��������󽻸��㣬
 * ������������󽻸������������У��������userManager���������������ж���ȫ��ʵ�����ã�
 * ����ע����㣬��Ȼ�Ǹ�Dao�������ǲ��ùܣ������Ѿ�ʵ�����ò�ע�뵽��UserManager��
 * ��ȫ������װ����ˡ�Ȼ��Ϳ��Ե��õõ���ҵ�����ķ����� 
 * ������ʹ�ù��췽��ע��ģ������ṩ��set������
 * 
 * ����������ҵ��������ںܶ��dao�Ļ��������ù���ķ�ʽע��Ͳ��Ǻܺ����ˣ�
 * ��ô�Ϳ��Կ���set������ʵ���ˡ�
 * ��һ�������ǣ������ʱ����ͬ��һ�����ڹ���ʱ�����룬һ�����ȴ��������dao��Ȼ�����set������set������
 * Ҫʹ��set ����ע�룬�������ļ�����Ҫ��<property name=������dao�����ҵ������Ǹ����Զ�������ͬ ��  
 * 											 ref=��ĳ��dao ��id��/>
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
