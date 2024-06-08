package JavaBasico.atividades.quartaLista;

import java.util.Scanner;

public class ArraysExercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]numeros = new int[10];
		int x, somaTotal=0;
		float mediaTotal;
		
		
		Scanner leia = new Scanner(System.in);
		
		for (x=0;x<10;x++) {
			System.out.println("Digite um número: ");
			numeros[x] = leia.nextInt();
			somaTotal += numeros[x];
			
		}
		mediaTotal = somaTotal / x;
		
		System.out.println("\nSoma: "+somaTotal);
		System.out.printf("\nMédia: %.1f \n",mediaTotal);
		
		System.out.println("\nNúmeros Impares: ");
		for (x = 0; x < numeros.length; x++) {
			if(numeros[x] % 2 == 0) {
				System.out.printf(numeros[x] + " ");
			}
		}
		System.out.println("\nNúmeros pares: ");
		for (x = 0; x < numeros.length; x++) {
			if(numeros[x] % 2 == 1) {
				System.out.printf(numeros[x] + " ");
			}
		}
		
	}

}
