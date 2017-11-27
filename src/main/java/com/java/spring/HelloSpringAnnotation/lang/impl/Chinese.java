package com.java.spring.HelloSpringAnnotation.lang.impl;

import com.java.spring.HelloSpringAnnotation.lang.Language;

public class Chinese implements Language {

	@Override
	public String getGreeting() {
		return "ni hao";
	}

	@Override
	public String getBye() {
		return "zai jian";
	}

}
