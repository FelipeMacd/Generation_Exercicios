package JavaBasico.atividades.primeiraLista;

import java.util.Scanner;

public class VariaveisEOperadoresExercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, salarioHora, adicNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Digite o valor o salário: ");
		salarioBruto = leia.nextFloat();
		salarioHora = salarioBruto/220;
		
		System.out.println("Digite a quantidade de horas trabalhadas no período noturno: ");
		adicNoturno = leia.nextFloat();
		adicNoturno = (float) (adicNoturno*(salarioHora*1.4));
		
		System.out.println("Digite a quantidade de horas extras trabalhadas: ");
		horasExtras = leia.nextFloat();
		horasExtras = (float) (horasExtras*(salarioHora*1.5));
		
		System.out.println("Digite o valor dos descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = (salarioBruto+adicNoturno+horasExtras)-descontos;
		
		System.out.printf("Salario líquido: R$" + salarioLiquido);
		

	}

}
