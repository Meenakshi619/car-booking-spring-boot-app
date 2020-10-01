package com.mycab.dao;

import com.mycab.constants.OnlineStatus;
import com.mycab.entity.Driver;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Database Access Object for driver table.
 * <p/>
 */
public interface DriverRepository extends CrudRepository<Driver, Long>
{
    Driver findByUsername(final String username);


    List<Driver> findByOnlineStatus(OnlineStatus onlineStatus);
}
