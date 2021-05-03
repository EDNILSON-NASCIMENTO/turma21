programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Escreve um programa que lê duas matrizes N1 (4,6) 
		 * e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas
		dos elementos de mesma posição das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças 
		dos elementos de mesma posição das matrizes N1 e N2.
		 */
		
		inteiro N1[4][6]
		inteiro N2[4][6]
		inteiro M1[4][6]
		inteiro M2[4][6]
		const inteiro LINHA = 4
		const inteiro COLUNA = 6
		//PREENCHENDO A MATRIZ
		para (inteiro linha = 0; linha<LINHA; linha++ ){
			para(inteiro coluna = 0; coluna<COLUNA; coluna++){
				N1[linha][coluna] = Util.sorteia(6,9)
				N2[linha][coluna] = Util.sorteia(1,5)
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna]
			}
		}

		//MOSTRA AS MATRIZES
		escreva("VALORES DE N1\n")
		para (inteiro linha = 0; linha<LINHA; linha++ ){
			
			para(inteiro coluna = 0; coluna<COLUNA; coluna++){
				escreva(N1[linha][coluna])
				escreva("\t")
			}
			escreva("\n")
		}

		escreva("VALORES DE N2\n")
		para (inteiro linha = 0; linha<LINHA; linha++ ){
			
			para(inteiro coluna = 0; coluna<COLUNA; coluna++){
				escreva(N2[linha][coluna])
				escreva("\t")
			}
			escreva("\n")
		}
		escreva("VALORES DE M1\n")
		para (inteiro linha = 0; linha<LINHA; linha++ ){
			
			para(inteiro coluna = 0; coluna<COLUNA; coluna++){
				escreva(M1[linha][coluna])
				escreva("\t")
			}
			escreva("\n")
		}
		escreva("VALORES DE M2\n")
		para (inteiro linha = 0; linha<LINHA; linha++ ){
			
			para(inteiro coluna = 0; coluna<COLUNA; coluna++){
				escreva(M2[linha][coluna])
				escreva("\t")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 845; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */