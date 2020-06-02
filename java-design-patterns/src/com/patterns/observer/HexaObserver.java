package com.patterns.observer;

public class HexaObserver extends Observer {

	@Override
	public void update() {
		System.out.println("> Hexadecimal String: "+ Integer.toHexString(subject.getState()));
	}
	
	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
}
