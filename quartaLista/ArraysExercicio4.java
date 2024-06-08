package JavaBasico.atividades.quartaLista;

import java.util.Scanner;

public class ArraysExercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float [][] notas = new float[10][4];
		float [] medias = new float[10];
		int l, c, i;
		float somaNota=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0; l < 10; l++) {
			for (c=0; c < 4;c++) {
				System.out.println("\nDigite a nota do "+(l+1)+"º aluno:");
				notas[l][c] = leia.nextFloat();
				if (notas[l][c] < 0 || notas [l][c] > 10) {
					System.out.println("Nota Inválida! ");
					main(null); //Retorna o programa para o início e reinicia.
				}
				somaNota += notas[l][c]; 
			}
			
			medias[l] = somaNota /4;
			somaNota = 0;
			
		}
		for (i=0; i<medias.length; i++) {
			System.out.printf("\nA média do %d° aluno foi de : %.1f\n",(i+1), medias[i]);
		}
		
		
	}

}
