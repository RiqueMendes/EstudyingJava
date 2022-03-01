package introducao;

import java.util.Scanner;

	public class Fabrica {
		public static void main(String[] args) {
		int seg, min, hora, tempo;
		Scanner id = new Scanner (System.in);
		
		System.out.println("Escreva os segundos sem ocorrencia: ");
		tempo=id.nextInt();
		
		hora = tempo/3600;
		min = (tempo-(3600*hora))/60;
		seg =  (tempo-(3600*hora))%60;

		System.out.println("\nO tempo"+hora+"horas \nminutos"+min+"e"+seg+"segundos");
						}
}