package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teamname
{
@GetMapping("/rcb")
public String rcb()
{
	return "ee salah cup namadha";
}
}
