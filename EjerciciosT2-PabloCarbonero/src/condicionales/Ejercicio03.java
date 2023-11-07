package condicionales;

import java.util.Scanner;

/* ENTRADA: 52, 4, 5 | REL. ESPERADO: COMIDA DE SOBRA | REL. OBTENIDO: COMIDA DE SOBRA
 * ENTRADA: 80, 20, 5 | REL. ESPERADO: NO HAY FALTA 4 KG | REL. OBTENIDO: NO HAY FALTA 4 KG
 * ENTRADA: 0, 20, 5 | REL. ESPERADO: NO ANIMALES | REL. OBTENIDO: NO ANIMALES
 */
public class Ejercicio03 {

	public static void main(String[] args) {
		// creamos variables para las cantidades que tenemos que almacenar
		int	foodAmount, animNum, foodEaten, foodNeed,diff;
		//creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//preguntamos por las cantidades y las almacenamos en sus respectivas variables
		System.out.println("Cantidad de comida que has comprado ");//pregunta
		foodAmount = sc.nextInt();//se guarda en la variable
		
		System.out.println("Cantidad de animales que tienes ");
		animNum = sc.nextInt();
		
		System.out.println("Cantidad de comida que come cada animal ");
		foodEaten = sc.nextInt();
		
		//primero comprobamos que hay animales
		if (animNum > 0) {
			//dividimos la comida que tenemos entre los animales para saber cuanta cantidad hay para cada uno
			foodNeed = (foodAmount/animNum);
			//restamos la cantidad de comida que necesita cada animal con la cantidad que tiene 
			//cada uno para saber si cada uno tiene la canttidad necesaria
			diff = foodNeed - foodEaten;
			//si tienen la cantidad necesaria entonces imprimos el mensaje
			if (diff > 0) {
				System.out.println("Hay comida de sobra");
			}
			//si no imprimimos la cantidad miniam que necista cada uno
			else {
				System.out.println("No hay comida suficiente, cada animal necesita " + foodNeed + " kilos de comida");
			}
			//si no tiene animales lo imprimimos por pantalla
		}else System.out.println("No tienes animales para alimentar");
		//ceramos el escaner
		sc.close();
	}

}
