package com.docker.serviceCube.controller;

import java.time.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.docker.serviceCube.entity.*;
import com.docker.serviceCube.repo.CubeRepository;

@RequestMapping("/")
public class CubeController {
	@Autowired
	private CubeRepository cuberepo;
	
	@GetMapping("cube/{num}")
	public int Cube(@PathVariable("num") int num) {
		LocalTime metric_start = LocalTime.now();
		int cube,metric;
		cube= (num*num);
		LocalTime metric_end = LocalTime.now();
		Duration duration= Duration.between(metric_start,metric_end);
		metric=  (int) duration.toMillis();
		Cube c=new Cube();
		c.setMetric(metric);		
		System.out.println(metric);		
		cuberepo.save(c);
		System.out.println("Insert success");
		return cube;
	}
}
