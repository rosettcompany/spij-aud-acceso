package minjus.aud.acceso.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minjus.aud.acceso.entity.ClienteEntity;
import minjus.aud.acceso.repository.IClienteRepository;
import minjus.aud.acceso.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private IClienteRepository iClienteRepository;
	
	
	@Override
	public List<ClienteEntity> findAll() {
		return (List<ClienteEntity>) iClienteRepository.findAll();
	}
	

}
