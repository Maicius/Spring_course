   ���ǿ����Ƚ���һ������������������Ҫ�������ص�jar��:    
   ���ظ���spring-framework-2.0-with-dependencies.zip�� ��
   * lib �������е�jar,
   * dist ������Щ���ĵ�jar, 
   * src ����Դ��������ڵأ�
   * samples ����spring�ṩ��ʾ��������ѧϰ��⡣
   
	Window ->  preference -> Java -> Build Path -> User Libraries -> new 
	����һ�� spring������ user library name. -> ���add JARS -> ��
	����Ҫ�����ĺ��İ� ��dist/spring.jar��
	Ȼ���������ص���־��¼����lib /Jakarta-commons/commons-logging.jar ��
								lib /log4j/log4j-1.2.14.jar��
	���뵽����������������к�
	��Ҫ�������뵽���ǵ���Ŀ�У�Java Build Path /Libraries ->add Library .. -> ѡ��User Library ->
	
***************************************************************************
* �����ҵ� User Library �����ã�����Ļ�����Ҳ������Щ����������ֱ��ʹ���ҵ����ӹ��̡� *
***************************************************************************
   
   	ͨ��myEclipse �༭applicationConetxt.xmlʱ�����û���Զ���ʾ���ܣ����ǿ��Բ������£�
	1��window ->preference ->MyEclipse ->file and editors ->XML - >XML Catalog -> 
		��ѡUser Specified Entries -> ���add ->��key Type��ѡ��URI ->��Location��ѡ�� FileSystem -> 
			 �� spring-frameword-2.0���ҵ� dist, �ҵ�resources �����ҵ�spring-beans-2.0.xsd
			 	(ʹ��schema��ʽ��)����������� ->Ȼ����key Type�и�Ϊ Schema Location	 ��>
			 		Ȼ����key ��ֵ����������Ǹղ�ѡ�е��Ǹ� /spring-beans-2.0.xsd �ļ���
   	
