package modelo;

import java.util.Scanner;

public class Permutacoes {
	private static int[] p;

	private static void permuta(int[] vet, int n) {

		if (n == vet.length) {
			imprime();

		} else {

			for (int i = 0; i < vet.length; i++) {

				boolean achou = false;

				for (int j = 0; j < n; j++) {
					if (p[j] == vet[i])
						achou = true;
				}

				if (achou == false) {

					p[n] = vet[i];
					permuta(vet, n + 1);
				}

			}

		}

	}

	private static void imprime() {

		System.out.println();
		for (int i = 0; i < p.length; i++)
			System.out.print(p[i] + " ");

	}

	public static void main(String[] args) {
		// Classe de leitura do Teclado
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// Cria o vetor com os valores até n digitado pelo usuário
		int vetor1[] = new int[n];
		// povoa o vetor com valores de 1 até n
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = i + 1;
		}
		// vetor auxiliar
		p = new int[vetor1.length];
		// permuta o vetor
		Permutacoes.permuta(vetor1, 0);
	}

}