package com.example.demo.lazyAndscope;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LsTest {
	@Autowired
	private Ls ls;

	@Test
	void lstest() {
		ls.lazy();
	}

	@Test
	void scope() {
		ls.Scope();
	}
}
