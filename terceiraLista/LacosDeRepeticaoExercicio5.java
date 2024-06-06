package JavaBasico.atividades.terceiraLista;

import java.util.Scanner;

public class LacosDeRepeticaoExercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, somaTotal=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			
			if (numero > 0) {
				somaTotal += numero;
			}
			
		}while(numero != 0);
		System.out.println("\nA soma dos números positivos é: "+somaTotal);

	}

}
