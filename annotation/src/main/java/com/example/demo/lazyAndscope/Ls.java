package com.example.demo.lazyAndscope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * 
 * @author shisi
 * @Lazy(value = false)时启动项目会打印"lazy******启动"
 * 
 */

@Configuration
public class Ls {
	@Bean
	@Lazy(value = false)
	public Ls lazy1() {
		System.out.println("lazy启动时创建");
		return new Ls();
	}

	@Bean
	@Lazy(value = true)
	public String lazy() {
		System.out.println("第一次调用时 加载");
		return "第一次调用时 加载";

	}

	@Bean
	@Scope(value = "prototype")
	public String Scope() {
		System.out.println("启动中----------");
		return "获取时创建";

	}

	@Bean
	@Scope(value = "singleton")
	public String Scope1() {
		System.out.println("启动時创建----------");
		return "获取时创建";

	}
}
