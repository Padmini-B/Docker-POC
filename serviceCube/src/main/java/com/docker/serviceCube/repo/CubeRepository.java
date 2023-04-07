package com.docker.serviceCube.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.serviceCube.entity.Cube;

public interface CubeRepository extends JpaRepository <Cube, Integer>{

}
