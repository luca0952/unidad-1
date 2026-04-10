package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		char decision = ' ' ;
		
		do {
			System.out.println("1-Registrar puntaje 📥");
			System.out.println("2-Mostrar mejor puntaje 👑");
			System.out.println("3-Salir 🚪");

			System.out.println("elija una de las opciones: ");
			int opciones = entrada.nextInt();
			int puntajeMax = 0;
			switch (opciones) {
			case 1:
				System.out.println("Ingrese su puntaje: ");
				int puntaje = entrada.nextInt();
				if (puntaje > puntajeMax) {
					System.out.println("Usted tiene el puntaje Maximo");
					puntaje = puntajeMax;
				} else if (puntaje < puntajeMax) {
					System.out.println("usted tiene: " + puntaje + ".El puntaje maximo es " + puntajeMax);
				} else {
					System.out.println("ERROR");
				}
				break;
 
			case 2:
				System.out.println("El récord actual es: " + puntajeMax + " puntos");
				break;
			case 3:
				System.out.println("desea salir del programa S para si y N para no: ");
				decision = entrada.next().charAt(0);
				break;
			default:
				System.out.println("ERROR");
				break;
			}

		} while (decision != 's' || decision != 'S');
		System.out.println("PROGRAMA FINALIZADO");
	}
}
