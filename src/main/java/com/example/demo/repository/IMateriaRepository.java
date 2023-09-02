package com.example.demo.repository;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaRepository {

	public void insertar(Materia materia);
	public void eliminar(Materia materia);
	public Materia buscar(Integer id);
	public Materia actualizar(String codigo);
}
