package com.java.plus.ionic.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.plus.ionic.project.domain.Categoria;
import com.java.plus.ionic.project.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository categoriaRepository;

	public Categoria find(Integer id) {
		Optional<Categoria> resultado = categoriaRepository.findById(id);
		return resultado.orElse(null);
	}
}
