programa
{
	
	funcao inicio()
	{
		inteiro vet[5], x=0, soma=0, media=0

	
		para(x=0;x<5;x++)
		{
		 escreva("Insira a primeria nota: " )
		 leia(vet[x])
		}
		soma=x*5
		media=x/5
		
		escreva("A soma de todas as notas é:", soma)
		escreva("\n A média é: ", media)
		limpa ()

		se(media>=5)
		{
			escreva("\nAluno aprovado")
		}
		senao
		{
			escreva("\nAluno reprovado")
		}
	}
		
			
		
	}
		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 332; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vet, 6, 10, 3}-{soma, 6, 23, 4}-{media, 6, 31, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */