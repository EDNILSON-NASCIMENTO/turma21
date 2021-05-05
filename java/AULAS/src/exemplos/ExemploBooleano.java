package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploBooleano {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		String nome;
		char tipo;
		double salario;
		boolean emergencial = true; //true or false
		char aux;
		double imposto;
		
		//entradas
		System.out.println("Digite o nome :");
		nome = leia.next();
		System.out.println("M-masculino, F-feminina, O-outre :");
		tipo = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o salario mensal bruto :");
		salario = leia.nextDouble();
		System.out.println("Vc pegou o salario emergencial S/N: ");
		aux = leia.next().toUpperCase().charAt(0);
		if (aux=='S') {
			emergencial = true;
			
		}
		else {
			emergencial= false;
		}
		
		if ((salario*12)>60000) 
		{
				if (salario >= 5000 && salario <6000) 
				{
					imposto = (salario*12)*0.15;
					if (emergencial)
					{
						imposto += 3000;//tira onda 
						//imposto = imposto + 3000;
					}
					
					
				}
				//um dia aqui vai ter uma pergunta decente
				if (true) {
					
					System.out.println("valor digitado igual a 1");
					
				} else
				{
					
				}
				
				
				
		}
		
		
		
		

	}

}
