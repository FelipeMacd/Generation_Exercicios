package JavaBasico.atividades.primeiraLista;

import java.util.Scanner;

public class VariaveisEOperadoresExercicio1 { //

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Novo salário: R$" + novoSalario);
		

	}

}
