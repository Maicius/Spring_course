package neu.danny;

public class User {
    private String name;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    public void init() throws Exception {
        System.out.println("User类init 方法");        
    }
    
    public void destroy(){
    	System.out.println("User类destroy方法");
    }
}