package com.eln.typhoon.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/calc")
public class Calc {

    @RequestMapping(value="/add/{a}/{b}" , method=RequestMethod.GET) 	
	public int add(@PathVariable("a") int a, @PathVariable("b") int b){
     System.out.print("a+b......................");
	 System.out.println(a+b);
    return a+b;		
}
}