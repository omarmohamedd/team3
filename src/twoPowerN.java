
public class twoPowerN extends Thread implements ISubscriber{
	private int input;
	public void twopowN() {
		long output = 1;
		for(int i = 1;i<=input;i++) {
			output *= 2;
		}
		System.out.println("2^"+input+"="+output);
	}
	public void run() {
		twopowN();
	}
	public void notifySubscriber(Topic topic) {
		input = (int)topic.getValue();
		this.start();
	}

}
