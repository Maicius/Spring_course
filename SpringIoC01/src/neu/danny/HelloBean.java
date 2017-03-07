package neu.danny; 

public class HelloBean { 
    private String helloWord; 
    
    public HelloBean(){
    	System.out.println("无参构造函数");
    }
    public void setHelloWord(String helloWord) {
    	System.out.println("began setting");
        this.helloWord = helloWord; 
    } 
    public String getHelloWorld() { 
    	System.out.println("begin getting");
        return helloWord; 
    } 
}