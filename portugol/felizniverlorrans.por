programa
{
	
	funcao inicio()
	{
		inteiro contador=0
		inteiro vezes=0
		
		escreva("Quantas vezes vc desejar manda feliz niver na tela :")
		leia(vezes)
		
		//refatoramento de codigo
		/*
		faca {
			escreva(contador+1," -  FELIZ ANIVERSÁRIO LORRANS!!\n")
			contador++  //contador = contador + 1
		} enquanto (contador < vezes)
		*/
		para (contador = 1; contador<=vezes ; contador++){
		
			se ((contador%2)==0){
				escreva(contador," -  FELIZ ANIVERSÁRIO LORRANS!!\n")	
			}
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 504; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */