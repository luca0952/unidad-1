package ejercicio1;

import java.util.Scanner;

public class ejemplo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);	
		
		System.out.println("Escriba el nombre de la experiencia: ");
		String nombreExperiencia = entrada.next();
		
		System.out.println("Ingrese cantidad de visitas: ");
		int cantidadVisitas = entrada.nextInt();
		
		System.out.println("Ingrese el precio de entrada: ");
		int precioEntrada = entrada.nextInt();
		
		System.out.println("El juego esta en la lista de destacados? "
				+ "Ingrese S para Sí o cualquier otra cosa para No");
		char decision = entrada.next().charAt(0);
		
		boolean esDestacado;
		if (  decision == 's' ||  decision=='S'  ) {
			esDestacado = true;
		} else {
			esDestacado = false;
		}
		
		int ganancia = cantidadVisitas * precioEntrada;
		
		
		
		String rangoDesarrollador;
		if (cantidadVisitas >= 0 && cantidadVisitas <=1000) {
			// Novato
			rangoDesarrollador = "Novato";
		} else if (cantidadVisitas >= 1001 && cantidadVisitas <=50000) {
			// Promesa
			rangoDesarrollador = "Promesa";
		} else if (cantidadVisitas >= 50001 && cantidadVisitas <=500000) {
			// Desarrollador Pro
			rangoDesarrollador = "Desarrollador Pro";
		} else if (cantidadVisitas >= 500001) { 
			// Dueño de Estudio
			rangoDesarrollador = "Dueño de Estudio";
		} else {
			rangoDesarrollador = "VALOR INCORRECTO";
		}
		
		
		System.out.println("Experiencia: " + nombreExperiencia);
		System.out.println("Cantidad de visitas: " + cantidadVisitas);
		System.out.println("Precio de entrada: " + precioEntrada + "Robux");
		System.out.println("Estado en Front Page: " + esDestacado);
		System.out.println("Ganancia: " + ganancia + "Robux");
		System.out.println("Rango del desarrollador: " + rangoDesarrollador);
		
		
	}

}