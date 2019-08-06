package aula;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um numero (int): ");
		int num = ler.nextInt();
		
		System.out.println("o numero informado é : "+ num);
		
		ler.close();
	}

}
