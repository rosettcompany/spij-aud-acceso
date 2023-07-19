package minjus.aud.acceso.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

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

	public String registrarAcceso(HistorialAcessoEntity aud) {
		return iHistorialAcessoRepository.registrarAcceso(aud.getAudit_usuario(), aud.getToken());
	}

	public String cierreSesion(HistorialAcessoEntity aud) {
		return iHistorialAcessoRepository.cierreSesion(aud.getAccesoID(),aud.getAudit_usuario(), aud.getToken());
	}

	@Override
	public String  verificarSesion(HistorialAcessoEntity aud) {
		System.out.println("service impl: " +(aud.getAudit_usuario()));
		return (String) iHistorialAcessoRepository.verificarSesion(aud.getAccesoID(),aud.getAudit_usuario());
	}

}
