package com.java.plus.ionic.project.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.plus.ionic.project.domain.Cliente;
import com.java.plus.ionic.project.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@Autowired
	ClienteService clienteService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Cliente> find(@PathVariable Integer id) {
		Cliente result = clienteService.find(id);
		return ResponseEntity.ok().body(result);
	}

	@GetMapping
	public ResponseEntity<?> findAll() {
		List<Cliente> result = clienteService.findall();
		return ResponseEntity.ok().body(result);
	}
}
