package com.molruexception.observer1;

import java.util.ArrayList;
import java.util.List;

public class MallardDuck implements Quackable {

	List<Observer> observers = new ArrayList<>();

	@Override
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(observer ->
				observer.update(this));
	}
 
	public String toString() {
		return "Mallard Duck";
	}

}