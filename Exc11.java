package lista16Exercicios;

import java.util.Scanner;

public class Exc11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe a altura: ");
		double altura = ler.nextDouble();
		
		double pesoIdeal = ((72.7 * altura)-58);
		
		System.out.println("Seu peso ideal: "+ pesoIdeal);
		ler.close();
	}

}
