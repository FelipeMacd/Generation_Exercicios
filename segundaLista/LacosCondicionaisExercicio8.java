package JavaBasico.atividades.segundaLista;

import java.util.Scanner;

public class LacosCondicionaisExercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int operacao;
		float saldo = 1000, novoSaldo=0, saque, deposito;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Selecione a operaçao que deseja realizar: \n1- Verificar Saldo \n2- Saque \n3- Deposito");
		operacao = leia.nextInt();
		
		if (operacao < 1 || operacao >3) {
			System.out.println("\nOperaçao Inválida");
			
		}else {
			switch (operacao) {
			case 1:
				System.out.println("\nSaldo: "+saldo);
				break;
			case 2:
				System.out.println("\nDigite o valor que deseja sacar: ");
				saque = leia.nextFloat();
				if(saque > saldo) {
					System.out.println("Saldo insuficiente!");
				}else {
					novoSaldo = saldo-saque;
					System.out.println("Novo saldo: "+novoSaldo);
				}
				break;
			case 3:
				System.out.println("\nDigite o valor que deseja depositar: ");
				deposito = leia.nextFloat();
				novoSaldo = saldo+deposito;
				System.out.println("Novo saldo: "+novoSaldo);
			}
			
		}
	}

}
