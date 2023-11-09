package bucles;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		//variable para guardar el número
		int num, res = 0;
		//creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		
		//preguntamos por el num
		System.out.println("DI NUMEROO");
		num = sc.nextInt();
		
		while (num > 0) {
			num = num/10;
			res++;
		}
		
		System.out.println(res);
	}//fin main
}//fin class
