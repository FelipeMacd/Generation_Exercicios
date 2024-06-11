package EstruturaDeDados.atividades.primeiraLista;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> listaNum = new ArrayList<>();
		int numero;
		
		listaNum.add(2);
		listaNum.add(5);
		listaNum.add(1);
		listaNum.add(3);
		listaNum.add(4);
		listaNum.add(7);
		listaNum.add(9);
		listaNum.add(8);
		listaNum.add(10);
		listaNum.add(6);
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if(listaNum.contains(numero)) {
			System.out.println("O número "+numero+" está na posição: "+listaNum.indexOf(numero));
		} else {
			System.out.println("O número "+numero+" não foi encontrado!");
		}
		
	}

}
