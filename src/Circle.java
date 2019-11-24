
public class Circle implements ISubscriber{
	private void circleArea(double input) {
		System.out.println("Area of circle="+3.14*input*input);
	}
	private void CircleCircummatance(double input)
	{
		double circumference= Math.PI * 2*input;
	      System.out.println( "The circumference of the circle is:"+circumference) ;
	}
	//add volume and circumferance methods
	public void notifySubscriber(double input) {
		circleArea(input);
		CircleCircummatance(input);
	}
}
