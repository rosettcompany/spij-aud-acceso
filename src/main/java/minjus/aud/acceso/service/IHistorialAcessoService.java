package minjus.aud.acceso.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import minjus.aud.acceso.entity.HistorialAcessoEntity;

public interface IHistorialAcessoService {

	public List<HistorialAcessoEntity> findAll();
	public String verificarSesion(HistorialAcessoEntity aud);
	public String ultimaSesion(HistorialAcessoEntity aud);
	public String registrarAcceso(HistorialAcessoEntity aud);
	public String cierreSesion(HistorialAcessoEntity aud);
}
