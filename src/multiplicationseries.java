
public class multiplicationSeries extends Thread implements ISubscriber{
    private int n;
	public void multiplicationseries() {
		 int i,fact=1;    
		  for(i=1;i<=n;i++){    
		      fact=fact*i;    
		  } 
		  System.out.println("fact of "+n+" is"+fact);
	}
	
	public void notifySubscriber(Topic topic) {
	        n=(int)topic.getValue();
	        this.start();
		
	}
	
	public void run() {
		multiplicationseries();
	}
}
