package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);	
		
		System.out.println("Ingrese su nombre de usuario: ");
		String nombreUsuario = entrada.next();
		
		System.out.println("Ingrese la cantidad de misiones completadas: ");
		int cantidadMisiones = entrada.nextInt();
		
		String NivelJugador;
		if (cantidadMisiones == 0) {
			// Novato
			NivelJugador = "Jugador Novato";
		} else if (cantidadMisiones >= 1 && cantidadMisiones <= 5) {
			// Pricipiante
			NivelJugador = "Jugador Principiante";
		} else if (cantidadMisiones >= 6 && cantidadMisiones <= 15) {
			// Desarrollador Pro
			NivelJugador = "Jugador Experimentado";
		} else if (cantidadMisiones >= 16) { 
			// Dueño de Estudio
			NivelJugador = "Jugador Veterano";
		} else {
			NivelJugador = "VALOR INCORRECTO";
		}
		
		
		System.out.println("Nombre de usuario: " + nombreUsuario);
		System.out.println("Cantidad de misiones completadas: " + cantidadMisiones);
		System.out.println("Nivel de jugador: " + NivelJugador);
		
	}

}