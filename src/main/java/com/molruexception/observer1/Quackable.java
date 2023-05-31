package com.molruexception.observer1;

public interface Quackable {
	void quack();
	void registerObserver(Observer observer);
	void notifyObservers();
}