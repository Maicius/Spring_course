package neu.danny; 

import java.util.Date; 

public class HelloBean { 
    private String helloWord; 
    private Date date;
    private HaHaBean hahaBean;
    
    public void setHelloWord(String helloWord) { 
        this.helloWord = helloWord; 
    } 
    public String getHelloWord() { 
        return helloWord; 
    } 
    public void setDate(Date date) { 
        this.date = date; 
    }    
    public Date getDate() { 
        return date; 
    }
	public HaHaBean getHahaBean() {
		return hahaBean;
	}
	public void setHahaBean(HaHaBean hahaBean) {
		this.hahaBean = hahaBean;
	}

}