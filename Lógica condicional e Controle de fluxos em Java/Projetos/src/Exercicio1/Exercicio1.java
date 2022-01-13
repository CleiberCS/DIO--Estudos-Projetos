package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int mes;
        System.out.println("Digite o mês(numero):");
        mes= scan.nextInt();

        if (mes>0 && mes < 4) {
            if (mes == 1) {
                System.out.println("Mes de Janeiro");
            } else if (mes == 2) {
                System.out.println("Mês de Fevereiro");
            } else {
                System.out.println("Mês de Março");
            }
        } else if (mes>3 && mes < 7) {
            if (mes == 4) {
                System.out.println("Mes de Abril");
            } else if (mes == 5) {
                System.out.println("Mês de Maio");
            } else {
                System.out.println("Mês de Junho");
            }
        } else if (mes>6 && mes < 10) {
            if (mes == 7) {
                System.out.println("Mes de Julho");
            } else if (mes == 8) {
                System.out.println("Mês de Agosto");
            } else {
                System.out.println("Mês de Setembro");
            }
        } else if (mes>9 && mes < 13) {
            if (mes == 10) {
                System.out.println("Mes de Outubro");
            } else if (mes == 11) {
                System.out.println("Mês de Novembro");
            } else {
                System.out.println("Mês de Dezembro");
            }
        }else{
            System.out.println("Valor Inválido!!!");
        }

        if(mes==1||mes==7||mes==12){
            System.out.println("Férias");
        }

    }
}
