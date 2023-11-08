package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// variable para las horas, minutos y segundos
		int hour = -1, min = -1, sec = -1;
		//variable para el incremento de segundos
		int inc = -1;
		//variable escaner
		Scanner sc = new Scanner(System.in);
		
		//bucle para asegurarnos de que la hora está bien introducida
			do {
				try {
				//preguntamos por las horas
				System.out.println("Dime las horas ");
				hour = sc.nextInt();//guardamos el valor introducido en la variable
						
				}catch (InputMismatchException e) {
					System.out.println("Asegurate de introducir carácteres numéricos");
					sc.nextLine();
				}
					
			} while (hour < 0 && hour < 23);
			
			do {
				try {
				//preguntamos por los minutos y segundos y guardamos los valores en cad variable
				System.out.println("Dime los minutos ");
				min = sc.nextInt();//guardamos el valor introducido en la variable
						
				}catch (InputMismatchException e) {
					System.out.println("Asegurate de introducir carácteres numéricos");
					sc.nextLine();
				}
					
			} while (min < 0 && min < 60);
			
			do {
				try {
				//preguntamos por los minutos y segundos y guardamos los valores en cad variable
				System.out.println("Dime los segundos ");
				sec = sc.nextInt();//guardamos el valor introducido en la variable
						
				}catch (InputMismatchException e) {
					System.out.println("Asegurate de introducir carácteres numéricos");
					sc.nextLine();
				}
					
			} while (min < 0 && min < 60);
		
			do {
				try {
					System.out.println("Dime cuantos segundos quieres incrementar la hora ");
					inc = sc.nextInt();//guardamos el valor introducido en la variable
						
				}catch (InputMismatchException e) {
					System.out.println("Asegurate de introducir carácteres numéricos");
					sc.nextLine();
				}
					
			} while (inc < 0);
	

		//el bucle se va a repetir tantas veces se como segundos queremos incrementar
		for (int i = 1; i <= inc; i++) {
			//en cada incremento suma un segundo
			sec++;
			//si los segundos son 60 entonces suma un minuto y los segundos vuelven a 0
			if (sec == 60) {
				sec = 00;
				min += 1;
			}
			//si los minutos son 60 entonces suma una hora y los minutos vuelven a 0
			if (min == 60) {
				min = 00;
				hour += 1;
			}
			//si las horas son 24 entonces las horas vuelven a 0
			if (hour == 24) {
				hour = 00;
			}
			
		 }
		

		
		//imprimimos por la consola la hora tras el incremento
		System.out.println("La hora es " + hour + ":" + min + ":" + sec);
		//cerramos el escaner
		sc.close();
	}
}
