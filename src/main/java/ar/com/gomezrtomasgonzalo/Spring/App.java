package ar.com.gomezrtomasgonzalo.Spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.com.gomeztomasgonzalo.beans.AppConfig;
import ar.com.gomeztomasgonzalo.beans.Mundo;

public class App {

	public static void main(String[] args) {
		
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("ar/com/gomeztomasgonzalo/xml/beans.xml");
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Mundo m = (Mundo) appContext.getBean("mundo");
		
		System.out.println(m.getSaludo());
		


	}



}
