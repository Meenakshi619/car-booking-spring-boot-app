package com.mycab.dao;

import com.mycab.entity.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long>
{}
