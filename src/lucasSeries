public abstract class lucasSeries extends Thread implements ISubscriber{
    
 private int n;
    public int lucas(int n) 
    { 

        if (n == 0) 
            return 2; 
        if (n == 1) 
            return 1; 


        return lucas(n - 1)  + lucas(n - 2); 
       
        
    }

public void run(){ 
     system.out.println("lucas "+ lucas(n));
}
    public void notifySubscriber(Topic topic){ 
        n=(int)topic.getvalue();
        this.start();
    }


}
