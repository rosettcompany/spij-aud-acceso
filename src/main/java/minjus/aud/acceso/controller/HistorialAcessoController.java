package minjus.aud.acceso.controller;

import java.util.List;

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
//@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class HistorialAcessoController {


	@Autowired
	private IHistorialAcessoService historialAcessoService;
	
	

	@RequestMapping(value = "/listaHistorial", method = RequestMethod.GET)
	public ResponseEntity<List<HistorialAcessoEntity>> getHistorial() throws Exception {
		
		List<HistorialAcessoEntity> listaHistorial = historialAcessoService.findAll();

		return ResponseEntity.ok(listaHistorial);

	}
	
	
	@RequestMapping(value="/registrar/acceso",method = RequestMethod.POST)
	public ResponseEntity<?> registrarAcceso(@RequestBody HistorialAcessoEntity aud) throws Exception{
		
		
		historialAcessoService.registrarAcceso(aud);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value="/cierresesion",method = RequestMethod.POST)
	public ResponseEntity<?> cierresesion(@RequestBody HistorialAcessoEntity aud) throws Exception{
		
		historialAcessoService.cierreSesion(aud);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
