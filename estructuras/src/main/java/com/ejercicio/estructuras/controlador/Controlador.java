package com.ejercicio.estructuras.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
	
	@PostMapping("/parImpar")
	public String ejercicio1(@RequestParam int numero){
		String cadena = "Hola Mundo";
		return cadena;
	}
}
