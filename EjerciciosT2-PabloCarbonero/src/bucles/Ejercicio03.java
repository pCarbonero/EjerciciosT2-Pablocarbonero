package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//variable para la pirámide
		int num = -1;
		//escaner
		Scanner sc = new Scanner(System.in);
		
		
		//try catch
		do {
			try {
				//pedimos el número de la base
				System.out.println("Dime el número de la base del triángulo ");
				num = sc.nextInt();			
			} catch (InputMismatchException e) {
				System.out.println("Asegurate de que estás introduciendo carácteres numéricos ");
				sc.nextLine();
			}//fin catch
		} while (num < 0);
		
		//creamos un bucle for que hará los saltos de linea
		for (int i = 1; i <= num; i++) {
			//creamos un segundo bucle que hará los espacios antes de dibujar los asteriscos
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");				
			}//fin bucle j
			
			//creamos un tercer bucle que dibujará los asteriscos
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");		
			}//fin bucle k
			System.out.println(" ");	
		}//fin bucle i
		
		//cerramos el escaner
		sc.close();	
	    }//fin main

	}//fin class

