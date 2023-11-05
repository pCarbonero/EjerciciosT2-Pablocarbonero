package condicionales;

import java.util.Scanner;

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
