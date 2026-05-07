package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de partidos jugados por el jugador: ");
		int cantpart = entrada.nextInt();
		int sumaGoles = 0;
		int cantGoles = 0;
		for (int i = 0; i < cantpart; i++) {
	
			System.out.println("Ingrese la cantidad de goles en el "+ (i+1) +"partido: ");
			cantGoles = entrada.nextInt();
	       sumaGoles += cantGoles;  
	    		   
		}
		
		
		double promedio  = (double) sumaGoles / (double) cantpart ;
		
		System.out.println("Los goles totales son: " +sumaGoles);
		
		System.out.println("El promedio es: " +promedio);
		
	}

}
