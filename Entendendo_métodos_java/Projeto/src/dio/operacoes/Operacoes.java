package dio.operacoes;

import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor1;
        int valor2;
        float resultado;

        System.out.println("Digite o primeiro valor:");
        valor1=scan.nextInt();

        System.out.println("Digite o primeiro valor:");
        valor2=scan.nextInt();

        resultado = soma(valor1, valor2);
        System.out.println("A soma é: " + resultado);
        System.out.println("A subtração é: " + subtracao(valor1, valor2));
        System.out.println("A multiplicação é: " + multi(valor1, valor2));
        System.out.println("A divisão é: " + div(valor1, valor2));
    }

    public static float soma(int valor1, int valor2) {
        return valor1 + valor2;
    }

    public static float subtracao(int valor1, int valor2) {
        return valor1 - valor2;
    }

    public static float multi(int val1, int val2) {
        return val1 * val2;
    }

    public static float div(float valor1, int valor2) {
        return valor1 / valor2;
    }
}
