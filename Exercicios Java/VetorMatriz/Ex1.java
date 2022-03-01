package VetoreMatriz;

import java.util.Scanner;


public class Ex1 {
	
	
	
	    public static void main(String[] args) {
	    	Scanner ler = new Scanner (System.in);
		int vet[] = new int [5];
		int maior=0;
				
	
				for(int x=0; x<5; x++) {
					{
						System.out.println("Digite um número: ");
						vet[x]=ler.nextInt();
						
						if(vet[x]>maior)
						maior=vet[x];
					}
					System.out.println("O maior número até o momento é: "+ maior);
					
					
					
				}
		
		
	}
}