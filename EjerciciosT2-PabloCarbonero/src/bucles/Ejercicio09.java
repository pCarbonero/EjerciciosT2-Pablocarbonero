package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
/* ENTRADA: 965 | RES. ESPERADO: 3 | RES. OBTENIDO: 3
 * ENTRADA: 20 | RES. ESPERADO: 2 | RES. OBTENIDO: 2
 * ENTRADA: 6 | RES. ESPERADO: 1 | RES. OBTENIDO: 1
 * ENTRADA: 8.3 | RES. ESPERADO: ERROR | RES. OBTENIDO: ERROR
 * ENTRADA: numero | RES. ESPERADO: ERROR | RES. OBTENIDO: ERROR
 */
public class Ejercicio09 {

	public static void main(String[] args) {
		//variable para guardar el número
		int num = -1, res = 0;
		//creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//hacemos el try catch
		do {
			try {
				//preguntamos por el num
				System.out.println("DI NUMEROO");
				//guardamos el valor en la variable
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				//imprimimos el mensaje si hay un error
				System.out.println("El valor introducido no es correcto ");
				//limpiamos el escaner para poder introducir un nuevo valor
				sc.nextLine();
			}
		} while (num < 0);

		
		//bucle que dividirá entre diez hasta que el numero sea distinto de 0
		while (num > 0) {
			num = num/10;
			res++;//por cada iteracion se suma uno, como el número de iteraciones es el numero de cirfas ese es el resultado
		}
		
		System.out.println("El número introducido tiene " + res + " cifras ");
		
		//cerramos el escaner
		sc.close();
	}//fin main
}//fin class
