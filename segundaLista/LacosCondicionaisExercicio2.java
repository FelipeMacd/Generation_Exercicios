package JavaBasico.atividades.segundaLista;

import java.util.Scanner;

public class LacosCondicionaisExercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com número: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			System.out.printf("O número %d é Par\n", numero);
		}else {
			System.out.printf("O número %d é Impar\n", numero);
		}
		if (numero < 0 ) {
			System.out.printf("\nO número %d é negativo\n", numero);
		}else if (numero > 0) {
			System.out.printf("\nO número %d é positivo\n", numero);
		}else {
			System.out.printf("\nO numero %d é zerado, não é positivo nem negativo\n", numero);
		}

	}

}
