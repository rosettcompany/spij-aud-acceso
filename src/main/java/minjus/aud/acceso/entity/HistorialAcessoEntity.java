package minjus.aud.acceso.entity;

import java.sql.Timestamp;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OrderBy;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name = "aud_acceso")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "registrarAcceso", procedureName = "registrarAcceso", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "audit_usuario", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "token", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class)
				}),
		
		
		@NamedStoredProcedureQuery(name = "cierreSesion", procedureName = "cierreSesion", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "accesoID", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "audit_usuario", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "token", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class)
				}),
		@NamedStoredProcedureQuery(name = "verificarSesion", procedureName = "verificarSesion", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "accesoID", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "audit_usuario", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class)
				}),

})
public class HistorialAcessoEntity {
	@Id
	@Column(name = "accesoID")
	@OrderBy("accesoID")
	public int accesoID;

	@Column(name = "audit_fecha_hora_acceso")
	public Timestamp audit_fecha_hora_acceso;

	@Column(name = "audit_fecha_cierre")
	public Timestamp audit_fecha_cierre ;

	@Column(name = "audit_usuario")
	public String audit_usuario;

	@Column(name = "tipo_usuario")
	public String tipo_usuario;

	@Column(name = "acceso_activo")
	public Integer acceso_activo;
	
	@Column(name = "tiempo_sesion")
	public Integer tiempo_sesion ;
	
	@Column(name = "token")
	public String token;

	public HistorialAcessoEntity() {
		super();
	}

	public HistorialAcessoEntity(int accesoID, Timestamp audit_fecha_hora_acceso, Timestamp audit_fecha_cierre,
			String audit_usuario, String tipo_usuario, Integer acceso_activo, Integer tiempo_sesion, String token) {
		super();
		this.accesoID = accesoID;
		this.audit_fecha_hora_acceso = audit_fecha_hora_acceso;
		this.audit_fecha_cierre = audit_fecha_cierre;
		this.audit_usuario = audit_usuario;
		this.tipo_usuario = tipo_usuario;
		this.acceso_activo = acceso_activo;
		this.tiempo_sesion = tiempo_sesion;
		this.token = token;
	}

	public int getAccesoID() {
		return accesoID;
	}

	public void setAccesoID(int accesoID) {
		this.accesoID = accesoID;
	}

	public Timestamp getAudit_fecha_hora_acceso() {
		return audit_fecha_hora_acceso;
	}

	public void setAudit_fecha_hora_acceso(Timestamp audit_fecha_hora_acceso) {
		this.audit_fecha_hora_acceso = audit_fecha_hora_acceso;
	}

	public Timestamp getAudit_fecha_cierre() {
		return audit_fecha_cierre;
	}

	public void setAudit_fecha_cierre(Timestamp audit_fecha_cierre) {
		this.audit_fecha_cierre = audit_fecha_cierre;
	}

	public String getAudit_usuario() {
		return audit_usuario;
	}

	public void setAudit_usuario(String audit_usuario) {
		this.audit_usuario = audit_usuario;
	}

	public String getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public Integer getAcceso_activo() {
		return acceso_activo;
	}

	public void setAcceso_activo(Integer acceso_activo) {
		this.acceso_activo = acceso_activo;
	}

	public Integer getTiempo_sesion() {
		return tiempo_sesion;
	}

	public void setTiempo_sesion(Integer tiempo_sesion) {
		this.tiempo_sesion = tiempo_sesion;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}



}
