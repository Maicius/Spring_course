
package neu.danny;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.web.context.support.RequestHandledEvent;


public class ListenerImp implements ApplicationListener{

	public void onApplicationEvent(ApplicationEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Event..................");
		
		if(arg0 instanceof ContextClosedEvent){
			System.out.println("ContextClosedEvent..................");
		}else if(arg0 instanceof ContextRefreshedEvent){
			System.out.println("ContextRefreshedEvent..................");
		}else if(arg0 instanceof RequestHandledEvent){
			System.out.println("RequestHandledEvent..................");
		}
	}
	
}
