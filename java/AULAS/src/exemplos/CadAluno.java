package exemplos;

public class CadAluno {

	public static void main(String[] args) {
		
		int contador = 0;
		String alunos[] = {"Alexandre Salerno","Alexsander da Silva Sousa","Aline Moreira Brilhante","Ana Fl�via Porto Silva Neves","And�ra Finot da Silva","arthur reis allen","Barbara dos Santos","Bruno Wesley Callachi Rocha","Dafhne Noemi da Silva Novais","David da Costa Mariano","Elielthon Soares de Souza","Erika Rosany de Almeida Lima","Fabricio Siqueira Macedo","Fernando Salom�o Constancio","Giovanna Cirillo Torres","Guilherme Mendes Carvalho","Guilherme Monteiro Lopes","Isabelli Santos Silva","Israel Dantas da Silva","Jessica Yuki Toyota","Jonatas Michel de Cardoso Vieira","Jos� Luis Correia dos Santos","Juliana Brito Favero Ribeiro","Lorrans Matildes Facca","Lucas Teodoro de Sousa","Maria Lu�sa Maricato","Mateus Rosendo Firmino de Oliveira","Matheus de Souza Barbosa","Nathalia Beatriz Silva Pereira","Pedro Henrique de Azevedo Magalh�es","Renato Novais da Silva","Renato Yukio Ossiama Nakamura","Robson de Jesus Vasconcelos","Tainah Vinha","Vinicius Martins Santos"};
		System.out.println("FOR NORMAL");
		for (int x=0; x<alunos.length; x++) {
			System.out.println("NOME :"+alunos[x]);
		}
		System.out.println("FOR EACH");
		for (String y : alunos) {
			System.out.println("NOME :"+y);
		}
		
		/*
		
		for (String nome: alunos) {
			contador++;
			System.out.println("Aluno "+contador+" - "+nome);
		}
		*/

	}

}
