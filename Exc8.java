package lista16Exercicios;

import java.util.Scanner;

public class Exc8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe suas Horas: ");
		double hora = ler.nextDouble();
		
		System.out.print("Informe seu ganho por hora: ");
		double ganhoHora = ler.nextDouble();
		
		double salario= ganhoHora * hora;
		
		System.out.println("Salario: R$"+salario);
		ler.close();
		
	}

}
