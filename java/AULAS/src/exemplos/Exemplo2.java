package exemplos;

public class Exemplo2 {

	public static void main(String[] args) {
		
		
		String times[] = {"SPFC","PALMEIRAS","SANTOS","CORINTHIANS"};
		
		/*
		for (int x=0; x< times.length; x++) {
			System.out.println("Nome time "+times[x]);
		}
		*/
		
		for (String nome : times) {
			System.out.println("Nome do time � "+nome);
		}
		
		
		
		
	}

}
