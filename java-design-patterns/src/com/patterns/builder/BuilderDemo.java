package com.patterns.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		
		User user = new User.Builder()
				.firstName("Glacy")
				.lastName("Leitao")
				.email("glacysilva@gmail.com")
				.password("teuso123")
				.phoneNumber("437 344 0303")
				.status("PR")
				.build();
		
		System.out.println(user.toString());
		
		User bird = new User.Builder().firstName("Teuso").build();
		System.out.println(bird.toString());
	}
	
}
