package com.bdi.sp.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test1/ioc1.xml");
		House h = (House) ac.getBean("house");
		h.playWithAnimal(); 
	}
}