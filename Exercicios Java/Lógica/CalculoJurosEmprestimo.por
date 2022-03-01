programa
{
	
	funcao inicio()
	{
		real x, xJuros=0.0, jurosMenor=0.0
		escreva("Insira o valor que deseja R$: ")
		leia(x)

		se(x>=5000)
		{
		xJuros=x*0.18+x
		escreva("O valor total a pagar é: ", xJuros)
		}
			senao 
			{
			jurosMenor=x*0.15+x
			escreva("O valor total a pagar é:", jurosMenor)
			}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 40; 
 * @PONTOS-DE-PARADA = 13;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */