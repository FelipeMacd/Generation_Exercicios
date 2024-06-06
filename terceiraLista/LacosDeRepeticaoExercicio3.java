package JavaBasico.atividades.terceiraLista;

import java.util.Scanner;

public class LacosDeRepeticaoExercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade, menores=0, maiores=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while (idade >= 0) {
			if (idade < 21) {
				menores++;
			}else if(idade > 50) {
				maiores++;
			}
			System.out.println("\nDigite outra idade: ");
			idade = leia.nextInt();
		}
		System.out.println("\nTotal de pessoas menores de 21 anos: "+menores);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+maiores);

	}

}
