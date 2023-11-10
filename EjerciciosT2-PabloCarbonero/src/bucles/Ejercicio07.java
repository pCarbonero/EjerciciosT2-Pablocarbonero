package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// variable para guardar el número
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
				System.out.print(j);	
			}//fin for j
			//creamos un tercer bucle que imprime los numeros invertidos
			for (int j2 = i-1; j2 > 0; j2--) {
				System.out.print(j2);				
			}//fin for j2
			//hacemos un println para hacer el salto de linea
			System.out.println("");		
		}//fin for i

	}

}