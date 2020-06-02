package com.javafeatures.version8;

public class InterfaceImpl implements DefaultAndStaticInterface {
	
	public static void main(String[] args) {
		
		DefaultAndStaticInterface impl = new InterfaceImpl();
		
		/**
		 * Regular interface method
		 * The method 'display' is not implemented within Interface, which it
		 * must be by a Concrete Class or via Anonymous Class
		 */
		impl.display("just message");
		
		/**
		 * Default interface method (Java 8 feature)
		 * The method 'log' is implemented within Interface, however it can be 
		 * override as below
		 */
		impl.log("recording log");
		
		/**
		 * Static interface method (Java 8 feature)
		 * The method 'print' is implemented within Interface and it cannot be
		 * override because it is static. It must be called straight by interface
		 * name as below
		 */
		DefaultAndStaticInterface.print("output");
		
		/**
		 * Functional Interface via Lambda
		 * The method 'display' is the only regular method with no implementation
		 * which means that it can be implemented via Lambda Expression
		 */
		DefaultAndStaticInterface lambda = (str) -> {
			System.out.println("Displaying: "+ str);
		};
		
		lambda.display("message output from lambda expression");
		
	}

	@Override
	public void display(String str) {
		System.out.println("Displaying: "+ str);
	}
	
	@Override
	public void log(String str) {
		System.out.println("LOG IMPL: "+ str);
	}
	
}
