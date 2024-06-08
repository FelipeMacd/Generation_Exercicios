		package JavaBasico.atividades.quartaLista;

import java.util.Scanner;

public class ArraysExercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]vetNumeros = {2,5,1,3,4,9,7,8,10,6};
		int numero, x;
		boolean encontrado = false;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		
		for (x=0;x < vetNumeros.length;x++) { //.length conta a quantidade de elementos de uma lista ou string.
			if (numero == vetNumeros[x]) {
				System.out.println("O número "+numero+" está localizado na posição: "+(x+1));
				encontrado = true;
			}
		}
		if (!encontrado) { 
			System.out.println("\nO número "+numero+" não foi encontrado");
			main(null); //Retorna o programa do inicio e reinicia.
		}
		
		
	}

}
