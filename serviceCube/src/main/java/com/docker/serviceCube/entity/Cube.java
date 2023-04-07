package com.docker.serviceCube.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Cube")
public class Cube {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private int metric;
	public int getMetric() {
		return metric;
	}
	public void setMetric(int metric) {
		this.metric = metric;
	}
}
