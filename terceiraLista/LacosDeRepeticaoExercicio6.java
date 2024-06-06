package JavaBasico.atividades.terceiraLista;

import java.util.Scanner;

public class LacosDeRepeticaoExercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, somaMultTres=0, mediaMultTres = 0, contador=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero % 3 == 0) {
				somaMultTres += numero;
				contador++;
			}
			
		}while(numero != 0);
		
		if (contador == 0) {
			System.out.println("Não foi possivel achar a média");
		}else {
			mediaMultTres = somaMultTres / (contador-1);
		}
		
		System.out.println("\nA média de todos o números multiplos por 3 é: "+mediaMultTres);
			
			
	}

}
