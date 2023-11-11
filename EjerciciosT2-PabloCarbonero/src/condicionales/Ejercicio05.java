package condicionales;

import java.util.Scanner;
/* ENTRADA: 9 | REL. ESPERADO: 9.0 | REL. OBTENIDO: 9.0
 * ENTRADA: -89 | REL. ESPERADO: 89.0 | REL. OBTENIDO: 89.0
 * ENTRADA: 0 | REL. ESPERADO: 0 | REL. OBTENIDO: 0
  * ENTRADA: -9.3 | REL. ESPERADO: 9.3 | REL. OBTENIDO: 9.3
 */
public class Ejercicio05 {

	public static void main(String[] args) {
		//creamos una variable para almacenar el numero introducido
		float num;
		//variable para el valor absoluto del número
		float abs;
		//creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//preguntamos al ususario por el número
		System.out.println("Escribe un número y te devolveré el valor absoluto ");
		//guardamos el número introducido en la variable num
		num = sc.nextFloat();
		
		//creamos el ternario que comprobará si el número es positivo, negativo o 0
		abs = (num >= 0) ? num : Math.abs(num);
		
		//Devolvemos el resultado por consola 
		System.out.println("El valor absoluto de " + num + " es " + abs);
		
		//cerramos el escaner
		sc.close();

	}

}
