package aula;

import java.util.Scanner;

public class Exc4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro nota (int): ");
		double num1 = ler.nextDouble();	
		
		System.out.println("Informe o segundo nota (int): ");
		double num2 = ler.nextDouble();	
		
		System.out.println("Informe o terceira nota (int): ");
		double num3 = ler.nextDouble();	
		
		System.out.println("Informe o quarta nota (int): ");
		double num4 = ler.nextDouble();	
		
		double media = ((num1+num2+num3+num4)/4);
		
		System.out.println("Media é : "+ media);
		
		ler.close();
	}

}
