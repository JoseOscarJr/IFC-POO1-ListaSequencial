package lista16Exercicios;

import java.util.Scanner;

public class Exc14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe suas Horas: ");
		double hora = ler.nextDouble();
		
		System.out.print("Informe seu ganho por hora: ");
		double ganhoHora = ler.nextDouble();
		
		double salario = (hora * ganhoHora);
		double descontosTotal = ((salario * 0.11)+(salario * 0.08)+(salario * 0.05));
		
		System.out.println("Salario bruto: "+ "("+hora+" * "+ganhoHora+")"+": R$ "+salario);
		System.out.println("(-) IR 11% :R$ "+ salario*0.11);
		System.out.println("(-) INSS 8% :R$ "+ (salario * 0.08));
		System.out.println("Sindicato 5% :R$ "+ (salario * 0.05));
		System.out.println("Total de descontos :R$ "+ descontosTotal);
		System.out.println("Salario Liquido :R$ "+ (salario-descontosTotal));
		ler.close();

	}

}
