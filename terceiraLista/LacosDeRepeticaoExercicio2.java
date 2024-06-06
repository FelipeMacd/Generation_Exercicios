package JavaBasico.atividades.terceiraLista;

import java.util.Scanner;

public class LacosDeRepeticaoExercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, totalImpar=0, totalPar=0, i;
		
		Scanner leia = new Scanner(System.in);
		
		for (i=0;i<10;i++) {
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				totalPar +=1;
			}else {
				totalImpar +=1;
			}
		}
		System.out.println("\nTotal de números pares: "+totalPar);
		System.out.println("\nTotal de números ímpares: "+totalImpar);

	}

}
