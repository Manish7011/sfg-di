package bm.learning.sfgdi;

import bm.learning.sfgdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext acx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) acx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
