package com.example.demo;

import com.example.demo.services.CatService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleRestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRestServerApplication.class, args);
		//System.out.println(new CatService().getFact());
		System.out.println(new CatService().getFacts());
	}

}
