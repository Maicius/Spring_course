   我们可以先建立一个包，里面存放我们需要引入的相关的jar包:    
   下载个”spring-framework-2.0-with-dependencies.zip” ：
   * lib 下是所有的jar,
   * dist 下是那些核心的jar, 
   * src 下是源代码的所在地，
   * samples 下是spring提供的示例，帮助学习理解。
   
	Window ->  preference -> Java -> Build Path -> User Libraries -> new 
	建立一个 spring命名的 user library name. -> 点击add JARS -> ：
	首先要加它的核心包 ：dist/spring.jar；
	然后加两个相关的日志记录包：lib /Jakarta-commons/commons-logging.jar ；
								lib /log4j/log4j-1.2.14.jar；
	加入到我们命名的这个包中后，
	需要把它引入到我们的项目中：Java Build Path /Libraries ->add Library .. -> 选中User Library ->
	
***************************************************************************
* 参照我的 User Library 的配置，在你的机器中也创建这些变量，方便直接使用我的例子工程。 *
***************************************************************************
   
   	通过myEclipse 编辑applicationConetxt.xml时，如果没有自动提示功能，我们可以操作如下：
	1、window ->preference ->MyEclipse ->file and editors ->XML - >XML Catalog -> 
		点选User Specified Entries -> 点击add ->在key Type中选中URI ->在Location中选中 FileSystem -> 
			 到 spring-frameword-2.0下找到 dist, 找到resources ，再找到spring-beans-2.0.xsd
			 	(使用schema形式的)把它引入进来 ->然后在key Type中改为 Schema Location	 －>
			 		然后在key 的值后面加入我们刚才选中的那个 /spring-beans-2.0.xsd 文件名
   	
