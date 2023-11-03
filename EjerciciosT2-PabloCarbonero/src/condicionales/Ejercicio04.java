package condicionales;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// variable apra guardar el numero insertado
		int num;
		//variables para separar las dos cifras
		int fNum, sNum;
		//variable para guardar los numeros con letras
		String numeroUno, numeroDos, numero;
		//creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//pedimos el numero al usuario
		System.out.println("Escribe un número entre 1 y 99 ");
		//Guardamos el valor en la variable num
		num = sc.nextInt();
		
		//comprobamos que el numero introducido esta en el rango
		if (num >= 1 && num <= 99) {
			//separamos el numero en dos cifras diferentes
			fNum = num/10;//primera cifra
			sNum = num%10;//segun da cifra
			

			if (num <= 15) {
				numero = switch (num) {
				case 1-> "Uno";
				case 2-> "Dos";
				case 3-> "Tres";
				case 4-> "Cuatro";
				default-> "ASD";
				};
			}
		}
		//si el numero no esta en rango lo imprimimos por pantalla
		else {
			System.out.println("El número no está entre 1 y 99, inténtalo otra vez");
		}
		
	}

}
