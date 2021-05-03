programa
{
	funcao inicio()
	{
		//variaveis
		cadeia alunes[3] 
		real notas[3] 
		cadeia msg
		inteiro numero=0
		
		//CADASTRANDO OS NOMES E NOTAS
		para (inteiro x=0; x<3; x++){
			escreva("Digite o nome do alune :")
			leia(alunes[x])
			escreva("Digite  a nota :")
			leia(notas[x])
		}
		
		escreva("\n")
		escreva("LISTA DE ALUNES\n")
		escreva("----------------------------\n")
		
		para (inteiro x=0; x<3; x++){
			se (notas[x] <= 5){
				msg = "estude um pouco mais!!"
			}
			senao
			{
				msg = "continue assim!!"
			}
			escreva(alunes[x]," sua nota é ",notas[x]," ",msg,"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */