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
	
	@PostMapping("/promedioCalificaciones")
	public String ejercicio3(@RequestParam String cadena) {
		String separador = ",";
		String respuesta = "";
		String [] notas = cadena.split(separador);
		int suma = 0;
		for (int i = 0; i< notas.length; i++) {
			int calificacion = Integer.valueOf(notas[i]);
			suma+= suma + calificacion;
		}
		int promedio = suma / notas.length;
		if (promedio >= 5) {
			respuesta+= "Promedio de aprobado";
		} else {
			respuesta+= "Promedio de suspenso";
		}
		
		return "<h1>" + respuesta + "</h1>";
	}
	
	@PostMapping("/calcularIMC")
	public String ejercicio4(@RequestParam double peso, double altura) {
		double valor = 0;
		String estado = "";
		valor = peso /(altura * altura);
		if (valor < 18.5) {
			estado += "Bajo peso";
		}
		if (valor >= 18.5 && valor <= 24.9) {
			estado += "Peso ideal";
		}
		if (valor >= 25 && valor <= 29.9) {
			estado += "Sobrepeso";
		}
		if (valor >= 30 && valor <= 34.9) {
			estado += "Obesidad leve";
		}
		if (valor >= 35 && valor <= 39.9) {
			estado += "Obesidad moderada";
		}
		if (valor >= 40) {
			estado += "Obsesidad mórvida";
		}
		
		String r_valor = "<h1>El índice de masa corporal es: " + valor +" </h1>";
		String r_estado = "<h1>Eso se traduce a un nivel de: " + estado + "</h1>";
		String respuesta = r_valor + "<br/> <br/>" + r_estado;
		
		return respuesta;
	}
	
	@PostMapping("/encuesta")
	public String ejercicio5 (@RequestParam int valoracion) {
		String respuesta = "<h1> Gracias por su colaboracion </h1> <br/> <br/> <h2> Su valoracion ha sido de: " + valoracion + "</h2>";
		
		return respuesta;
	}
	
	@PostMapping("/generarContrasena")
	public String ejercicio6 (@RequestParam int longitud) {
		String respuesta = "";
		String resultado = "";
		String generacion = "";
		if (longitud <= 0) {
			resultado += "Longitud no valida";
			generacion += "No se ha podido generar ninguna contraseña";
		} else {
			for (int i = 0; i < longitud; i++) {
				int val = (int)Math.random() * 10;
				generacion += val;
			}
		}
		respuesta += "<h1>" + resultado + "<br/> <br/> <h2> La contraseña resultante es: " + generacion + "</h2>";
		
		return respuesta;
	}
	
	@PostMapping("/sumatoria")
	public String ejercicio7 (@RequestParam int numero) {
		String respuesta = "";
		int sumatoria = 0;
		if (numero <= 0) {
			respuesta += "<h1>Ha introducido un numero que no es valido</h1>";
		} else {
			for (int i = 0; i <= numero; i++) {
				sumatoria += sumatoria + i;
			}
			respuesta = "<h1> El resultado de todos los numeros entre 0 y " + numero + " es " + sumatoria + "</h1>" ;
		}
		
		return respuesta;
	}
	
	@PostMapping("/factorial")
	public String ejercicio8 (@RequestParam int numero) {
		String respuesta = "";
		int factorial = 1;
		if (numero <= 0) {
			respuesta += "<h1>Ha introducido un numero que no es valido</h1>";
		} else {
			for (int i = 1; i <= numero; i++) {
				factorial += factorial * i;
			}
			respuesta = "<h1> El factorial de " + numero + " es " + factorial + "</h1>" ;
		}
		
		return respuesta;
	}
}
