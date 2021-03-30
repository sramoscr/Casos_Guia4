package com.senati.eti.casos;

import java.util.Scanner;

public class Caso_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] numero = new int[3][4];
		
		
		System.out.println("------------------------");
		System.out.println("   LECTURA DE N�MEROS   ");
		System.out.println("------------------------");
		
		int num_mayor = 0;
		int num_menor = 0;
		int sumatoria = 0;
		float promedio = 0;
		
		for (int f = 0; f < numero.length; f++) {
			System.out.println("\nDatos de la Fila: "+ (f + 1));
			System.out.println("-------------------");
			for (int c = 0; c < numero[0].length; c++) {
				System.out.print("N�mero " + (c + 1) + ": ");
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
		System.out.println("N�mero mayor...: " + num_mayor);
		System.out.println("N�mero menor...: " + num_menor);
		System.out.println("Suma de todos los n�meros.......: " + sumatoria);
		System.out.println("Promedio de todos los n�meros...: " + promedio);
		
	}

}