package EstruturaDeDados.atividades.primeiraLista;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionExercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> listaNum = new HashSet<Integer>();
		
		listaNum.add(2);
		listaNum.add(5);
		listaNum.add(1);
		listaNum.add(3);
		listaNum.add(4);
		listaNum.add(9);
		listaNum.add(7);
		listaNum.add(8);
		listaNum.add(10);
		listaNum.add(6);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		if (listaNum.contains(num)) {
			System.out.println("\nO número "+num+" foi encontrado!");
		}else {
			System.out.println("\nO número "+num+" não foi encontrado!");
		}
		
	}

}
