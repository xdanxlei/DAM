package Ejercicio3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String dia;
		
		System.out.printf("Escribe el d�a de la semana: ");
		
Scanner d = new Scanner(System.in);

dia = d.nextLine();
		
	dia = dia.toLowerCase();
	
	d.close();
	
	if("lunes" .equals(dia)) {
		
		System.out.println("Bases de datos.");
	}
	
	if("martes" .equals(dia)) {
		
		System.out.println("Sistemas inform�ticos.");
	}
	if("mi�rcoles" .equals(dia) || "miercoles" .equals(dia)) {
	
	System.out.println("Bases de datos.");
}

	if("jueves" .equals(dia)) {
	
	System.out.println("Sistemas inform�ticos.");
}

	
	if("viernes" .equals(dia)) {
		
		System.out.println("Programaci�n.");
}

	if("sabado" .equals(dia) || "s�bado" .equals(dia)) {
		
		System.out.println("No hay clase");
}

	if("domingo" .contentEquals(dia)) {
		
		System.out.println("No hay clase");
	}
	
	}

}
