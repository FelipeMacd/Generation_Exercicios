package JavaBasico.atividades.primeiraLista;

import java.util.Scanner;

public class VariaveisEOperadoresExercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, dif;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o quarto número: ");
		n4 = leia.nextFloat();
		
		dif = (n1*n2)-(n3*n4);
				
		System.out.printf("Diferença: " + dif);

	}

}
