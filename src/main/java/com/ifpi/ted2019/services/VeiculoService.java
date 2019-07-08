package com.ifpi.ted2019.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifpi.ted2019.domain.Veiculo;
import com.ifpi.ted2019.repositories.VeiculoRepository;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository repository;
	
	public Veiculo buscar(Integer id) {
		Optional<Veiculo> object = repository.findById(id);
		return object.orElse(null);
	}
}
