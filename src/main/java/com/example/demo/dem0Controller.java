package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller		// Controller -> indexを編集して表示する
public class dem0Controller {
	@RequestMapping("/")
	public String index(@PathVariable int num, Model model) {		// Modelクラス -> Webページで使用するデータを管理するクラス
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		// addAttribute -> 第一因数：名前, 第二因数：値
		model.addAttribute("msg", "sum=" + sum);	// ビュー側で第一因数で指定した名前でデータを取り出す。
		return "index";
	}
}
