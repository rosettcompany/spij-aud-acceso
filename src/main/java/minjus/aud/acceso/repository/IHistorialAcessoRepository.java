package minjus.aud.acceso.repository;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import minjus.aud.acceso.entity.HistorialAcessoEntity;

@Repository
public interface IHistorialAcessoRepository  extends CrudRepository<HistorialAcessoEntity, Integer>{
	@Procedure(name="registrarAcceso")
	public  String registrarAcceso(
			@Param("audit_usuario") String audit_usuario,
			@Param("token") String token
			) ;
	@Procedure(name="cierreSesion")
	public  String cierreSesion(
			@Param("accesoID") int accesoID,
			@Param("audit_usuario") String audit_usuario,
			@Param("token") String token
			) ;
	
	@Procedure(name="verificarSesion")
	public String verificarSesion(
			@Param("accesoID") int accesoID,
			@Param("audit_usuario") String audit_usuario);
}
