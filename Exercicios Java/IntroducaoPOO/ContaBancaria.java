package IntroducaoPOO;

public class ContaBancaria {
	//atributos
	
	int saldo = 2000;
	int valorTransacionado = 18000;
	int transacaoMesPassado = 15000;

	//metodos
	public void saldo() {
		System.out.println("O saldo em conta é de R$:\t "+saldo);
	}
	
	public void valorTransacionado() {
		System.out.println("O valor transacionado dentro do mês foi de R$:\t"+valorTransacionado);
	}
	public void transacaoMesPassado() {
		System.out.println("O valor transacionado no mes passado foi de R$:\t "+transacaoMesPassado);
	}
	
	
	
}