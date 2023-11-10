package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/* ENTRADA: 8, 12 | RES. ESPERADO: 4 | RES. OBTENIDO 4
 * ENTRADA: -98 | RES. ESPERADO: ERROR | RES. OBTENIDO ERROR
 * ENTRADA: 8.3 | RES. ESPERADO: ERROR | RES. OBTENIDO ERROR
 * ENTRADA: numero | RES. ESPERADO: ERROR | RES. OBTENIDO ERROR
 */

public class Ejercicio04 {

	public static void main(String[] args) {
		// Variable para guardar los números a y b
		int a = -1, b = -1;
		//variable para guardar el mcd
		int mcd = 0;
		//creamos el escaner
		Scanner sc = new Scanner(System.in);
		
				
		//hacemos el try catch
		do {
			try {
				//preguntamos por los valores de a y b y los guardamos en sus respectivas variables
				System.out.println("Valor de a ");
				a = sc.nextInt();
				
				System.out.println("Valor de b ");
				b = sc.nextInt();
					
			}catch (InputMismatchException e) {
				System.out.println("El valor introducido no es correcto, introdúcelo otra vez");
				sc.nextLine();
			}
				
		} while (a < 0 || b < 0);
		
		//creamos un bucle en el cual igualamos i a un ternario que comprueba si b es mayor que a de forma que i es igual al numero menor de los dos
		for (int i = (a<b) ? a : b; i >= 1; i--) {
			//comprobamos si el modulo de a y b con cada numero es 0, si es asi es que ese es el mcd
			if (a%i == 0 && b%i == 0) {
				mcd = i;
				//paramos el bucle ya que no es necesario seguir
				break;
			}
		}
		
		//imprimimso el resultado
		System.out.println("El máximo común divisor de " + a + " y " + b + " es " + mcd);
		//cerramos el escaner
		sc.close();
	}

}
