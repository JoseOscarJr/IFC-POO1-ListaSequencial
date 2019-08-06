package aula;

import java.util.Scanner;

public class Exc5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a metragem (em metros): ");
		double num1 = ler.nextDouble();	
		
		double centi = (num1* 100);
		
		System.out.println(num1 + " Metros equivale a "+centi+" centimetros");
		
		ler.close();
	}

}
