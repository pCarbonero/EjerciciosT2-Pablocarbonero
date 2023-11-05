package condicionales;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// variable apra guardar el numero insertado
		int num;
		//variables para separar las dos cifras
		int fNum, sNum;
		//variable para guardar los numeros con letras
		String numeroUno = "", numeroDos = "", numero = "";
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
			
			//Si los numeros son del uno al 15 entran eneste switch
			  if (num <= 15) {
				numero = switch (num) {
				case 1-> "Uno";
				case 2-> "Dos";
				case 3-> "Tres";
				case 4-> "Cuatro";
				case 5-> "Cinco";
				case 6-> "Seis";
				case 7-> "Siete";
				case 8-> "Ocho";
				case 9-> "Nueve";
				case 10-> "Diez";
				case 11-> "Once";
				case 12-> "Doce";
				case 13-> "Trece";
				case 14-> "Catorce";
				case 15-> "Quince";
				default-> "ASD";
				};
			}
			
			  //comprovamos que el numero no acaba en 0
			if (sNum>0) {
				//igualamos la primera cifra al caso correspondiente si no acaba en 0
				numeroUno = switch (fNum) {
				case 1-> "Dieci";
				case 2-> "Veinti";
				case 3-> "Treinta y ";
				case 4-> "Cuarenta y ";
				case 5-> "Cincuenta y ";
				case 6-> "Sesenta y ";
				case 7-> "Setenta y ";
				case 8-> "Ochenta y ";
				case 9-> "Noventa y ";
				default-> "";
				};
				//aqui si los numeros acaban en 0
			}else {
				//igualamos la primera cifra al caso correspondiente si acaba en 0
				numeroUno = switch (fNum) {
				case 1-> "Diez";
				case 2-> "Veinte";
				case 3-> "Treinta";
				case 4-> "Cuarenta";
				case 5-> "Cincuenta";
				case 6-> "Sesenta";
				case 7-> "Setenta";
				case 8-> "Ochenta";
				case 9-> "Noventa";
				default-> "";
				};					
			}

			//aqui comprobamos e3l segundp numero e igualamos la segunda cifra al caso correspondiente
			numeroDos = switch (sNum) {
			case 1-> "uno";
			case 2-> "dos";
			case 3-> "tres";
			case 4-> "cuatro";
			case 5-> "cinco";
			case 6-> "seis";
			case 7-> "siete";
			case 8-> "ocho";
			case 9-> "nueve";
			default-> "";
			};
			
			
		}
		//si el numero no esta en rango lo imprimimos por pantalla
		else {
			System.out.println("El número no está entre 1 y 99, inténtalo otra vez");
		}
		
		if (num <= 15) {
			System.out.println(numero);	
		}
		else {
			numero = numeroUno + numeroDos;
			System.out.println(numero);	
		}
	}

}
