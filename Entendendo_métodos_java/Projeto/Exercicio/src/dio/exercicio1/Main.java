package dio.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        float primeiroValor;
        float segundoValor;
        float resultado;
        float valor;
        int hora;
        int parcelas;

        //Calculadora
        System.out.println("Digite o primeiro valor: ");
        primeiroValor=scan.nextFloat();

        System.out.println("Digite o segundo valor: ");
        segundoValor= scan.nextFloat();

        resultado=Calculadora.somar(primeiroValor,segundoValor);
        System.out.println(primeiroValor+" + "+ segundoValor + " = "+ resultado);
        resultado=Calculadora.subtrair(primeiroValor,segundoValor);
        System.out.println(primeiroValor+" - "+ segundoValor + " = "+ resultado);
        resultado=Calculadora.multiplica(primeiroValor,segundoValor);
        System.out.println(primeiroValor+" * "+ segundoValor + " = "+ resultado);
        resultado=Calculadora.dividir(primeiroValor,segundoValor);
        System.out.println(primeiroValor+" / "+ segundoValor + " = "+ resultado);

        //saudação
        System.out.println("Digite a hora do dia:");
        hora= scan.nextInt();
        Saudacao.saudacao(hora);
        //Emprestimo

        System.out.println("Valor do emprestimo:");
        valor=scan.nextFloat();
        System.out.println("Número de parcelas:");
        parcelas=scan.nextInt();
        Emprestimo.emprestimo(valor,parcelas);
    }
}
