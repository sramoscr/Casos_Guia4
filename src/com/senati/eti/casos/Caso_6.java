package com.senati.eti.casos;

public class Caso_6 {

	public static void main(String[] args) {
		String[][] datos = {{"Joe Castillo", "Rosa Flores", "Ricardo Tello"},
				            {"Callao", "Puente Piedra", "Comas"}};
		
		// datos.length --> cantidad de filas de la matriz (z)
		
		//datos[].length --> cantidad de elementos del arreglo de la primera fila
		
		
		//Impresi�n de valores por filas
		System.out.println("----------------     IMPRESI�N POR FILAS     -----------------");
		for (int f = 0; f < datos.length; f++) {
			for (int c = 0; c < datos[0].length; c++)
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
			
			System.out.println();
		}
		//Impresi�n de valores por filas
			System.out.println("\n---------------     IMPRESI�N POR COLUMNAS     ---------------");
			for (int c = 0; c < datos[0].length; c++) {
				for (int f = 0; f < datos.length; f++)
					System.out.print(String.format("%-20s", datos[f][c]) + "\t");
				
				System.out.println();
		}

	}

}
