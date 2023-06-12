package com.ecobus.bus.api.service;

import java.util.List;

import com.ecobus.bus.api.entity.ClienteEntity;

public interface IClienteService {
	public List<ClienteEntity> findAll();
}
