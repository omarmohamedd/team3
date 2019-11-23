import java.util.Scanner;
/*Implementors of circleCir and CircleVol should 
 * add their methods to cirlce class and class it
 * in notify subscriber class,the rest should implement 
 * their methods in their special classes
 */
public class Main {
	//add your object of class in the array below
	private static ISubscriber subscribers [] = {
			new Circle()
	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		mathTopic.dispatchEvent(input);
	}
}
