package com.java.plus.ionic.project.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
