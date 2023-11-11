package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {
	/*
	 * ENTRADA: -7 | REL. ESPERADO: ERROR | REL. OBTENIDO: ERROR
	 * ENTRADA: 2 | REL. ESPERADO: CAPICÚA | REL. OBTENIDO: CAPICÚA
	 * ENTRADA: 43 | REL. ESPERADO: NO CAPICUA | REL. OBTENIDO: NO CAPICUA 
	 * ENTRADA: 44 | REL. ESPERADO: CAPICÚA | REL. OBTENIDO: CAPICÚA
	 * ENTRADA: 321 | REL. ESPERADO: NO CAPICUA  | REL. OBTENIDO: NO CAPICUA 
	 * ENTRADA: 121 | REL. ESPERADO: CAPICÚA | REL. OBTENIDO: CAPICÚA
	 * ENTRADA: 3217 | REL. ESPERADO: NO CAPICUA  | REL. OBTENIDO: NO CAPICUA 
	 * ENTRADA: 1221 | REL. ESPERADO: CAPICÚA | REL. OBTENIDO: CAPICÚA
	 */
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
				System.out.println("El valor introducido no es correcto ");
				//"limpiamos" el escaner para introducir de nuevo por consola algo
				sc.nextLine();
			}
		} while (num < 0);
		
		//igualamos el número auxiliar al numero para no modificar directamente el número inicial
		aux = num;
		
		//bucle que calculará el número inverso
		while (aux > 0) {
			//hacemos el modulo de aux/10 para averiguar la ultima cifra
			last = aux%10;
			//multiplicamos la variable *10 y le sumamos el ultimo numero para poco a poco ir montandoi el numero inverso
			inv = inv * 10 + last;
			//dividimos entre diez para eliminar la ultima cifra
			aux/=10;
		}
		
		//si el numeor inverso es igual al inicial entonces es capicua
		if (inv == num) {
			System.out.println("CApicua");
			//si no no
		}else {
			System.out.println("NO CApicua");
		}
		
		//cerramos el escaner
		sc.close();
	}//fin main

}//fin class
