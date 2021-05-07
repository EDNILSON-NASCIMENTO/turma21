package exemplos;

import java.util.Scanner;

public class CadTimes {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		String times[] = {"SPFC", "SCCP", "SEP", "SFC"};
		String nomes[] = {"SAO PAULO","CORINTHIANS", "PALMEIRAS","SANTOS"};
		int pontos[] = {10,8,9,4};
		String aux;
		int indice=0;
		char op;
		System.out.println("Relação de times");
		for (String x : times) {
			System.out.println(x);
		}
		System.out.println("Digite o codigo do time: ");
		aux = leia.next().toUpperCase();
		for (int x = 0; x<times.length ; x++) {
			if (aux.equals(times[x])) {
				indice = x;
				break;
			} else
			{
				indice = 100;
			}
		}
		if (indice == 100) {
			System.out.println("Vc não digitou um codigo valido!!");
		} 
		else {
			System.out.println("Voce escolheu o "+nomes[indice]+" que tem "+pontos[indice]+" pontos");
		}
		
		
		

	}

}
