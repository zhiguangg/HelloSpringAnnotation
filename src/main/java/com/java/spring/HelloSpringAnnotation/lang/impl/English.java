package com.java.spring.HelloSpringAnnotation.lang.impl;

import com.java.spring.HelloSpringAnnotation.lang.Language;

public class English implements Language {

	@Override
	public String getGreeting() {
		return "Hello";
	}

	@Override
	public String getBye() {
		return "Bye";
	}

}
