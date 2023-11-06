package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.RequestMapping;	// Controllerファイルを作成したため不要
//import org.springframework.web.bind.annotation.RestController;	// Controllerファイルを作成したため不要

@SpringBootApplication
// @RestController		//WEBアプリケーションとして操作できるコントローラプログラムとして動作可		// Controllerファイルを作成したため不要
public class Dem0Application {
//	@RequestMapping("/")	// Controllerファイルを作成したため不要
//	String home() {
//		return "index";
//	}
	public static void main(String[] args) {
		SpringApplication.run(Dem0Application.class, args);
	}

}
// test update2