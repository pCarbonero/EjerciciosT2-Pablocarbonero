package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		//creamos la variable para almacenar la respuesta del usuario
		int	resp;
		//creamos las variables para los numeros aleatorios
		int rand1, rand2, suma;
		//creamos el random para que genere el número aleatorio
		Random ran = new Random(); 
		//creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//igualamos las variales de los random al random entre 1 incluido y 100 excluido
		rand1 = ran.nextInt(1,100);
		rand2 = ran.nextInt(1,100);
		//sumamos los dos números
		suma = rand1 + rand2;
		//Hacemos la pregunta al usuario
		System.out.println("Dime cuanto vale la suma de " + rand1 + " + " + rand2);
		//guardamos la respuesta el la variable resp
		resp = sc.nextInt();
		
		//comprobamos si la suma de los números es igual a la respuesta
		if (resp == suma) {
			System.out.println("ES CORRECTO! ");
		}else System.out.println("Lo siento, te has equivocado :( ");
		
		//cerramos el escaner
		sc.close();
	}

}
