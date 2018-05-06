package observer;
/**
 * Created by LS on 2018-5-6.
 * 饿汉式单例
 */
import java.util.ArrayList;
import java.util.List;


public abstract class Subject {
	
	List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notify(String newstate) {
		for (Observer observer : observers) {
			observer.update(newstate);
		}
	}
}
