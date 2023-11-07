package condicionales;

import java.util.Scanner;

/*
 * ENTRADA: -7 | REL. ESPERADO: ERROR | REL. OBTENIDO: ERROR
 * ENTRADA: 15634 | REL. ESPERADO: ERROR | REL. OBTENIDO: ERROR
 * ENTRADA: 2 | REL. ESPERADO: CAPICÚA | REL. OBTENIDO: CAPICÚA
 * ENTRADA: 43 | REL. ESPERADO: NO CAPICUA | REL. OBTENIDO: NO CAPICUA 
 * ENTRADA: 44 | REL. ESPERADO: CAPICÚA | REL. OBTENIDO: CAPICÚA
 * ENTRADA: 321 | REL. ESPERADO: NO CAPICUA  | REL. OBTENIDO: NO CAPICUA 
 * ENTRADA: 121 | REL. ESPERADO: CAPICÚA | REL. OBTENIDO: CAPICÚA
 * ENTRADA: 3217 | REL. ESPERADO: NO CAPICUA  | REL. OBTENIDO: NO CAPICUA 
 * ENTRADA: 1221 | REL. ESPERADO: CAPICÚA | REL. OBTENIDO: CAPICÚA
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		//variable para guardar las cirfas del num pedido y para almacenar el resto del modulo de 11
		int a, b, c, d, resto;
		//variable para guardar el num introducido por consola
		int num;
		//variable boolean para saber si es true o no
		boolean isCapi = false;
		//creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//pedimos un nunmero entero
		System.out.println("Di num");
		//guardamos el num itroducido en la variable num
		num = sc.nextInt();
		
		//comprobamos si el numero esta en el rango solicitado
		if (num>=0 && num<=9999) {
			//comprobamos si el numero es menor que 9 
			if (num <= 9) {
				isCapi = true;
			}
			//comprobamos si el numero es menor que 99 y su modulo de 11 es menor que 0 es capicua
			else if (num <= 99) {
				resto = num%11;
				//si se cumole la condicion convertimos la booleana en true
				if (resto == 0) {
					isCapi = true;
				}
			}
			//si el num es menor que 999 comprobamos que el modulo de num entre 10 es igual a num entre 100
			else if (num <= 999) {
				a = num/100;
				c = num%10;		
				//si se cumole la condicion convertimos la booleana en true
				if (a == c) {
					isCapi = true;
				}
			}
			else if (num <= 9999) {
				//primero comprobamos si el primer numero y el cuarto son iguales
				a = num/1000;
				d = num%10;
				//a conitnuacion con operaciones matematicas comprobamos si el segundo y tercer numero son 
				//guales
				c = (((num/10)%10)/10);
				b = (((num/10)%100)/100);
				//si se cumole la condicion convertimos la booleana en true
				if (a==d && b==c) {
					isCapi = true;
				}
			}			
		}
		//si el número no está dentro del rango imprimimos el siguiente mensaje por pantalla
		else {
			System.out.println("El número introducido no es válido :( ");
		}
		
		//imprimos el resultado dependiendio del valor de la booleana true
		if (isCapi) {
			System.out.println("Es capicua");
		}
		else System.out.println("No es capicua");

		//cerramos el escaner 
		sc.close();
	}

}
