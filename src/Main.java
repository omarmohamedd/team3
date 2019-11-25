import java.util.Scanner;
/*add your class that implements ISubscriber and extends thread
which it's notifysubscriber method takes it's calles it's thread() which calls it's purpose function
 */
public class Main {
	//add your object of class in the array below
	private static ISubscriber subscribers [] = {
			new Circle(),//needs editing before program could start
			new twoPowerN(),
			new CircleCircummatance(),
      new SummationSeries(),
      new multiplicationSeries()

	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		mathTopic.setValue(input);
		mathTopic.dispatchEvent();
	}
}
