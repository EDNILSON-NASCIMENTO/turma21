programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro lancamentos[10] //vetor e numero de lancamentos - 10

		//sorteando valores de um dado e colocando num vetor
		para (inteiro x=0; x<10; x++){

			lancamentos[x] = Util.sorteia(1, 6)
			
		}
		// mostrando os valores sorteados
		para (inteiro y=0; y<10; y++){
			escreva("Lancamento ",y+1," : valor sorteado --> ",lancamentos[y],"\n")
		}

		escreva("Fim de programa")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 329; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */