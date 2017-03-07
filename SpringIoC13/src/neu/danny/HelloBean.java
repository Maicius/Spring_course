package neu.danny; 

import java.util.Date; 

public class HelloBean { 
	
    private Date date; 
    
    public HelloBean(){
    	
    }
    
    public HelloBean(Date date){
    	System.out.println("构造方法");
    	this.date=date;
    }

    public void setDate(Date date) { 
    	System.out.println("Set方法");
        this.date = date; 
    }
    
    public Date getDate() { 
        return date; 
    } 
}