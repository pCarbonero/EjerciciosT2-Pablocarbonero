package bucles;

import java.util.InputMismatchException;

import java.util.Scanner;
/* ENTRADA: 12, 56, 36, 10 | RES. ESPERADO: 12:56:46 | RES. OBTENIDO: 12:56:46
 * ENTRADA: 12, 56, 56, 10 | RES. ESPERADO: 12:57:6 | RES. OBTENIDO: 12:57:6
 * ENTRADA: 12, 59, 56, 10 | RES. ESPERADO: 12:56:46 | RES. OBTENIDO: 13:0:6
 * ENTRADA: 23, 59, 59, 1 | RES. ESPERADO: 0:0:0 | RES. OBTENIDO: 0:0:0
 * ENTRADA: 24, 56, 56, 10 | RES. ESPERADO: ERROR | RES. OBTENIDO: ERROR
 * ENTRADA: 12, 65, 56, 10 | RES. ESPERADO: ERROR | RES. OBTENIDO: ERROR
 * ENTRADA: 23, 59, 786, 1 | RES. ESPERADO: ERROR | RES. OBTENIDO: ERROR
 * ENTRADA: HH, MM, SS, 1 | RES. ESPERADO: ERROR | RES. OBTENIDO: ERROR
 */

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
					System.out.println("El valor introducido no es correcto, introdúcelo otra vez");
					sc.nextLine();
				}
					
			} while (hour < 0 || hour > 23);
			
			do {
				try {
				//preguntamos por los minutos y segundos y guardamos los valores en cad variable
				System.out.println("Dime los minutos ");
				min = sc.nextInt();//guardamos el valor introducido en la variable
						
				}catch (InputMismatchException e) {
					System.out.println("El valor introducido no es correcto, introdúcelo otra vez");
					sc.nextLine();
				}
					
			} while (min < 0 || min > 60);
			
			do {
				try {
				//preguntamos por los minutos y segundos y guardamos los valores en cad variable
				System.out.println("Dime los segundos ");
				sec = sc.nextInt();//guardamos el valor introducido en la variable
						
				}catch (InputMismatchException e) {
					System.out.println("El valor introducido no es correcto, introdúcelo otra vez ");
					sc.nextLine();
				}
					
			} while (min < 0 || min > 60);
		
			do {
				try {
					System.out.println("Dime cuantos segundos quieres incrementar la hora ");
					inc = sc.nextInt();//guardamos el valor introducido en la variable
						
				}catch (InputMismatchException e) {
					System.out.println("El valor introducido no es correcto, introdúcelo otra vez ");
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
