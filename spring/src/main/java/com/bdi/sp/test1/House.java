package com.bdi.sp.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class House {
	@Autowired
	@Qualifier("dog")
	private Animal ani;
	
	public void playWithAnimal() {
		ani.run();
		ani.eat();
		ani.sleep();
	}
}
