package JavaBasico.atividades.segundaLista;

import java.util.Scanner;

public class LacosCondicionaisExercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do Doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do Doador: ");
		idade = leia.nextInt();
		
		if (idade < 18 || idade >69) {
			System.out.println(nome +" você não está apto a doar sangue");
			
		} else if (idade >= 18 && idade <= 59) {
			System.out.println(nome +" você está apto a doar sangue");
			
		} else {
			System.out.println("É a sua primeira doação? ");
			primeiraDoacao = leia.nextBoolean();
			
			if ((idade >= 60 && idade <=69) && primeiraDoacao == false) {
				System.out.println(nome +" você está apto a doar sangue");
				} else {
				System.out.println(nome +" você não está apto a doar sangue");
				}
			}
		}
			
		
		
		

		
		
		

}

