
public class multiplicationSeries implements ISubscriber{

	public void multiplicationseries(int n) {
		 int i,fact=1;    
		  for(i=1;i<=n;i++){    
		      fact=fact*i;    
		  } 
		  System.out.println("fact of "+n+" is"+fact);
	}
	
	public void notifySubscriber(double input) {
		
		multiplicationseries((int)input);
	}
}
