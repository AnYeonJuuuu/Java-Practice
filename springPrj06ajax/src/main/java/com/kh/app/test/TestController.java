package com.kh.app.test;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@GetMapping("/test/random")
	@ResponseBody // 이 값을 그대로 문자열 내보내기가 가능해짐
	public String random()  {
		return "3";
	}
}
