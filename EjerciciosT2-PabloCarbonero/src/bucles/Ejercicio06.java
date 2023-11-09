package bucles;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		//creamos la variable para el numero n
		int n = -1;
		//creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//creamos el trycatch 
		do {
			try {
			//preguntamos por el número
			System.out.println("Dime un número del 1 al 20 ");
			//guardamos el valor introducido en la variable
			n = sc.nextInt();
			//en caso de no introducir número imprimimos el siguiente mensaje		
			}catch (InputMismatchException e) { 
				System.out.println("Asegurate de introducir carácteres numéricos ");
				//"limpiamos" el escaner para introducir de nuevo por consola algo
				sc.nextLine();
				}//fin catch				
		} while (n < 0 || n > 20 || n == 0);

		//creamos un bucle que imprimirá el número i que será el correspondiente
		for (int i = 1; i <= n; i++) {
			//creamos un bucle que imprimirá el números tantas veces sea su valor
			for (int j = 1; j <= i; j++) {
				System.out.print(i);			
			}//fin for j
			//hacemos un println para hacer el salto de linea
			System.out.println("");		
		}//fin for i
		
		//cerramos el escaner
		sc.close();
	}

}
