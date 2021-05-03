programa
{
	
	funcao inicio()
	{
		//VARIAVEIS
		const inteiro ANOATUAL = 2021
		cadeia nome // " "
		caracter genero //' '
		inteiro anoNascimento
		inteiro idade
		
		//ENTRADAS
		escreva("Digite o nome: ")
		leia(nome)
		escreva("Digite o genero M-masculino, F-feminino ou O-outres :")
		leia(genero)
		escreva("Ano de nascimento: ")
		leia(anoNascimento)

		///PROCESSAMENTOS
		idade = ANOATUAL - anoNascimento
		se (genero =='F' ou genero == 'f'){
			se(idade<=18){
				escreva(nome," sua idade é ",idade," anos, e vc é jovem!!")
			}
			senao se(idade<=50){
				escreva(nome," sua idade é ",idade," anos, e vc é adulta!!")
			}
			senao {
				escreva(nome," sua idade é ",idade," anos, e vc é idosa!!")
			}
		}
		senao se (genero =='M' ou genero == 'm'){
			se(idade<=18){
				escreva(nome," sua idade é ",idade," anos, e vc é jovem!!")
			}
			senao se(idade<=50){
				escreva(nome," sua idade é ",idade," anos, e vc é adulto!!")
			}
			senao {
				escreva(nome," sua idade é ",idade," anos, e vc é idoso!!")
			}
		}
		senao se (genero =='O' ou genero == 'o'){
			se(idade<=18){
				escreva(nome," sua idade é ",idade," anos, e vc é jovem!!")
			}
			senao se(idade<=50){
				escreva(nome," sua idade é ",idade," anos, e vc é adulte!!")
			}
			senao {
				escreva(nome," sua idade é ",idade," anos, e vc é idose!!")
			}
		}
		senao {
			escreva("Vc não selecionou um genero correto. fui!!")
		}
		
		//SAIDAS


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 423; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */