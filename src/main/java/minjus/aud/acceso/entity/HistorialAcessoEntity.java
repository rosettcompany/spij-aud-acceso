package minjus.aud.acceso.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name = "historialAcceso")
public class HistorialAcessoEntity {
	@Id
	@Column(name = "accesoID")
	@OrderBy("accesoID")
	public int accesoID;

	@Column(name = "audit_fecha_hora_acceso")
	public Date audit_fecha_hora_acceso;

	@Column(name = "audit_fecha_cierre")
	public Date audit_fecha_cierre ;

	@Column(name = "audit_usuario")
	public String audit_usuario;

	@Column(name = "tipo_usuario")
	public String tipo_usuario;

	@Column(name = "acceso_activo ")
	public int acceso_activo ;
	
	@Column(name = "tiempo_sesion ")
	public int tiempo_sesion ;

	public int getAccesoID() {
		return accesoID;
	}

	public void setAccesoID(int accesoID) {
		this.accesoID = accesoID;
	}

	public Date getAudit_fecha_hora_acceso() {
		return audit_fecha_hora_acceso;
	}

	public void setAudit_fecha_hora_acceso(Date audit_fecha_hora_acceso) {
		this.audit_fecha_hora_acceso = audit_fecha_hora_acceso;
	}

	public Date getAudit_fecha_cierre() {
		return audit_fecha_cierre;
	}

	public void setAudit_fecha_cierre(Date audit_fecha_cierre) {
		this.audit_fecha_cierre = audit_fecha_cierre;
	}

	public String getAudit_usuario() {
		return audit_usuario;
	}

	public void setAudit_usuario(String audit_usuario) {
		this.audit_usuario = audit_usuario;
	}

	public int getTiempo_sesion() {
		return tiempo_sesion;
	}

	public void setTiempo_sesion(int tiempo_sesion) {
		this.tiempo_sesion = tiempo_sesion;
	}

	public String getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public int getAcceso_activo() {
		return acceso_activo;
	}

	public void setAcceso_activo(int acceso_activo) {
		this.acceso_activo = acceso_activo;
	}

	public HistorialAcessoEntity(int accesoID, Date audit_fecha_hora_acceso, Date audit_fecha_cierre,
			String audit_usuario, String tipo_usuario, int acceso_activo, int tiempo_sesion) {
		super();
		this.accesoID = accesoID;
		this.audit_fecha_hora_acceso = audit_fecha_hora_acceso;
		this.audit_fecha_cierre = audit_fecha_cierre;
		this.audit_usuario = audit_usuario;
		this.tipo_usuario = tipo_usuario;
		this.acceso_activo = acceso_activo;
		this.tiempo_sesion = tiempo_sesion;
	}


}
