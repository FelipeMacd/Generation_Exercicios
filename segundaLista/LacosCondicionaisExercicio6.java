package JavaBasico.atividades.segundaLista;

import java.util.Scanner;

public class LacosCondicionaisExercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		float salario, novoSalario;
		int codCargo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do Colaborador: ");
		nome = leia.nextLine(); //nextline aceita palavras compostas, mais de uma.
		
		System.out.println("Digite o Código do cargo do Colaborador: ");
		codCargo = leia.nextInt();
		
		System.out.println("Digite o salário do Colaborador: ");
		salario = leia.nextFloat();
		
		switch(codCargo) {
		case 1:
			novoSalario = (float) (salario*1.10);
			System.out.printf("Nome do colaborador: %s \nCargo: Gerente \nSalário: %.2f", nome, novoSalario);
			break;
		case 2:
			novoSalario = (float) (salario*1.07);
			System.out.printf("Nome do colaborador: %s \nCargo: Vendedor \nSalário: %.2f", nome, novoSalario);
		case 3:
			novoSalario = (float) (salario*1.09);
			System.out.printf("Nome do colaborador: %s \nCargo: Supervisor \nSalário: %.2f", nome, novoSalario);
		case 4:
			novoSalario = (float) (salario*1.06);
			System.out.printf("Nome do colaborador: %s \nCargo: Motorista \nSalário: %.2f", nome, novoSalario);
		case 5:
			novoSalario = (float) (salario*1.05);
			System.out.printf("Nome do colaborador: %s \nCargo: Estoquista \nSalário: %.2f", nome, novoSalario);
		case 6:
			novoSalario = (float) (salario*1.08);
			System.out.printf("Nome do colaborador: %s \nCargo: Técnico de TI \nSalário: %.2f", nome, novoSalario);
			
			
			
		}

	}

}
