package com.example.demo.repository;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {

	public void insertar(Estudiante estudiante);
	public void eliminar(Estudiante estudiante);
	public Estudiante buscar(String cedula);
	public Estudiante actualizar(Estudiante estudiante);
}
