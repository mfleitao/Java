package com.patterns.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		
		Message s_lazyInit = Singleton_LazyInitialization.getInstance();
		Message s_threadSafe = Singleton_ThreadSafe.getInstance();
		Message s_doubleCheck = Singleton_DoubleCheckLocking.getInstance();
		Message s_billPugh = Singleton_BillPugh.getInstance();

		s_lazyInit.print(Singleton_LazyInitialization.class);
		s_threadSafe.print(Singleton_ThreadSafe.class);
		s_doubleCheck.print(Singleton_DoubleCheckLocking.class);
		s_billPugh.print(Singleton_BillPugh.class);
	
	}
	
}
