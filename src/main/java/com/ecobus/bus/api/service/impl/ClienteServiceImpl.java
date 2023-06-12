package com.ecobus.bus.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecobus.bus.api.entity.ClienteEntity;
import com.ecobus.bus.api.repository.IClienteRepository;
import com.ecobus.bus.api.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private IClienteRepository iClienteRepository;
	
	
	@Override
	public List<ClienteEntity> findAll() {
		return (List<ClienteEntity>) iClienteRepository.findAll();
	}
	

}
