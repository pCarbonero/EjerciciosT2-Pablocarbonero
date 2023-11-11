package condicionales;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		//variables para los km y los dias
		int days;
		float km;
		//variable para el precio final
		float price;
		//constante para el valor por km y para el descuento
		final float KMPRICE = 2.5f;
		final float DISCOUNT = 0.3f;
		//escaner
		Scanner sc = new Scanner(System.in);
		//boleana para saber si hay descuento o no
		boolean isDiscount = false;
		
		//Preguntamos por el número de días
		System.out.println("Cuántos días vas a estar ");
		days = sc.nextInt();
		//preguntamos por los km
		System.out.println("Cuantos kilometros tiene el viaje ");
		km = sc.nextFloat();
		
		//comprobamos si cumple los requisitos para el descuento
		if (days > 7 && km > 800) {
			//si los cumple convertimos la booleana a true
			isDiscount = true;
		}
		//calculamos el precio
		price = (float) (km * KMPRICE);
		
		//si hay descuento le aplicamos el descuento
		if (isDiscount) {
			price = price - (price * DISCOUNT);
		}
		
		//imprimimos el resultado
		System.out.println("El billete cuesta " + price + "€");
		
		//cerramos el escaner
		sc.close();
	}

}
