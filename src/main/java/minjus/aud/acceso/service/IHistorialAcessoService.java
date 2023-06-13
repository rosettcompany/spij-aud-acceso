package minjus.aud.acceso.service;

import java.util.List;


import minjus.aud.acceso.entity.HistorialAcessoEntity;

public interface IHistorialAcessoService {

	public List<HistorialAcessoEntity> findAll();
	
	public String registrarAcceso(HistorialAcessoEntity aud);
	public String cierreSesion(HistorialAcessoEntity aud);
}
