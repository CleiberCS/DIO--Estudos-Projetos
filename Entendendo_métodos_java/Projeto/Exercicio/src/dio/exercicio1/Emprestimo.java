package dio.exercicio1;

public class Emprestimo {
    public static void emprestimo(float valor,int parcelas){
        if(parcelas<=5){
            float valorPagar= valor * (1 +taxaJuros1() );
            System.out.println("O valor a pagar será de: R$"+valorPagar);
        }
        else if(parcelas<=10){
            float valorPagar= valor * (1 + taxaJuros2());
            System.out.println("O valor a pagar será de: R$"+valorPagar);
        }
        else{
            System.out.println("Parcelamento inválido!!!");
        }

    }

    private static float taxaJuros2() {
        return 0.075f;
    }

    private static float taxaJuros1(){
        return 0.05f;
    }
}
