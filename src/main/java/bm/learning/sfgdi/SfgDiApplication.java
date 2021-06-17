package bm.learning.sfgdi;

import bm.learning.sfgdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext acx = SpringApplication.run(SfgDiApplication.class, args);
		System.out.println("------------- Profiler Service");

		I18nController i18nController = (I18nController) acx.getBean("i18nController");
		System.out.println(i18nController.getGreeting());

		System.out.println("------------- Primary Service");

		MyController myController = (MyController) acx.getBean("myController");
		System.out.println(myController.sayHello());


		System.out.println("------------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) acx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------------- SetterInjected");
		SetterInjectedController setterInjectedController = (SetterInjectedController) acx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------------- Constructor Injected Controller");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) acx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
