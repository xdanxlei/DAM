package Ejercicio3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		char opc;
		
		int suma = 0;
		
		System.out.println("Comienza el test de infidelidad, responda con V si es verdadero y con F si es falso.");
		
		Scanner elec = new Scanner(System.in);
		
		System.out.println("Tu pareja suele estar mas inquieta de lo normal sin motivo aparente: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
		
			suma = suma + 3;

		} else suma = suma + 0;
		
		System.out.println("Ha aumentado sus gastos de vestuario: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
			
		} else suma = suma + 0;
		
		System.out.println("Ha perdido el inter�s que mostraba anteriormente por ti: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
		}else suma = suma + 0;
		
		System.out.println("Ahora se arregla el pelo y se asea con m�s frecuencia: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
		}else suma = suma + 0;
		
		System.out.println("No te deja que mires la agenda de su tel�fono m�vil: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
		}else suma = suma + 0;
		
		System.out.println("A veces tiene llamadas que dice no querer contestar cuando est�s t� delante: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
		}else suma = suma + 0;
		
		System.out.println("�ltimamente se preocupa m�s en cuidar la l�nea y/o estar bronceado/a: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
		}else suma = suma + 0;
		
		System.out.println("Muchos d�as viene tarde despu�s de trabajar porque dice tener mucho m�s trabajo: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
		} else suma = suma + 0;
		
		System.out.println("Has notado que �ltimamente se perfuma m�s: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
		}else suma = suma + 0;
		
		System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
		}else suma  = suma + 0;
		
		if(suma >= 0 & suma <= 10) {
			
			System.out.println("�Enhorabuena tu pareja parece ser totalmente fiel!");
			
		}
		
		if(suma >= 11 & suma <= 22) {
			
			System.out.println("Quizas exista el peligro de otra persona en su vida o en su mente, aunque seguramente ser� algo sin importancia. No bajes la guardia.");
			
		}
		
		if(suma >= 22 & suma <= 30) {
			
			System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco m�s y averig�es que es lo que est� pasando por su cabeza");
		}
	}
	
}
