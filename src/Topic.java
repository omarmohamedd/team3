import java.util.ArrayList;
import java.util.List;

public class Topic {

	private List<ISubscriber> subscribers;
	private double value;
	public Topic() {
		subscribers = new ArrayList<ISubscriber>();
	}
	public void addSubscriber(ISubscriber sub) {
		subscribers.add(sub);
	}
	public void setValue(double value){
        this.value = value;
    }
    public double getValue(){
        return value;
    }
	public List<ISubscriber> getSubscribers() {
		return subscribers;
	}
	public void dispatchEvent() {
		for (ISubscriber sub : this.getSubscribers()) {
			sub.notifySubscriber(this);
		}
	}
}
