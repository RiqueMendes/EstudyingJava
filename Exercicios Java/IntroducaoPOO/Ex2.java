package IntroducaoPOO;

public class Ex2 {
	// atributos
	String modelo;
	int peso;
	String cor;

	// metodos

	public Ex2() {
		this.modelo = "Boeing 797";
		this.peso = 1000;
		this.cor = "branco";

	}

	public void informarModelo() {
		System.out.println("Modelo do avião " + modelo);
	}

	public void informarPeso() {
		System.out.println("O peso em kgs é: " + peso);
	}

	public void informarCor() {
		System.out.println("A cor do avião é: " + cor);
	}

}