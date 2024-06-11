package EstruturaDeDados.atividades.primeiraLista;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionExercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> listaNum = new HashSet<Integer>();
		
		Scanner leia = new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+"º número: ");
			int numero = leia.nextInt();
			listaNum.add(numero);
		}
		Iterator<Integer> numero = listaNum.iterator();
		
		while(numero.hasNext()) {
			System.out.println(numero.next());
		}
	}

}
