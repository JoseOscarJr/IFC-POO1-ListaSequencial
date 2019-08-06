package aula;

import java.util.Scanner;

public class Exc7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do quadrado (em metros): ");
		double raio = ler.nextDouble();	
		
		double area = (raio * raio);
		
		System.out.println("area do quadrado é : " + area);
		
		ler.close();

	}

}
