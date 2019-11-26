
public abstract class lucasSeries extends Thread implements ISubscriber{
    
 private int n;
    public int cas() 
    { 

        if (n == 0) 
            return 2; 
        if (n == 1) 
            return 1; 


        return lucas(n - 1)  + lucas(n - 2); 
        system.out.println("lucas "+ lucas(input));
        
    }

public void run(){ 
    lucas();
}
    public void notifySubscriber(Topic topic){ 
        input=(int)topic.getvalue();
        this.start();
    }


}
