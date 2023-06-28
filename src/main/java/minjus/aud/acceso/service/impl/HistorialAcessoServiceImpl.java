package minjus.aud.acceso.service.impl;

import java.util.HashMap;
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
	
	
	public HashMap<String, Object> registrarAcceso(HistorialAcessoEntity aud) {
	    String auditUsuario = aud.getAudit_usuario().toString();
	    //String tipoUsuario = aud.getTipo_usuario().toString();
	    
	    return iHistorialAcessoRepository.registrarAcceso(auditUsuario);
	}

	public HashMap<String, Object> cierreSesion(HistorialAcessoEntity aud) {
	    String auditUsuario = aud.getAudit_usuario().toString();
	    //String tipoUsuario = aud.getTipo_usuario().toString();
	    
	    return iHistorialAcessoRepository.cierreSesion(auditUsuario);
	}

	
}
