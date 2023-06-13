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

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "audit_fecha_hora_acceso", type = Timestamp.class),
				//@StoredProcedureParameter(mode = ParameterMode.IN, name = "audit_fecha_cierre", type = Timestamp.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "audit_usuario", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "tipo_usuario", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "acceso_activo", type = int.class),
				//@StoredProcedureParameter(mode = ParameterMode.IN, name = "tiempo_sesion", type = int.class) 
				}),
		
		
		@NamedStoredProcedureQuery(name = "cierreSesion", procedureName = "cierreSesion", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "accesoID", type = int.class),
				//@StoredProcedureParameter(mode = ParameterMode.IN, name = "audit_fecha_hora_acceso", type = Timestamp.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "audit_fecha_cierre", type = Timestamp.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "audit_usuario", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "tipo_usuario", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "acceso_activo", type = int.class),
//				@StoredProcedureParameter(mode = ParameterMode.IN, name = "tiempo_sesion", type = int.class) 
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

	public Integer getTiempo_sesion() {
		return tiempo_sesion;
	}

	public void setTiempo_sesion(Integer tiempo_sesion) {
		this.tiempo_sesion = tiempo_sesion;
	}

	public String getTipo_usuario() {
		return tipo_usuario;
	}


public Integer getAcceso_activo() {
    return acceso_activo;
}

public void setAcceso_activo(Integer acceso_activo) {
    this.acceso_activo = acceso_activo;
}
	public void setAcceso_activo(int acceso_activo) {
		this.acceso_activo = acceso_activo;
	}

	public HistorialAcessoEntity(int accesoID, Timestamp audit_fecha_hora_acceso, Timestamp audit_fecha_cierre,
			String audit_usuario, String tipo_usuario, int acceso_activo, Integer tiempo_sesion) {
		super();
		this.accesoID = accesoID;
		this.audit_fecha_hora_acceso = audit_fecha_hora_acceso;
		this.audit_fecha_cierre = audit_fecha_cierre;
		this.audit_usuario = audit_usuario;
		this.tipo_usuario = tipo_usuario;
		this.acceso_activo = acceso_activo;
		this.tiempo_sesion = tiempo_sesion;
	}

	public HistorialAcessoEntity() {
		super();
	}


}
