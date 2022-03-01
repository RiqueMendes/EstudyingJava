package VetoreMatriz;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner id = new Scanner(System.in);

		int vet[] = new int[10];
		int maior = 0, mL = 0, aperto = 0, soma = 0, media = 0, cont=0;

		for (int x = 0; x < 10; x++) {
			{
				System.out.println("Insira o valor do lançamento: ");
				vet[x] = id.nextInt();

				if (vet[x] >= 0)

				{					
					soma = soma + vet[x];
					aperto++;
					media=soma/10;

				}
				if (vet[x] > mL) {
						mL=vet[x];
					
				}
			}

		}
		for (int x=0;x<10;x++) {
			if (mL==vet[x])
			{
				cont++;
			}
		}
			
			
			
		System.out.println("A média dos valores é: " + media);
		System.out.println("Foi apresentada a maior ocorrencia: " + cont);
		System.out.println("O maior dado foi: " + mL);
	}
}