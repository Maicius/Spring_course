package neu.danny; 

public class HelloBean {
    private String name;
    private String helloWord;

    // 建议有 无参数 构造方法
    public HelloBean() {
    	System.out.println("无参构造函数：HelloBean()");
    }
    public HelloBean(String nameTest) {
    	System.out.println("单参数构造函数：HelloBean()");
    	this.name = nameTest;
    }
    public HelloBean(String nameTest, String helloWordTest) throws Exception{
    	System.out.println("HelloBean(String name, String helloWord)");
        this.name = nameTest;
        this.helloWord = helloWordTest;
        System.out.println("HelloBean(String name, String helloWord)");
    }
    
    public void setName(String name) {
    	System.out.println("setName");
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setHelloWord(String helloWord) { 
    	System.out.println("setHelloWord");
        this.helloWord = helloWord; 
    }
    
    public void setHelloBean(String nameTest, String helloWordTest){
        this.name = nameTest;
        this.helloWord = helloWordTest;
        System.out.println("属性注入：HelloBean(String name, String helloWord)");
    }
    public String getHelloWord() { 
        return helloWord; 
    } 
}
