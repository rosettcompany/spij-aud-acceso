package minjus.aud.acceso.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import minjus.aud.acceso.entity.HistorialAcessoEntity;
import minjus.aud.acceso.service.IHistorialAcessoService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class HistorialAcessoController {


	@Autowired
	private IHistorialAcessoService historialAcessoService;
	
	@RequestMapping(value="/registrar/acceso",method = RequestMethod.POST)
	public ResponseEntity<?> registrarAcceso(@RequestBody HistorialAcessoEntity aud) throws Exception{
		historialAcessoService.registrarAcceso(aud);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value="/cierre/sesion",method = RequestMethod.POST)
	public ResponseEntity<?> cierresesion(@RequestBody HistorialAcessoEntity aud) throws Exception{
		
		historialAcessoService.cierreSesion(aud);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/verificar/sesion", method = RequestMethod.POST)
	public ResponseEntity<?> verificarSesion(@RequestBody HistorialAcessoEntity aud) throws Exception {
		try {
		String resultado = historialAcessoService.verificarSesion(aud);
		System.out.print("controller: "+ resultado);
	    return new ResponseEntity<>(resultado, HttpStatus.OK);}
		catch (Error e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error al procesar la solicitud: " + e.getMessage());
		}
	}
	
	@RequestMapping(value="/ultima/sesion",method = RequestMethod.POST)
	public ResponseEntity<?> ultimaSesion(@RequestBody HistorialAcessoEntity aud) throws Exception{
		String resultado = historialAcessoService.ultimaSesion(aud);
		return new ResponseEntity<>(resultado,HttpStatus.OK);
	}

}
