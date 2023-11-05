package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller		// Controller -> indexを編集して表示する
public class dem0Controller {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
