
public class CircleCircummatance extends Thread implements ISubscriber{
	private double input;
	public void CircleCircummatance()
	{
		double circumference= Math.PI * 2*input;
	      System.out.println( "The circumference of the circle is:"+circumference) ;
	}
	public void run()
	{
		CircleCircummatance();
	}
		public void notifySubscriber(Topic topic) {
			input = (double)topic.getValue();
			this.start();
		}

}
