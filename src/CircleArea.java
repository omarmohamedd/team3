
public class CircleArea extends Thread implements ISubscriber{
	private double input;
	private void circleArea() {
		System.out.println("Area of circle="+3.14*input*input);
	}
	public void run() {
		circleArea();
	}
	public void notifySubscriber(Topic topic) {
		input = (double)topic.getValue();
		this.start();
	}
}
