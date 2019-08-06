package aula;

import java.util.Scanner;

public class Exc6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o raio (em metros): ");
		double raio = ler.nextDouble();	
		
		double area = (3.14 *(raio * raio));
		
		System.out.println("area do circulo é : " + area);
		
		ler.close();
	}

}
