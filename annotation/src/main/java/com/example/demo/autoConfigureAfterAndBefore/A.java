package com.example.demo.autoConfigureAfterAndBefore;

import org.springframework.context.annotation.Configuration;

@Configuration
public class A {
	public A() {
		System.out.println("A");
	}
}
