package com.java.plus.ionic.project.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.java.plus.ionic.project.domain.Categoria;
import com.java.plus.ionic.project.service.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	CategoriaService categoriaService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria result = categoriaService.find(id);
		return ResponseEntity.ok().body(result);
	}

	@GetMapping
	public ResponseEntity<?> findAll() {
		List<Categoria> result = categoriaService.findall();
		return ResponseEntity.ok().body(result);
	}

	@PostMapping
	public ResponseEntity<?> insert(Categoria categoria) {
		Categoria result = categoriaService.insert(categoria);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(result.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
