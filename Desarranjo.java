package modelo;

import java.util.Scanner;

public class Desarranjo {

	private static void desarranja(int[] vet, int[] p, int cont, int n) {
		int i;
		boolean achou = false;
//		System.out.println(vet.length);
		
		if (cont == n) {
			System.out.println();
			for (i = 0; i < n; i++)
				System.out.print(p[i] + " ");

		} else {

			for (i =0; i < n; i++) {
				if ((p[i] == 0) & (i != cont)) {
					achou = false;
				} else {
					achou = true;
				}
				if (achou == false) {
					p[i] = vet[cont];
					desarranja(vet, p, cont + 1,n);
					p[i] = 0;
					
				}

			}

		}

	}

	public static void main(String[] args) {
		// Classe de leitura do Teclado
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// Cria o vetor com os valores até n digitado pelo usuário
		int vetor1[] = new int[n];
		int p[] = new int[n];
		// povoa o vetor com valores de 1 até n
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = i + 1;
		}
		// permuta o vetor
		Desarranjo.desarranja(vetor1, p, 0 , n);
	}

}