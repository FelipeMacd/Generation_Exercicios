package EstruturaDeDados.atividades.primeiraLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionExercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> listaCores = new ArrayList<>();
		
		for (int i=0; i<5; i++) {
			System.out.println("Digite a "+(i+1)+"º cor: ");
			String cor = leia.nextLine();
			listaCores.add(cor);
		}
		System.out.println("\nLista de todas as cores:");
		for (String cores:listaCores) {
			System.out.println(cores);
		}
		
		Collections.sort(listaCores);
		System.out.println("\nCores ordenadas: ");
		for (String corOrdenada:listaCores) {
			System.out.println(corOrdenada);		
		}
	}

}
