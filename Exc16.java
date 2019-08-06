package lista16Exercicios;

import java.util.Scanner;

public class Exc16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		
		System.out.println("Informe o tamanho (em metros quadrado): ");
		double area = ler.nextInt();	
		double latas18 = 0;
		double latas36 = 0;
	
		latas36 = (area / 6)/3.6;
		latas18 = (area / 6)/18;
		
		System.out.println("Area do quadrado a ser pintada: " + area
							+"\ntotal de latas 3,6L: "+ (int) Math.ceil(latas36)+ " total R$: "+(((int) Math.ceil(latas36))*25)
							+"\ntotal de latas  18L: "+ (int) Math.ceil(latas18)+ " total R$: "+(((int) Math.ceil(latas18))*80));
		
		ler.close();

	}

}
