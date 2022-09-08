package subjects;



import observer.Observer;

import java.util.ArrayList;

public abstract class AbstractSubject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void add(Observer observer) {
		observers.add(observer);
	}

	public void remove(Observer observer) {
		observers.remove(observer);
		
	}
	
	protected void myNotify() {
		for(Observer observer : observers) {
			observer.update();
		}
	}
}
