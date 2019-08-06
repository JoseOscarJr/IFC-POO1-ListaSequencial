package lista16Exercicios;

import java.util.Scanner;

public class Exc9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em F°: ");
		double F = ler.nextDouble();
		
		double C = (F - 32) / 1.8;
		System.out.println("Celsius: "+C+"°");
		ler.close();
	}

}
