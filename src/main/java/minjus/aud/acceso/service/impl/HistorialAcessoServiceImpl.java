package minjus.aud.acceso.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import minjus.aud.acceso.entity.HistorialAcessoEntity;
import minjus.aud.acceso.repository.IHistorialAcessoRepository;
import minjus.aud.acceso.service.IHistorialAcessoService;

@Service
public class HistorialAcessoServiceImpl implements IHistorialAcessoService{

	@Autowired
	private IHistorialAcessoRepository iHistorialAcessoRepository;
	
	
	@Override
	public List<HistorialAcessoEntity> findAll() {
		return (List<HistorialAcessoEntity>) iHistorialAcessoRepository.findAll();
	}
	
	
	public String registrarAcceso(HistorialAcessoEntity aud) {
		return iHistorialAcessoRepository.registrarAcceso(
				aud.getAudit_fecha_hora_acceso(),
				//aud.getAudit_fecha_cierre(),
				aud.getAudit_usuario(),
				aud.getTipo_usuario(),
				aud.getAcceso_activo()
				//aud.getTiempo_sesion()
				);
	}
	
	public String cierreSesion(HistorialAcessoEntity aud) {
		return iHistorialAcessoRepository.cierreSesion(
				aud.getAccesoID(),
				//aud.getAudit_fecha_hora_acceso(),
				aud.getAudit_fecha_cierre(),
				aud.getAudit_usuario(),
				aud.getTipo_usuario(),
				aud.getAcceso_activo()
				//aud.getTiempo_sesion()
				);
	}
	
}
