package com.mycab.dao;

import com.mycab.entity.Manufacturer;
import org.springframework.data.repository.CrudRepository;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, Long>
{

    Manufacturer findByName(final String name);
}
