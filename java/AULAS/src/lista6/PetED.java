package lista6;


public class PetED {

	public static void main(String[] args) {
		
			
		Cachorro dog = new Cachorro("Djalma", 5);
		Cavalo panga = new Cavalo("Mito", 6);
		
		Caseiro dog2 = new Caseiro("titan", 4, "GRANDE", 'M');
		
		System.out.println(dog.getNome());
		System.out.println("idade do cavalo :"+panga.getIdade());
		
		dog.som();
		panga.som();
		dog2.som();

	}

}
