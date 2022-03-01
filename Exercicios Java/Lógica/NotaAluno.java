package introducao;

import java.util.Scanner;

public class NotaAluno {
	
	
	public static void main(String[]args) {
		double n1, n2, n3;
		double notaFinal;
		Scanner id = new Scanner (System.in);
		
		System.out.print("Insira a primeira nota: ");
		n1=id.nextDouble();
		
		System.out.print("Insira a segunda nota: ");
		n2=id.nextDouble();
		
		System.out.print("Insira a terceira nota: ");
		n3=id.nextDouble();
		
		notaFinal=((n1*2)+(n2*3)+(n3*5))/10;
				
				System.out.println("A média do aluno é " + notaFinal);
		
	}
}


