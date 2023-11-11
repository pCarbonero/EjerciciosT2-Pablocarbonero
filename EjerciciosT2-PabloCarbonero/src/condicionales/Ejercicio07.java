package condicionales;

import java.util.Scanner;
/* ENTRADA: 8, 56, 9 | RES. ESPERADO: 8:56:10 | RES. OBTENIDO: 8:56:10
 * ENTRADA: 9, 59, 59| RES. ESPERADO: 10:0:0 | RES. OBTENIDO: 10:0:0
 * ENTRADA: 23, 59, 59 | RES. ESPERADO: 0:0:0 | RES. OBTENIDO: 0:0:0
 */
public class Ejercicio07 {

	public static void main(String[] args) {
		// variable para las horas, minutos y segundos
		int hour, min, sec;
		//creamos el escaner 
		Scanner sc = new Scanner(System.in);
		
		//preguntamos por las horas
		System.out.println("Dime las horas ");
		//guardamos las horas en la variable
		hour = sc.nextInt();
		
		//preguntamos por los minutos
		System.out.println("Dime los minutos ");
		//guardamos los minutos en la variable
		min = sc.nextInt();
		
		//preguntamos por los segundos
		System.out.println("Dime los segundos ");
		//guardamos los segundos en la variable
		sec = sc.nextInt();
		
		//comprobamos que la hora están bien introducidas
		if (hour >= 0 && hour <= 23 && min >= 0 && min <= 59 && sec >= 0 && sec <= 59) {
			
			//le suma 1 a los segundos 
			sec += 1;
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
			//imprimimos el resultado final por pantalla
			System.out.println("La hora es " + hour + ":" + min + ":" + sec);
		}
		//si no está bien entonces muestra el mensaje de que hay un error
		else {
			
			System.out.println("Asegurate de que has introducido la hora en rangos válidos ");
		}
		//cerramos el escaner		
		sc.close();
	}

}
