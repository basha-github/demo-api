package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	
	@RequestMapping("/nec/find/max")
	public int findMax(@RequestParam int a,int b,int c) {
		int res =0;
		if( (a>b) &&(b>c)) res=a;
		else if(b>c) res=b;
		else res=c;
		
		return res;
		
		
	}

}
