package JavaBasico.atividades.segundaLista;

import java.util.Scanner;

public class LacosCondicionaisExercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1, num2,res;
		int operacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		num1 = leia.nextFloat();
		System.out.println("\nDigite o 2º número: ");
		num2 = leia.nextFloat();
		System.out.println("\nQual operaçao deseja realizar: \n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão");
		operacao = leia.nextInt();
		
		switch(operacao) {
		case 1:
			res = num1 + num2;
			System.out.printf("A soma dos dois números é: %.2f", res);
			break;
		case 2:
			res = num1 - num2;
			System.out.printf("A subtração dos dois números é: %.2f", res);
			break;
		case 3:
			res = num1 * num2;
			System.out.printf("A soma dos dois números é: %.2f", res);
			break;
		case 4:
			res = num1 / num2;
			System.out.printf("A soma dos dois números é: %.2f", res);
			break;
		case 5:
			if (operacao < 1 || operacao > 4) {
				System.out.println("Operação Inválidada");
			}
			
		}
		
	}

}
