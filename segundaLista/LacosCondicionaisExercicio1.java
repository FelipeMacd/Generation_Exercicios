package JavaBasico.atividades.segundaLista;

import java.util.Scanner;

public class LacosCondicionaisExercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		num3 = leia.nextInt();
		
		soma = num1 +num2;
		
		
		if (soma > num3) {
			System.out.println("A soma A+B é Maior que C.");
		}else if (soma < num3) {
			System.out.println("A soma de A+B é Menor que C.");
		}else {
			System.out.println("A soma de A+B é Igual a C.");
		}
		
	}

}
