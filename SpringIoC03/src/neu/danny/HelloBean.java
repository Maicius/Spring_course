package neu.danny; 

public class HelloBean {
    private String name;
    private String helloWord;

    // ������ �޲��� ���췽��
    public HelloBean() {
    	System.out.println("�޲ι��캯����HelloBean()");
    }
    public HelloBean(String nameTest) {
    	System.out.println("���������캯����HelloBean()");
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
        System.out.println("����ע�룺HelloBean(String name, String helloWord)");
    }
    public String getHelloWord() { 
        return helloWord; 
    } 
}
