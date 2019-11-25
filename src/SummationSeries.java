




public class SummationSeries extends Thread implements ISubscriber {
    private int input;

    public void operate(){
    int result = 0;
    for (int i=0;i<input;i++){
    result+=i;
    }
    System.out.println("The resullt of summation series is : " + result);
    }


public void run(){
operate();
}
    @Override
    public void notifySubscriber(Topic topic) {
        input=(int)topic.getValue();
        this.start();
    }





}
