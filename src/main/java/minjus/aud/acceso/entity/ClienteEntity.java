package minjus.aud.acceso.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OrderBy;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;

@Entity
@Table(name = "cliente")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "f_registrar_cliente_fb", procedureName = "f_registrar_cliente_fb", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apellidos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_celular", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_correo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iddispositivo", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_urlfoto", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_facebook_id", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apple_id", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class), }),
		
		@NamedStoredProcedureQuery(name = "f_registrar_cliente_gmail", procedureName = "f_registrar_cliente_gmail", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apellidos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_celular", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_correo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iddispositivo", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_urlfoto", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_facebook_id", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apple_id", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class), }),
		
		@NamedStoredProcedureQuery(name = "f_registrar_cliente_celular", procedureName = "f_registrar_cliente_celular", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apellidos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_celular", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_correo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iddispositivo", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_urlfoto", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_facebook_id", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apple_id", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_registrar_clienteprueba3", procedureName = "f_registrar_clienteprueba3", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "numero", type = int.class), }),

		@NamedStoredProcedureQuery(name = "f_actualizar_cliente", procedureName = "f_actualizar_cliente", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcliente", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apellidos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iddispositivo", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_celular", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_contrasenia", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_correo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_tipodocumento", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_numerodocumento", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_latitud", type = double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_longitud", type = double.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "numero", type = int.class),
		// @StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type
		// = String.class)
		}),

		@NamedStoredProcedureQuery(name = "f_eliminar_cliente", procedureName = "f_eliminar_cliente", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcliente", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "numero", type = int.class),
		// @StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type
		// = String.class)
		}),

		@NamedStoredProcedureQuery(name = "f_listarClientePorId_cliente", procedureName = "f_listarClientePorId_cliente", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcliente", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "numero", type = String.class),
		// @StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type
		// = String.class)
		}),

})

public class ClienteEntity {

	@Id
	@Column(name = "idcliente")
	@OrderBy("idcliente")
	public int idcliente;

	@Column(name = "nombres")
	public String nombres;

	@Column(name = "apellidos")
	public String apellidos;

	@Column(name = "iddispositivo")
	public int iddispositivo;

	@Column(name = "fecharegistro")
	public Date fecharegistro;

	@Column(name = "celular")
	public int celular;

	@Column(name = "password")
	public String password;

	@Column(name = "correo")
	public String correo;

	@Column(name = "urlfoto")
	public String urlfoto;

	@Column(name = "tipodocumento")
	public int tipodocumento;

	@Column(name = "numerodocumento")
	public String numerodocumento;

	@Column(name = "facebook_id")
	public String facebook_id;

	@Column(name = "apple_id")
	public String apple_id;

	@Column(name = "latitud")
	public double latitud;

	@Column(name = "longitud")
	public double longitud;

	@Column(name = "estado")
	public int estado;

	public ClienteEntity() {
		super();
	}

	@JsonCreator
	public ClienteEntity(int idcliente, String nombres, String apellidos, int iddispositivo, Date fecharegistro,
			int celular, String password, String correo, String urlfoto, int tipodocumento, String numerodocumento,
			String facebook_id, String apple_id, double latitud, double longitud, int estado) {
		super();
		this.idcliente = idcliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.iddispositivo = iddispositivo;
		this.fecharegistro = fecharegistro;
		this.celular = celular;
		this.password = password;
		this.correo = correo;
		this.urlfoto = urlfoto;
		this.tipodocumento = tipodocumento;
		this.numerodocumento = numerodocumento;
		this.facebook_id = facebook_id;
		this.apple_id = apple_id;
		this.latitud = latitud;
		this.longitud = longitud;
		this.estado = estado;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombres() {
		return nombres;

	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;

	}

	public int getIddispositivo() {
		return iddispositivo;
	}

	public void setIddispositivo(int iddispositivo) {
		this.iddispositivo = iddispositivo;
	}

	public Date getFecharegistro() {
		return fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getUrlfoto() {
		return urlfoto;
	}

	public void setUrlfoto(String urlfoto) {
		this.urlfoto = urlfoto;
	}

	public int getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public String getFacebook_id() {
		return facebook_id;
	}

	public void setFacebook_id(String facebook_id) {
		this.facebook_id = facebook_id;
	}

	public String getApple_id() {
		return apple_id;
	}

	public void setApple_id(String apple_id) {
		this.apple_id = apple_id;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
