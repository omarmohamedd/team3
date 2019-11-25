
public class Circle implements ISubscriber{
	private void circleArea(double input) {
		System.out.println("Area of circle="+3.14*input*input);
	}
	
	//add volume and circumferance methods
	public void notifySubscriber(double input) {
		circleArea(input);
	}
}
