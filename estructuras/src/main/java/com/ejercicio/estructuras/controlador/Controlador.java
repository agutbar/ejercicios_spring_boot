package com.ejercicio.estructuras.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
	
	@PostMapping("/parImpar")
	public String ejercicio1(@RequestParam int numero){
		String respuesta = "";
		if (numero % 2 == 0) {
			respuesta += "El numero " + numero + " es par";
		} else {
			respuesta += "El numero " + numero + " es impar";
		}
		return "<h1>" + respuesta + "</h1>";
	}
	
	@PostMapping("/tablaMultiplicar")
	public String ejercicio2(@RequestParam int numero) {
		String abertura = "<table>";
		String cierre = "</table>";
		String cabecera = "<tr><th>Múltiplo</th><th>Resultado</th></tr>";
		String respuesta = abertura + cabecera;
		for (int i = 1; i<=10; i++) {
			int cociente = numero * i;
			respuesta += "<tr><td>" + i + "</td><td>" + cociente + "</td></tr>";
		}
		respuesta+= cierre;
		
		return respuesta;
	}
}
