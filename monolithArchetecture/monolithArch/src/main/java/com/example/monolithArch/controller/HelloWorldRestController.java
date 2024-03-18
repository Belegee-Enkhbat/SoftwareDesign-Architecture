package com.example.monolithArch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.monolithArch.domain.Calculator;
import com.example.monolithArch.domain.HelloWorldBean;

  @RestController
public class HelloWorldRestController {

	@RequestMapping("/myFirstFunction")
	public String helloWorld() {
		return "Сайн байна уу танд энэ өдрийн мэнд хүргэе.";
	}

	@RequestMapping("/mul")
	public HelloWorldBean mul()
	{
		int sum = new Calculator(2,3).mul();
		return new HelloWorldBean("Tanii niit udga " + sum);
	}

	@RequestMapping("/division")
	public HelloWorldBean division()
	{
		int sum = new Calculator(2,3).division();
		return new HelloWorldBean("Tanii niit udga " + sum);
	}

	@RequestMapping("/minus")
	public HelloWorldBean minus()
	{
		int sum = new Calculator(2,3).minus();
		return new HelloWorldBean("Tanii niit udga " + sum);
	}

	@RequestMapping("/sum")
	public HelloWorldBean sum()
	{
		int sum = new Calculator(2,3).add();
		return new HelloWorldBean("Tanii niit udga " + sum);
	}

	@RequestMapping("/hello-world-bean")
		public HelloWorldBean helloWorldBean() {
			return new HelloWorldBean("Hello World Bean");
		
	}
	
	@RequestMapping("/hello-world/my_second/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
		return new HelloWorldBean(String.format("Hello world path, %s", name));
		
	}
}