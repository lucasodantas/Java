package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int [][] mat = new int [m][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat [i][j] = sc.nextInt();
			}
		}
		char r;
		do {
			System.out.println("Digite o número que deseja localizar");
			int numero = sc.nextInt();
			
			for (int i=0; i<mat.length; i++) {
				for (int j=0; j<mat[i].length; j++){
					if (mat[i][j] == numero){
						System.out.println("Posição " + i + ", " + j);
						if (j > 0) {
							System.out.println("Esquerda: " + mat[i][j-1]);
						}
						if (i > 0) {
							System.out.println("Cima: " + mat[i-1][j]);
						}
						if (j < mat[i].length-1) {
							System.out.println("Direita: " + mat[i][j+1]);
						}
						if (i < mat.length-1) {
							System.out.println("Baixo: " + mat[i+1][j]);
						}
				}
			}
			}
		System.out.println("Deseja tentar novamente.");
		System.out.println("Sim ou Não ?");
		String resp = sc.next();
		r = resp.charAt(0);
		
		} while ( r == 's' || r == 'S');
		
		System.out.println("Obrigado!");
		sc.close();
		}

}
