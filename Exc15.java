package lista16Exercicios;

import java.util.Scanner;

public class Exc15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		
		System.out.println("Informe o tamanho (em metros quadrado): ");
		double area = ler.nextInt();	
		double latas = 0;
	
		latas = (area / 3)/18;
		
		System.out.println("Area do quadrado a ser pintada: " + area
							+"\ntotal de latas: "+ (int) Math.ceil(latas));
		
		ler.close();


	}

}
