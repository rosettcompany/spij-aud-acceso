package minjus.aud.acceso.service;

import java.util.HashMap;
import java.util.List;


import minjus.aud.acceso.entity.HistorialAcessoEntity;

public interface IHistorialAcessoService {

	public List<HistorialAcessoEntity> findAll();
	
	public HashMap<String, Object> registrarAcceso(HistorialAcessoEntity aud);
	public HashMap<String, Object> cierreSesion(HistorialAcessoEntity aud);
}
