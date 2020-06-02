package com.patterns.observer;

public class OctalObserver extends Observer {

	@Override
	public void update() {
		System.out.println("> Octal String: "+ Integer.toOctalString(subject.getState()));
	}
	
	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
}
