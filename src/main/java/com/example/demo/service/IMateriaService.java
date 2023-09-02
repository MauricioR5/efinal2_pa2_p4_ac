package com.example.demo.service;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaService {
	
	public void agregar();
	public void borrar();
	public Materia actualizar(String codigo);
	
}
