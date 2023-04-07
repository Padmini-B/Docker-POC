package com.docker.serviceFibonacci.controller;

import java.time.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.docker.serviceFibonacci.repo.FibonacciRepository;
import com.docker.serviceFibonacci.entity.*;

@RequestMapping("/")
public class FibonacciController {
	
	@Autowired
	private FibonacciRepository fibonaccirepo;
	
	@GetMapping(value="/fibonacci/{num}")
	public int Fibonacci(@PathVariable("num") int num) {
		LocalTime metric_start = LocalTime.now();
		int fibonacci=0,n1=0,n2=1,i,metric;
		for(i=2;i<num;i++)
		{
			fibonacci=n1+n2;
			n1=n2;
			n2=fibonacci;
		}
		LocalTime metric_end = LocalTime.now();
		Duration duration= Duration.between(metric_start,metric_end);
		metric=  (int) duration.getSeconds();
		Fibonacci f= new Fibonacci();
		f.setMetric(metric);		
		System.out.println(metric);		
		fibonaccirepo.save(f);
		System.out.println("Insert success");
		return fibonacci;
	}
}
