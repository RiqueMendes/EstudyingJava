package Animais2;

import Polimorfismo.Animal;

public class AcoesAnimais {

	public static void main(String[] args) {
	Cachorro c1 = new Cachorro();
	Cavalo c2 = new Cavalo();
	Preguica p1 = new Preguica();
	Animais a1 = new Cavalo(); //exemplo de polimorfismo
	
	
	c1.setNome("Luna");
	c1.emitirSom();
	
	c2.setNome(null);
	c2.emitirSom();
	
	p1.setNome("Soneca");
	p1.emitirSom();
	
	a1.emitirSom(); //exemplo de polimorfismo
	
	
	}

}
