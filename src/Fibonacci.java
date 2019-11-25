
public class Fibonacci extends Thread implements ISubscriber {
	private double input;
	public void Fib() {
		 int x=(int)input;
		/* Declare an array to store Fibonacci numbers. */
	    int f[] = new int[x+2]; // 1 extra to handle case, n = 0 
	    int i; 
	       
	    /* 0th and 1st number of the series are 0 and 1*/
	    f[0] = 0; 
	    f[1] = 1; 
	      
	    for (i = 2; i <= x; i++) 
	    { 
	       /* Add the previous 2 numbers in the series 
	         and store it */
	        f[i] = f[i-1] + f[i-2]; 
	    } 
	    
	       
	    System.out.println("Fibonacci number = " + f[x] );
		    
		 
	}
	public void notifySubscriber(Topic topic) {
		input=(double)topic.getValue();
		this.start();
	}
	public void run() {
		Fib();
	}
}