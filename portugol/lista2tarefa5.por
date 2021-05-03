programa
{
	
	funcao inicio()
	{
		//variaveis - ingredientes
		real indicePoluicao=0.00
		//entradas 
		escreva("Digite o indice de poluição de hoje: ")
		leia(indicePoluicao)
		linha()
		pula()
		//processamentos
		se (indicePoluicao >= 0.5){
			escreva("GERAL, LASCOU, PARA TUDO!!!")
		}
		senao se (indicePoluicao >= 0.4){
			escreva("Industrias do primeiro e segundos grupos\nParem o trabalho.")
		}
		senao se (indicePoluicao  >= 0.3){
			escreva("Industrias do primeiro grupo\nParem o trabalho.")
		}
		senao {
			escreva("Indice aceitavel")
		}
		pula()
		linha()
		pula()
		escreva("\nFim de programa!!")
		
	}
	
	funcao linha(){
		escreva("------------------------------------------------")
	}

	funcao pula(){
		escreva("\n")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 11; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */