package lista16Exercicios;

import java.util.Scanner;

public class Exc10 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
				
		System.out.print("Informe um numero inteiro: ");
		int nInt1 = ler.nextInt();
		
		System.out.print("Informe um numero inteiro: ");
		int nInt2 = ler.nextInt();
		
		System.out.print("Informe um numero real: ");
		double nReal = ler.nextDouble();
		
		System.out.println("o produto do dobro do primeiro com metade do segundo = "+ (nInt1 * 2*(nInt2/ 2)));
		System.out.println("a soma do triplo do primeiro com o terceiro = " + (nInt1 *3 +nReal));
		System.out.println("o terceiro elevado ao cubo = "+(nReal * nReal * nReal));
		ler.close();
	}

}
