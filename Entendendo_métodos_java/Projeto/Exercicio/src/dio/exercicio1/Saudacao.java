package dio.exercicio1;

public class Saudacao {
    public static void saudacao(int hora) {
        if (hora >= 5 && hora < 12) {
            mensagemDia();
        } else {
            if (hora >= 12 && hora < 18) {
                mensagemTarde();
            } else {
                mensagemNoite();
            }
        }
    }

    private static void mensagemDia() {
        System.out.println("Bom dia!!!");
    }

    private static void mensagemTarde() {
        System.out.println("Bom Tarde!!!");
    }

    private static void mensagemNoite() {
        System.out.println("Bom Noite!!!");
    }
}
