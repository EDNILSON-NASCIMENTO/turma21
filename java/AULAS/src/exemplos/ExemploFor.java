package exemplos;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
	/*
	
	 * pesquisa entre 20 de seus habitantes,coletando dados 
	 * sobre o sal�rio e n�mero de filhos. A prefeitura deseja 
	 * saber:��
	a) m�dia do sal�rio da popula��o;
	b) m�dia do n�mero de filhos;
	c) maior sal�rio;
	d) percentual de pessoas com sal�rio at� R$100,00.
	
	*/
	Scanner leia = new Scanner(System.in);
	final int HABITANTES = 3;
	double salario = 0.00;
	int filhos = 0;
	double mediaSalarial = 0.00;
	double totalSalario = 0.00;
	double mediaFilhos = 0.00;
	double totalFilhos = 0.00;
	double maiorSalario = 0.00;
	double percentualSalariosAte100 = 0.00;
	double contadorSalarioAte100 = 0.00;
		
	for (int indice=1;indice<=HABITANTES; indice++) 
	{
		
		System.out.printf("Digite o salario do habitante %d : R$",indice);
		salario = leia.nextDouble();
		System.out.print("Digite o numero de filhos: ");
		filhos = leia.nextInt();
		
		totalSalario = totalSalario + salario; //totalizando o salario
		totalFilhos = totalFilhos + filhos;
		
		if (salario > maiorSalario){
			maiorSalario = salario;
		}

		if (salario <= 100){
			contadorSalarioAte100++	;
		}
		
	}
	//PROCESSAMENTOS
	mediaSalarial = (totalSalario / HABITANTES);
	mediaFilhos = (totalFilhos / HABITANTES);
	percentualSalariosAte100 = ((contadorSalarioAte100 / HABITANTES) * 100);
	//SAIDAS
	System.out.println();
	System.out.println("+----------RESULTADOS PESQUISA ---------------+");
	System.out.printf("\nTotal de salarios : R$ %.2f",totalSalario);
	System.out.printf("\nM�dia salarial    : R$ %.2f",mediaSalarial);
	System.out.printf("\nMaior Salario     : R$ %.2f",maiorSalario);
	System.out.printf("\nTotal de filhos   : %.0f ",totalFilhos);
	System.out.printf("\nM�dia de filhos   : %.2f",mediaFilhos);
	System.out.printf("\nPercentual de pessoas com salario at� R$ 100 : %.2f%% ",percentualSalariosAte100);
	System.out.println("\nFim de programa!!!");
	
	}

}
