package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		// Cast -> Convertir de un tipo de dato a otro
		int rpta1 = (int) Math.pow(5, 3);
		// Raíz cuadrada -> base elevada a la inversa del exponente
		float rpta2 = (float) Math.pow(81, 1/2.0);
		float rpta3 = (float) Math.pow(125, 1/3.0);
		float rpta4 = (float) Math.pow(256, 1/4.0);
		float rpta5 = (float) Math.pow(25, 1/2.0);
		float suma = rpta4 + rpta5;
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Respuesta 1...: " + rpta1);
		System.out.println("Respuesta 2...: " + rpta2);
		System.out.println("Respuesta 3...: " + rpta3);
		System.out.println("Respuesta 4...: " + rpta4);
		System.out.println("Respuesta 5...: " + rpta5);
		System.out.println("La Suma de rpta4 + rpta5.....: " + suma);

	}

}
