package lista16Exercicios;

import java.util.Scanner;

public class Exc13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Peso do Pescado: ");
		double peso = ler.nextDouble();
		
		double valorMulta = 0;
		double pesoExcedente = 0;
		
		if(peso > 50) {
			pesoExcedente = peso - 50;
			valorMulta = pesoExcedente * 4;
	
		}
		System.out.println("Valor da Multa: "+ valorMulta
				   +"\nPeso Excedente: "+ pesoExcedente);
		ler.close();
	}

}
