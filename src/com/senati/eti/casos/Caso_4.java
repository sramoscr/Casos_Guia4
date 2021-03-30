package com.senati.eti.casos;

import java.util.Scanner;

public class Caso_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declarar el arreglo
		int[]numero = new int[5];
		
		System.out.println("============================");
		System.out.println("     INGRESO DE NÚMEROS     ");
		System.out.println("============================");
		
		int num_pares = 0, num_impares = 0, sumatoria = 0;
		float promedio = 0;
		
		//Leer los datos para el arreglo
		for (int x = 0; x < numero.length; x++) {
			System.out.print("Número " + (x + 1) + ": ");
			numero[x] = sc.nextInt();
			
			if (numero[x] % 2 == 0) {
				
				num_pares++;
			}
			else 
				num_impares++;
			
			
		sumatoria += numero[x];	
		promedio = (float)sumatoria / 5;
		}
		
		System.out.println("\n-------------------------------------");
		System.out.println("         R E S U L T A D O S         ");
		System.out.println("-------------------------------------");
		System.out.println("Cantidad de números pares......: " + num_pares);
		System.out.println("Cantidad de números impares....: " + num_impares);
		System.out.println("Promedio de los números........: " + promedio);

	}

}

