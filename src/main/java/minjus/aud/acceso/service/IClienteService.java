package minjus.aud.acceso.service;

import java.util.List;

import minjus.aud.acceso.entity.ClienteEntity;

public interface IClienteService {
	public List<ClienteEntity> findAll();
}
