package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//creamos variable para guaradar el número
		int num = -1, aux;
		//creamos variable para guardar el nuemro alreves y el ultimo número
		int inv = 0, last, trys;
		//creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		
		//hacemos el trycatch
		do {
			try {
				//preguntamos por el numero
				System.out.println("Dime un número mayor que 0 ");
				//guardamos el número en la variable num
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Asegurate de introducir carácteres numéricos ");
				//"limpiamos" el escaner para introducir de nuevo por consola algo
				sc.nextLine();
			}
		} while (num < 0);
		
		aux = num;
		
		while (aux > 0) {
			last = aux%10;
			inv = inv * 10 + last;
			aux/=10;
		}
		
		if (inv == num) {
			System.out.println("CApicua");
		}else {
			System.out.println("NO CApicua");
		}
		

	}//fin main

}//fin class
