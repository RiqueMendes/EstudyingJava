package VetoreMatriz;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vet[][]= new int [3][3];
		int linha=0, coluna=0, soma=0,  diag=0; 
				
				
				
				for(linha=0;linha<3;linha++)
					{
						for(coluna=0;coluna<3;coluna++)
						{
							System.out.print("Digite um numero: ");
							vet[linha][coluna]=leia.nextInt();
						}
					}

					
				for(linha=0;linha<3;linha++)
					{
						for(coluna=0;coluna<3;coluna++)
						{
							System.out.print("\t"+vet[linha][coluna]);					
						}
						System.out.print("\n");
					}	
					
			
				for(linha=0;linha<3;linha++)
				{
					for(coluna=0;coluna<3;coluna++)					
					 soma= soma+vet[linha][coluna];
					
				}
				
				
				for(coluna=0;coluna<3;coluna++)					
					 diag= diag+vet[coluna][coluna];
					
			
					
				System.out.print("\nA soma da matriz é: "+ soma);	
				System.out.print("\nA soma da diagonal é: "+ diag);
	}
}