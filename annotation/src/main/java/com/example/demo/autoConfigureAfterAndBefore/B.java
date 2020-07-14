package com.example.demo.autoConfigureAfterAndBefore;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(A.class)
public class B {
	public B() {
		System.out.println("B");
	}
}
