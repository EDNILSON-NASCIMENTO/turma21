package programas;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ErroARquivo {

	public static void main(String[] args) {
		
		File arquivo = new File("C:\\temp1\\lista.txt.txt");
		Scanner leia = null;
		try {
			leia = new Scanner(arquivo);
			while (leia.hasNextLine()) {
				System.out.println(leia.nextLine());
			}
			
		}
		catch ( IOException erro) {
			System.out.println("Erro na abertura do arquivo!!!");
			//erro.printStackTrace();
		}
		finally {
			if (leia !=null) {
				leia.close();
			}
		}
		System.out.println("FIM DE PROGRAMA!!!");
	}

}
