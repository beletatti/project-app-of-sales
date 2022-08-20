package com.java.plus.ionic.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.plus.ionic.project.domain.Cliente;
import com.java.plus.ionic.project.exception.ObjectNotFoundException;
import com.java.plus.ionic.project.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = clienteRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

	public List<Cliente> findall() {
		List<Cliente> obj = clienteRepository.findAll();
		return obj;
	}
}
