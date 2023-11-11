package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		//variable para el número inicial
		int num = -1;
		//variable para guardar el siguiente número
		int ans;
		//variable para guardar el número mayor
		int greater = 0;
		//variable para guardar el número de fallos y de numeros introducidos
		int failCount = 0;
		int numberCount = 0;
		//creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//tryCatch
		do {
			try {
			//preguntamos por el número
			System.out.println("Dime un número inicial ");
			//guardamos el valor introducido en la variable
			num = sc.nextInt();
			greater = num;
			//en caso de no introducir número imprimimos el siguiente mensaje		
			}catch (InputMismatchException e) { 
				System.out.println("Asegurate de introducir carácteres numéricos ");
				//"limpiamos" el escaner para introducir de nuevo por consola algo
				sc.nextLine();
				}//fin catch	
		} while (num < 0);
		
		do {
			//Preguntamos por el siguiente número
			System.out.println("Escribe el siguiente número ");
			//guardamos el número en la variable ans
			ans = sc.nextInt();
			
			//si el número introducido es menor al anterior y distinto de cero cuenta un fallo
			if (ans <= greater && ans != 0) {
				System.out.println("Has fallado");
				failCount++;
			}
			//convertimos el numero que tendrá que comparar luego con el ultimo introducido
			greater = ans;
			numberCount++;
		} while (ans > 0);
		
		//imprimimos el resultado final
		System.out.println("Total números introducidos " + numberCount);
		System.out.println("Total fallos " + failCount);
		//cerramos el escaner
		sc.close();
	}//fin main

}//fin class
