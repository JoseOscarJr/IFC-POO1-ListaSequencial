package aula;

import java.util.Scanner;

public class Exc3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero (int): ");
		int num1 = ler.nextInt();	
		
		System.out.println("Informe o segundo numero (int): ");
		int num2 = ler.nextInt();
		
		int soma = num1+num2;
		
		System.out.println("a soma é : "+ soma);
		
	}

}
