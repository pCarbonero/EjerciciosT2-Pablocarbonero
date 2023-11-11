package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/* ENTRADA: 8, 9 | RES. ESPERADO: 72 | RES. OBTENIDO 72
 * ENTRADA: 6, 12 | RES. ESPERADO: 12 | RES. OBTENIDO 12
 * ENTRADA: 8.3 | RES. ESPERADO: ERROR | RES. OBTENIDO ERROR
 * ENTRADA: numero | RES. ESPERADO: ERROR | RES. OBTENIDO ERROR
 */

public class Ejercicio05 {

	public static void main(String[] args) {
		// Variable para guardar los números a y b
				int a = -1, b = -2;
				//variable para guardar el mcm
				int mcm = 0;
				//creamos el escaner
				Scanner sc = new Scanner(System.in);
				
				//creamos el trycatch
				do {
					try {
						//preguntamos por los valores de a y b y los guardamos en sus respectivas variables
						System.out.println("Valor de a ");
						a = sc.nextInt();
						
						System.out.println("Valor de b ");
						b = sc.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("El valor introducido no es correcto, introdúcelo otra vez");
						//limpiamos el escaner para poder almacenar un nuevo input
						sc.nextLine();
					}
					
				} while (a < 0 || b < 0);
				
												
				//creamos un bucle en el cual igualamos i a un ternario que comprueba si b es mayor que a de forma que i es igual al numero mayor de los dos
				for (int i = (a>b) ? a : b; i >= 1; i++) {					
					//comprobamos si el modulo de a y b con cada numero es 0, si es asi es que ese es el mcm
					if (i%a == 0 && i%b == 0) {
						mcm = i;
						//paramos el bucle ya que no es necesario seguir
						break;
					}
				}//fin bucle 
				
				//imprimimso el resultado
				System.out.println("El mínimo común múltiplo de " + a + " y " + b + " es " + mcm);
				//cerramos el escaner
				sc.close();

	}// fin main

}//fin class
