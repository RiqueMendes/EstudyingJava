package introducao;
import java.util.Scanner;


public class EquacoesLineares {
	
	
	public static void main(String[] args) {
		double a,b,c,d,e,f,x,y;
		
		Scanner id = new Scanner (System.in);
			System.out.println("Entre com o valor de A: ");
			a=id.nextDouble();
			
	
			System.out.println("Entre com o valor de B: ");
			b=id.nextDouble();
				
		
			System.out.println("Entre com o valor de C: ");
			c=id.nextDouble();
					
		
		     System.out.println("Entre com o valor de D: ");
		     d=id.nextDouble();
		     
		 
			  System.out.println("Entre com o valor de E: ");
			  e=id.nextDouble();
			     
		
			System.out.println("Entre com o valor de F: ");
			f=id.nextDouble();
			
			x=(c*e-b*f)/(a*e-b*d);
			y=(a*f-c*d)/(a*e-b*d);
				     
			System.out.println("Os valores de X é: "+x+"E o de Y:" +y);
		
			 
						     
					     
		
			
			
		
	}
}
