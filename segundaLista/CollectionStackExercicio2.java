package EstruturaDeDados.atividades.segundaLista;

import java.util.Scanner;
import java.util.Stack;

public class CollectionStackExercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> pilhaLivros = new Stack<String>();
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nSelecione uma opção:"
					+ "\n\n1- Adicionar livros na pilhar"
					+ "\n2- Listar todos os livros"
					+ "\n3- Retirar livro da pilha"
					+ "\n0- Sair");
			op = leia.nextInt();
			
			switch(op) {
			
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome do livro que será adicionado: ");
				String livro = leia.nextLine();
				pilhaLivros.push(livro);
				System.out.println("\nPilha:\n"+pilhaLivros+"\nLivro Adicionado!");
				break;
			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nNão há livros para listar!");
				} else {
					System.out.println("\nLista de livros na pilha:\n"+pilhaLivros);
				}
				break;
				
			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				} else {
					pilhaLivros.pop();
					System.out.println("\nPilha: \n"+pilhaLivros+"\nUm livro foi retirado da pilha!");
				}
				break;
				
			case 0:
				leia.nextLine();
				System.out.println("\nPrograma finalizado!");
				break;
				
				default:
					System.out.println("\nOpção inválida. \nDigite uma das opções listada.");
			}
		} while (op !=0);
		

	}

}
