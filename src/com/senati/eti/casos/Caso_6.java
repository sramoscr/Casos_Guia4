package com.senati.eti.casos;

public class Caso_6 {

	public static void main(String[] args) {
		String[][] datos = {{"Joe Castillo", "Rosa Flores", "Ricardo Tello"},
				            {"Callao", "Puente Piedra", "Comas"}};
		
		// datos.length --> cantidad de filas de la matriz (z)
		
		//datos[].length --> cantidad de elementos del arreglo de la primera fila
		
		
		//Impresión de valores por filas
		System.out.println("----------------     IMPRESIÓN POR FILAS     -----------------");
		for (int f = 0; f < datos.length; f++) {
			for (int c = 0; c < datos[0].length; c++)
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
			
			System.out.println();
		}
		//Impresión de valores por filas
			System.out.println("\n---------------     IMPRESIÓN POR COLUMNAS     ---------------");
			for (int c = 0; c < datos[0].length; c++) {
				for (int f = 0; f < datos.length; f++)
					System.out.print(String.format("%-20s", datos[f][c]) + "\t");
				
				System.out.println();
		}

	}

}
