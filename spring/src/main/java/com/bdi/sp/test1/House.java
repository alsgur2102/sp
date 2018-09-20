package com.bdi.sp.test1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class House {
	@Autowired
	private List<Animal> aniList;

	public void playWithAnimal() {
		for(Animal ani:aniList) {
			ani.run();
			ani.eat();
			ani.sleep();
		}
	}
}
