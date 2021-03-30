package com.senati.eti.casos;

import java.util.Scanner;

public class Caso_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] numero = new int[3][4];
		
		
		System.out.println("------------------------");
		System.out.println("   LECTURA DE NÚMEROS   ");
		System.out.println("------------------------");
		
		int num_mayor = 0;
		int num_menor = 0;
		int sumatoria = 0;
		float promedio = 0;
		
		for (int f = 0; f < numero.length; f++) {
			System.out.println("\nDatos de la Fila: "+ (f + 1));
			System.out.println("-------------------");
			for (int c = 0; c < numero[0].length; c++) {
				System.out.print("Número " + (c + 1) + ": ");
				numero[f][c] = sc.nextInt(); 
				
				
				if (f == 0 && c == 0) {
					num_mayor = numero[0][0];
					num_menor = numero[0][0];
					
				}
				
				if (numero[f][c] > num_mayor) num_mayor = numero[f][c]; 
				if (numero[f][c] < num_menor) num_menor = numero[f][c]; 
				
					
			
				sumatoria += numero[f][c];
				promedio = (float)sumatoria / 12;
			}
			
		}
		
		
		System.out.println("\n------------------");
		System.out.println(" -- RESULTADOS -- ");
		System.out.println("------------------");
		System.out.println("Número mayor...: " + num_mayor);
		System.out.println("Número menor...: " + num_menor);
		System.out.println("Suma de todos los números.......: " + sumatoria);
		System.out.println("Promedio de todos los números...: " + promedio);
		
	}

}