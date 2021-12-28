package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;

		System.out.println("Digite o primeiro numero:");
		a = scan.nextInt();
		System.out.println("Digite o segundo numero:");
		b = scan.nextInt();

		int soma = soma(a, b);
		float div = divisao(a, b);
		System.out.println("A soma e " + soma);
		System.out.println("A divisao e " + div);

	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static float divisao(float a, float b) {
		return a / b;
	}

}
