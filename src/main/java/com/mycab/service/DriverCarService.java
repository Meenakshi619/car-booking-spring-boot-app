package com.mycab.service;

import com.mycab.entity.DriverCar;

public interface DriverCarService {

	void delete(DriverCar driverCar);

	DriverCar save(DriverCar driverCar);

	DriverCar findByDriverIdAndCarId(final Long driverId, final Long carId);

}
