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
import minjus.aud.acceso.service.IClienteService;
import minjus.aud.acceso.service.impl.ClienteServiceImpl;

@RestController
//@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/apiBus")
public class BusApiController {

	@Autowired
	private IClienteService clienteService;

	@RequestMapping(value = "/listaClientes", method = RequestMethod.GET)
	public ResponseEntity<List<ClienteEntity>> getClientes() throws Exception {
		System.out.println("Hola");
		List<ClienteEntity> listaClientes = clienteService.findAll();

		return ResponseEntity.ok(listaClientes);

	}

}
