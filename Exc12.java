package lista16Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		System.out.print("Informe a altura: ");
		double altura = ler.nextDouble();
		
		double homem = ((72.7 * altura)-58);
		double mulher = ((62.1 * altura)-44.7);
		System.out.println("peso ideal homens: "+ fmt.format(homem)
							+"peso ideal homens: "+ fmt.format(mulher));
		ler.close();
		
		
	}

}
