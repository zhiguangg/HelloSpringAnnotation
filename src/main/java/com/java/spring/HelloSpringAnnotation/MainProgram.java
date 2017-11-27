package com.java.spring.HelloSpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.spring.HelloSpringAnnotation.bean.GreetingService;
import com.java.spring.HelloSpringAnnotation.bean.MyComponent;
import com.java.spring.HelloSpringAnnotation.config.AppConfiguration;
import com.java.spring.HelloSpringAnnotation.lang.Language;

public class MainProgram {

	public static void main(String[] args) {
		
		// Creating a Context Application object by reading
	    // the configuration of the 'AppConfiguration' class.
	    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
	
	    System.out.println("----------");
	    Language language = (Language) context.getBean("language");
	   
	    System.out.println("Bean Language: "+ language);
	    System.out.println("Call language.sayBye(): "+ language.getBye());
	   
	    System.out.println("----------");
	   
	    GreetingService service = (GreetingService) context.getBean("greetingService");
	    service.sayGreeting();
	
	    System.out.println("----------");
	   
	    MyComponent myComponent = (MyComponent) context.getBean("myComponent");
	   
	    myComponent.showAppInfo();
	}
	
}
