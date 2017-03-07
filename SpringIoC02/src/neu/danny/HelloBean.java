package neu.danny; 

public class HelloBean { 
    private String helloWord; 
    
    public HelloBean(String helloWord){
    	System.out.println("¹¹Ôìº¯Êý£º");
    	this.helloWord = helloWord;
    }
    public void setHelloWord(String helloWord) { 
        this.helloWord = helloWord; 
    } 
    public String getHelloWord() { 
        return helloWord; 
    } 
}