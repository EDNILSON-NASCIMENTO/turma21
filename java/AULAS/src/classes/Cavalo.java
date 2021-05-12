package classes;

public class Cavalo extends Mamifero implements Civilizado {

	
	@Override
	public void mamar() {
		System.out.println("mamadeira gigante....");
	}

	@Override
	public void levarVeterinario() {
		System.out.println("Levar pra cuida do pelo... ");
		
	}

	@Override
	public void treinar() {
		System.out.println("Corre na pista, do lado, em velocidade, trote, saltando....");
		
	}
}
