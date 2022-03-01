programa
{
	
	funcao inicio()
	{
		real x, valor=0.0, preco1=0.0, preco2=0.0, preco3=0.0, produto=0.0, vezes=0.0

		escreva("Insira o valor do produto: ")
		leia(produto)
		escreva("Insira a quantidade de vezes que deseja parcelar: ")
		leia(x)
	
	se(x<5)
	{
		preco1=produto*0.04+produto
		escreva(preco1)
	}
	se(x<7)
	{
		preco2=produto*0.10+produto
		escreva(preco2)
	}
	se(x<=12)
	{
		preco3=produto*0.12+produto
		escreva(preco3)
	}
	}
}	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */