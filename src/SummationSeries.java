

public class SummationSeries implements ISubscriber {
    
    public void operate(int input){
    double result = 0; 
    for (int i=0;i<input ;i++){
    result+=i;
    }
    System.out.println(" The resullt of summation series is : "+ result);
    }

   
    public void notifySubscriber(int input) {
       operate(input);
    }

   
}
