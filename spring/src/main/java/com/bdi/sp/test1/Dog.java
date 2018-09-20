package com.bdi.sp.test1;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(1)
public class Dog implements Animal {

	@Override
	public void sleep() {
		System.out.println("강아지가 잡니다.");
	}

	@Override
	public void run() {
		System.out.println("강아지가 뜁니다.");
	}

	@Override
	public void eat() {
		System.out.println("강아지가 먹습니다.");
	}

}
