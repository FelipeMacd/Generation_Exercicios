package JavaBasico.atividades.segundaLista;

import java.util.Scanner;

public class LacosCondicionaisExercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int codProduto, quantidade, total;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\t\tEscolha o código do produto\n");
		System.out.println("1- Carrocho Quente \t\tPreço unitário: R$10,00\n2- X-salada \t\t\tPreço unitário: R$15,00\n3- X-bacon \t\t\tPreço unitário: R$18,00\n4- Bauru \t\t\tPreço unitário: R$12,00\n5- Refrigerante \t\tPreço unitário: R$8,00\n6- Suco de Laranja \t\tPreço unitário: R$13,00\n");
		codProduto = leia.nextInt();
		
		System.out.println("\nEscolha a quantidade desejada: ");
		quantidade = leia.nextInt();
		
		switch(codProduto) {
		case 1:
			total = quantidade*10;
			System.out.printf("Produto: Carrocho Quente \nValor Total: R$%d", total);
			break;
		case 2:
			total = quantidade*15;
			System.out.printf("Produto: X-salaDA \nValor tota: R$%d", total);
			break;
		case 3:
			total = quantidade*18;
			System.out.printf("Produto: X- bacon \nValor total: R$%d", total);
		case 4:
			total = quantidade*12;
			System.out.printf("Produto: Bauru \nValor total: R$%d", total);
		case 5:
			total = quantidade*8;
			System.out.printf("Produto: Refrigerante \nValor total: R$%d", total);
		case 6:
			total = quantidade*13;
			System.out.printf("Produto: Suco de Laranja \nValor total: R$%d", total);
			
		}

	}

}
