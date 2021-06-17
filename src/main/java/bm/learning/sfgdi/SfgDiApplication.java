package bm.learning.sfgdi;

import bm.learning.sfgdi.controller.ConstructorInjectedController;
import bm.learning.sfgdi.controller.MyController;
import bm.learning.sfgdi.controller.PropertyInjectedController;
import bm.learning.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext acx = SpringApplication.run(SfgDiApplication.class, args);

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
