package com.java.spring.HelloSpringAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.java.spring.HelloSpringAnnotation.lang.Language;
import com.java.spring.HelloSpringAnnotation.lang.impl.Chinese;

@Configuration
@ComponentScan("com.java.spring.HelloSpringAnnotation.bean")
public class AppConfiguration {

	@Bean(name="language")
	public Language getLanguage() {
		return new Chinese();
	}
}
