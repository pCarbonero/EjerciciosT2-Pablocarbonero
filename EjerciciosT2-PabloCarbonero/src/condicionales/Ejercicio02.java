package condicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// creamos variable para guardar el número del dni
		int dni;
		//creamos una variable char para guardar la letra del dni
		char letter;
		//creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		
		//pedimos el numero del dni
		System.out.println("Escribe tu dni, tiene que ser de 8 letras ");
		//guardamos el numero del dni
		dni = sc.nextInt();
		
		//comprobamos que el numero tiene 8 cifras
		if (dni>9999999 && dni <= 99999999) {
			//si las tiene comprobamos que caso es el modulo de 23 y lo igualamos con el caracter
			letter = switch (dni%23) {
			case 0->'T';
			case 1->'R';
			case 2->'W';
			case 3->'A';
			case 4->'G';
			case 5->'M';
			case 6->'Y';
			case 7->'F';
			case 8->'P';
			case 9->'D';
			case 10->'X';
			case 11->'B';
			case 12->'N';
			case 13->'J';
			case 14->'Z';
			case 15->'S';
			case 16->'Q';
			case 17->'V';
			case 18->'H';
			case 19->'L';
			case 20->'C';
			case 21->'K';
			case 22->'E';
			
			default -> 'ñ';
			};
			
			System.out.println(dni + "" +letter);
		}	
		//si el numero no tiene 8 cifras imprimimos el siguiente mensaje
		else {
			System.out.println("El número no tiene 8 cifras ");
		}
		
		//cerramos el escaner 
		sc.close();
	}

}
