package neu.danny; 

public class HelloBean { 
    private String helloWord; 
    
    public void setHelloWord(String helloWord) { 
		System.out.println("---in HelloBean------setHelloWord---"+helloWord);
        this.helloWord = helloWord; 
    } 
    public String getHelloWord() { 
        return helloWord; 
    } 
}