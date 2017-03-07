package neu.danny; 

import java.util.Date; 

public class HelloBean { 
	
    private String helloWord; 
    private Date date; 
    
    public HelloBean(){
    	
    }
    
    public HelloBean(Date date){
    	System.out.println("构造方法");
    	this.date=date;
    }
    
    public void setHelloWord(String helloWord) { 
        this.helloWord = helloWord; 
    } 
    public String getHelloWord() { 
        return helloWord; 
    } 
    public void setDate(Date date) { 
    	System.out.println("Set方法");
        this.date = date; 
    }    
    public Date getDate() { 
        return date; 
    } 
}