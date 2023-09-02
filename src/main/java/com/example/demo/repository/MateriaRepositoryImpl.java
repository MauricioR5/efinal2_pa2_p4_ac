package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Materia;

import jakarta.persistence.EntityManager;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepository{

	private EntityManager entityManager;
	@Override
	public void insertar(Materia materia) {
		this.entityManager.persist(materia);
	}

	@Override
	public void eliminar(Materia materia) {
		this.entityManager.remove(materia);
	}

	@Override
	public Materia buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Materia actualizar(String codigo) {
		this.entityManager.merge(codigo);
		return null;
	}

}
