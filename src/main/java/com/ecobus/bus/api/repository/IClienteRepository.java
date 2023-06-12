package com.ecobus.bus.api.repository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecobus.bus.api.entity.ClienteEntity;

@Repository
public interface IClienteRepository extends CrudRepository<ClienteEntity, Integer>{ 
}
