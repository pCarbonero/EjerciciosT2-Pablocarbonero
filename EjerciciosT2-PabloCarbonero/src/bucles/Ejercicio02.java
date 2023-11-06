package bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// variable para guardar el numero n solicitado al usuario
		int n, a;
		//variable para guardar la cantidad de numeros primo que hay
		int count = 0;
		//creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//booleana para saber si cada numero es primo o no
		boolean isPrime = true;
		
		//pregumtamos al usuario por el valor de n
		System.out.println("Cuanto vale n? ");
		//guardamos el valor introducido en la variable
		n = sc.nextInt();
		
		
		//creamos un bucle for que va a recorrer todos los numeros desde n hasta 1
		for (int i = n; i > 1; i--) {
			//al principio de cada iteración reestablecenmos la boleana a true
			isPrime = true;
			//creamos otro bucle dentro que va a comprobar si el valor de n en el momento es primo o no
			for (int j = 2; j <= i-1; j++) {
				//si el modulo de i, es decir, el valor de n en el momento es 0 entonces es que no es primo por lo que hacemo la booleana false
				if (i%j == 0) {
					isPrime = false;
				}
			}
			
			//si la booleana no se convirtió en false la vez anterior entonces suma uno al contador de números primos
			if(isPrime) {
				count++;
			}
		}
		
		//imprimimos el resultado
		System.out.println(count);
		//cerramos el escaner
		sc.close();
	}

}
