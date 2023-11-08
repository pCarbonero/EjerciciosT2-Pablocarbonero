package bucles;

import java.util.InputMismatchException;
import java.util.Iterator;
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
		
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.println(" ");
				
			}//fin bucle j
			System.out.println("* ");
			sc.nextLine();
			//cos
			
		}//fin bucle i
		
		
		
	    }//fin main

	}//fin class

