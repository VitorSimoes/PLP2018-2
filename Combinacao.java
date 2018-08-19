package modelo;

import java.util.Scanner;

public class Combinacao {

	private static void combina(int num, int n, int k) {
		int i = num + 1;
		while (i <= n) {
			System.out.println("("+num+","+i+")");
			i += 1;
		}
	}

	public static void main(String[] args) {
		// Classe de leitura do Teclado
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		for (int num = 1; num < n + 1; num++) {
			Combinacao.combina(num, n, k);
		}

	}

}
