package com.mycab.service;

import java.util.List;
import java.util.Map;

import com.mycab.constants.OnlineStatus;
import com.mycab.dto.DriverDTO;
import com.mycab.entity.Driver;
import com.mycab.exception.CarAlreadyInUseException;
import com.mycab.exception.ConstraintsViolationException;
import com.mycab.exception.EntityNotFoundException;

public interface DriverService {

	Driver find(Long driverId) throws EntityNotFoundException;

	Driver create(Driver driverDO) throws ConstraintsViolationException;

	void delete(Long driverId) throws EntityNotFoundException;

	void updateLocation(long driverId, double longitude, double latitude) throws EntityNotFoundException;

	List<Driver> find(OnlineStatus onlineStatus);

	DriverDTO selectCarByDriver(Long driverId, Long carId) throws EntityNotFoundException, CarAlreadyInUseException;

	void deSelectCarByDriver(Long driverId, Long carId) throws EntityNotFoundException, CarAlreadyInUseException;

	List<DriverDTO> findDriversByFilterCriteria(Map<String, String> params) throws EntityNotFoundException;

}
