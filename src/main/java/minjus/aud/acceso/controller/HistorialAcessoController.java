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

import minjus.aud.acceso.entity.ClienteEntity;
import minjus.aud.acceso.entity.HistorialAcessoEntity;
import minjus.aud.acceso.service.IClienteService;
import minjus.aud.acceso.service.IHistorialAcessoService;
import minjus.aud.acceso.service.impl.ClienteServiceImpl;

@RestController
//@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/apiBus")
public class HistorialAcessoController {

	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IHistorialAcessoService historialAcessoService;
	
	
	@RequestMapping(value = "/listaClientes", method = RequestMethod.GET)
	public ResponseEntity<List<ClienteEntity>> getClientes() throws Exception {
		System.out.println("Hola");
		List<ClienteEntity> listaClientes = clienteService.findAll();

		return ResponseEntity.ok(listaClientes);

	}

	@RequestMapping(value = "/listaHistorial", method = RequestMethod.GET)
	public ResponseEntity<List<HistorialAcessoEntity>> getHistorial() throws Exception {
		System.out.println("Hola");
		List<HistorialAcessoEntity> listaHistorial = historialAcessoService.findAll();

		return ResponseEntity.ok(listaHistorial);

	}
	
	
	@RequestMapping(value="/audAcceso/registrar",method = RequestMethod.POST)
	public ResponseEntity<?> registrarAcceso(@RequestBody HistorialAcessoEntity aud) throws Exception{
		
		
		String data = historialAcessoService.registrarAcceso(aud);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}

	@RequestMapping(value="/cierresesion",method = RequestMethod.POST)
	public ResponseEntity<?> registrarClienteCelular(@RequestBody HistorialAcessoEntity aud) throws Exception{
		
		String data = historialAcessoService.cierreSesion(aud);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
}
