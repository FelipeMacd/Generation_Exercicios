package EstruturaDeDados.atividades.segundaLista;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionQueueExercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<String>();
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nSelecione uma opção:"
					+ "\n\n1- Adicionar cliente na fila"
					+ "\n2- Listar todos os clientes"
					+ "\n3- Retirar Cliente da fila"
					+ "\n0- Sair ");
			op = leia.nextInt();
			
		switch(op) {
				
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome do cliente que deseja incluir na fila: ");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println("\nFila:\n"+fila+"\nCliente adicionado!");
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("\nA Fila está vazia!");
					leia.nextLine();
				}else {
					System.out.println("\nLista de Clientes na fila: "+fila);
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("Não há Cliente para retirar da fila!");
				}else {
					fila.remove();
					System.out.println("\nFila: \n"+fila+"\nCliente foi Chamado!");
				}
			case 0:
				System.out.println("\nPrograma Finalizado!");
				
				default:
					System.out.println("\nOpção inválida \nDigite uma das opções listada.");
			}
		} while (op != 0);
		
	}

}
