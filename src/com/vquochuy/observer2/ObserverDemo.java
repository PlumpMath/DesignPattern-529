package com.vquochuy.observer2;

import com.vquochuy.observer.Observer;

public class ObserverDemo {
public static void main(String [] args){
	BeingWatched beingWatched = new BeingWatched();
	Watcher watcher = new Watcher();
	beingWatched.addObserver(watcher);
	beingWatched.counter(60);
}
}
