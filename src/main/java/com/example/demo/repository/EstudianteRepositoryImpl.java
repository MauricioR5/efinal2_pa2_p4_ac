package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;

@Repository
public class EstudianteRepositoryImpl implements IEstudianteRepository{

	private EntityManager entityManager;
	
	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
		
	}
	
	@Override
	public void eliminar(Estudiante estudiante) {
		this.entityManager.remove(estudiante);
	}

	@Override
	public Estudiante buscar(String cedula) {
		return null;
	}

	@Override
	public Estudiante actualizar(Estudiante estudiante) {
		this.entityManager.merge(estudiante);
		return estudiante;
	}

	



}
