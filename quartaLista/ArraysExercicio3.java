package JavaBasico.atividades.quartaLista;

import java.util.Scanner;

public class ArraysExercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] vetNumeros = new int[3][3];
		int numero, l, c, i, elementoDiagPrinc, somaElementoDiagPrinc=0, elementoDiagSec, somaElementoDiagSec=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				System.out.println("Digite um número: ");
				vetNumeros[l][c] = leia.nextInt();
			}
		}
		
		System.out.println("\nElementos da diagonal principal: ");
		for(i=0;i<3;i++) {
			elementoDiagPrinc = vetNumeros[i][i];
			somaElementoDiagPrinc += elementoDiagPrinc;
			System.out.printf(elementoDiagPrinc + " ");
		}
		
		System.out.println("\nElementos da diagonal secundária: ");
		for(i=0;i<3;i++) {
			elementoDiagSec = vetNumeros[i][(2-i)];
			somaElementoDiagSec +=  elementoDiagSec;
			System.out.printf(elementoDiagSec + " ");
		}
		
		System.out.println("\n\nSoma dos elementos da diagonal principal: "+somaElementoDiagPrinc);
		System.out.println("\nSoma dos elementos da diagonal secundária: "+somaElementoDiagSec);
			
	}

}
