package minjus.aud.acceso.repository;

import java.sql.Timestamp;
import java.util.HashMap;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import minjus.aud.acceso.entity.HistorialAcessoEntity;

@Repository
public interface IHistorialAcessoRepository  extends CrudRepository<HistorialAcessoEntity, Integer>{
	@Procedure(name="registrarAcceso")
	public  HashMap<String, Object> registrarAcceso(
			//@Param("audit_fecha_hora_acceso") Timestamp audit_fecha_hora_acceso,
			//@Param("audit_fecha_cierre") Timestamp audit_fecha_cierre,
			@Param("audit_usuario") String audit_usuario,
		//	@Param("tipo_usuario") String tipo_usuario
			//@Param("acceso_activo") int acceso_activo
			//@Param("tiempo_sesion") int tiempo_sesion
			@Param("token") String token
			) ;
	@Procedure(name="cierreSesion")
	public  HashMap<String, Object> cierreSesion(
			//@Param("accesoID") int accesoID,
			//@Param("audit_fecha_hora_acceso") Timestamp audit_fecha_hora_acceso,
			//@Param("audit_fecha_cierre") Timestamp audit_fecha_cierre,
			@Param("audit_usuario") String audit_usuario,
			//@Param("tipo_usuario") String tipo_usuario
			//@Param("acceso_activo") int acceso_activo
			//@Param("tiempo_sesion") int tiempo_sesion
			@Param("token") String token
			) ;
	
	
}
