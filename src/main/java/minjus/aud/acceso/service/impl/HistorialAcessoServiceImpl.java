package minjus.aud.acceso.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minjus.aud.acceso.entity.HistorialAcessoEntity;
import minjus.aud.acceso.repository.IHistorialAcessoRepository;
import minjus.aud.acceso.service.IHistorialAcessoService;

@Service
public class HistorialAcessoServiceImpl implements IHistorialAcessoService {

	@Autowired
	private IHistorialAcessoRepository iHistorialAcessoRepository;

	@Override
	public List<HistorialAcessoEntity> findAll() {
		return (List<HistorialAcessoEntity>) iHistorialAcessoRepository.findAll();
	}

	public HashMap<String, Object> registrarAcceso(HistorialAcessoEntity aud) {
		String auditUsuario = aud.getAudit_usuario().toString();
		String token = aud.getToken().toString();
		
		System.out.println(auditUsuario);
		System.out.println(token);
		return iHistorialAcessoRepository.registrarAcceso(auditUsuario, token);
	}

	public HashMap<String, Object> cierreSesion(HistorialAcessoEntity aud) {
		String auditUsuario = aud.getAudit_usuario().toString();
		String token = aud.getToken().toString();

		return iHistorialAcessoRepository.cierreSesion(auditUsuario, token);
	}

}
