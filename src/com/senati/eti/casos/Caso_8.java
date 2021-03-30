package com.senati.eti.casos;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arrNombre = new ArrayList<String>();
		ArrayList<Integer> arrEdad = new ArrayList<Integer>();
		
		String rp = "S", nombre = "";
		int nr = 0, edad = 0;
		while (rp.equals("S") || rp.equals("s")) {
			nr++;
			
			System.out.println("REGISTRO N. " + nr);
			System.out.println("**************");
			
			System.out.print("Nombre..: ");
			nombre = sc.nextLine();
			
			System.out.print("Edad....: ");
			edad = sc.nextInt();
			
			arrNombre.add(nombre);
			arrEdad.add(edad);
			
			sc.nextLine();
			
			rp = "";
			while (!rp.equals("S") && !rp.equals("s") && !rp.equals("N") && !rp.equals("n")) {
			
				System.out.print("¿Continuar registro [S|N]?: ");
				rp = sc.nextLine();
				System.out.print("\n");
				
				if (!rp.equals("S") && !rp.equals("s") && !rp.equals("N") && !rp.equals("n")) {
					System.out.println("Solo escriba S o N");
				}
			}
		}
		
		//Impresion
		System.out.println("\n========================================================");
		System.out.println(" --         D A T O S    R E G I S T R A D O S         -- ");
		System.out.println("========================================================");
		
		System.out.println("Alumno(a) \tEdad   \t\tEstado \t\tEstado 2");
		System.out.println("--------------------------------------------------------");
		
		for (int i = 0; i < arrNombre.size(); i++) {
			System.out.println(arrNombre.get(i) + "\t\t" + arrEdad.get(i) + " años\t\t" +
					           VerMensaje(arrEdad.get(i)) + "\t" + VerEstado(arrEdad.get(i)));
		}

	}
	
	public static String VerMensaje(int edad) {
		String mensaje = "Menor de edad";
		
		if (edad >= 18) mensaje = "Mayor de edad";
		
		return mensaje;
	}
	// Crear métodos
	// Función (Método que devuelve un valor)
	public static String VerEstado(int edad) {
		String mensaje2 = "";
		if (edad > 0 && edad <= 10) mensaje2 = "Niñez";
		if (edad > 10 && edad <= 17) mensaje2 = "Adolescente";
		if (edad > 17 && edad <= 24) mensaje2 = "Juventud";
		if (edad > 24 && edad <= 59) mensaje2 = "Adulto";
		if (edad > 59) mensaje2 = "Adulto mayor";
		
		return mensaje2;
		
	}

}
