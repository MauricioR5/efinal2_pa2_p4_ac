package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

	private IEstudianteRepository estudianteRepository;
	@Override
	public void agregar(Estudiante estudiante) {
		this.estudianteRepository.insertar(estudiante);
	}

	@Override
	public void borrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Estudiante actualizar(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
