package com.example.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Estudiante;

@Controller
@RequestMapping("principales")
public class PrincipalController {

	@GetMapping("/inicio")
	public String inicio(Estudiante estudiante) {
		return "vistaInicio";
	}
}
