package VetoreMatriz;

import java.util.Random;
import java.util.Scanner;


public class Ex3 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner ler = new Scanner(System.in);

		
		
		
		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];

		int linha, coluna;

		for (linha = 0; linha < 4; linha++) {

			for (coluna = 0; coluna < 6; coluna++) {
				n1[linha][coluna] = random.nextInt(1,9);
			}

		}

		// n2

		for (linha = 0; linha < 4; linha++) {

			for (coluna = 0; coluna < 6; coluna++) {

				
				n2[linha][coluna] = random.nextInt(1,9);
			}
			System.out.print("\n");
		}

		// m1

		for (linha = 0; linha <4; linha++) {

			for (coluna = 0; coluna <3; coluna++) {
				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna];
			}

			for (linha = 0; linha < 3; linha++) {

				for (coluna = 0; coluna <3; coluna++) {
					System.out.print("\t" + m1[linha][coluna]);
				}
				System.out.print("\n");
			}
		}

		// m2

		for (linha = 0; linha < 4; linha++) {

			for (coluna = 0; coluna < 3; coluna++) {
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna];
			}

			for (linha = 0; linha < 3; linha++) {

				for (coluna = 0; coluna <3; coluna++) {
					System.out.print("\t" + m2[linha][coluna]);

			}
				System.out.println("\n");
		}
	}
}
}