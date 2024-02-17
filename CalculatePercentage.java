package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatePercentage {
	
	@GetMapping("/data")
	public String calculate( @RequestParam String name,@RequestParam double marks1 , @RequestParam double marks2 ,@RequestParam double marks3,@RequestParam double marks4){
		double percent=(((marks1+marks2+marks3+marks4)/400)*100);
		return "Hey " +name+ ", Your Percentage is " +percent+"%";	
	}

}
