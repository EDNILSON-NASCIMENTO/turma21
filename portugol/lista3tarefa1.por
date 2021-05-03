programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	/*
	 * pesquisa entre 20 de seus habitantes,coletando dados 
	 * sobre o salário e número de filhos. A prefeitura deseja 
	 * saber:  
	a) média do salário da população;
	b) média do número de filhos;
	c) maior salário;
	d) percentual de pessoas com salário até R$100,00.
	 */
	//VARIAVEIS
	/*
	inteiro
	caracter
	real
	*/
	const inteiro HABITANTES = 3
	real salario = 0.00
	inteiro filhos = 0
	real mediaSalarial = 0.00
	real totalSalario = 0.00
	real mediaFilhos = 0.00
	real totalFilhos = 0.00
	real maiorSalario = 0.00
	real percentualSalariosAte100 = 0.00
	real contadorSalarioAte100 = 0.00
	
	//ENTRADAS
	para (inteiro indice = 1;indice<=HABITANTES;indice++){
		escreva("Digite o salario do habitante ",indice," : R$ ")
		leia(salario)
		escreva("Digite o numero de filhos: ")
		leia(filhos)
		totalSalario = totalSalario + salario //totalizando o salario
		totalFilhos = totalFilhos + filhos
		se (salario > maiorSalario){
			maiorSalario = salario
		}

		se (salario <= 100){
			contadorSalarioAte100++	
		}
		
		
	}
	//PROCESSAMENTOS
	mediaSalarial = mat.arredondar((totalSalario / HABITANTES),2)
	mediaFilhos = mat.arredondar( (totalFilhos / HABITANTES),2)
	percentualSalariosAte100 =mat.arredondar( ((contadorSalarioAte100 / HABITANTES) * 100),2)
	//SAIDAS
	escreva("\n")
	escreva("+----------RESULTADOS PESQUISA ---------------+")
	escreva("\nTotal de salarios : R$ ",totalSalario)
	escreva("\nMédia salarial    : R$ ",mediaSalarial)
	escreva("\nMaior Salario     : R$ ",maiorSalario)
	escreva("\nTotal de filhos   : ",totalFilhos)
	escreva("\nMédia de filhos   : ",mediaFilhos)
	escreva("\nPercentual de pessoas com salario até 100 : ",percentualSalariosAte100,"%")
	escreva("\nFim de programa!!!")
	//escreva	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1805; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */