package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		/* criar objeto Gato */
		Gato gato = new Gato();
		System.out.println(gato);
		System.out.println("Sera que e isso mesmo!!!");
		System.out.println("Teste do ctrl + espaço");
		float a=7f;
		int b=2;
		float div;
		div=a/b;
		int x=10;
		int y=x++;
		a=x;
		System.out.println("O valor de Y:"+y);
		System.out.println("O valor de X:"+x);
		System.out.println("O valor de A:"+a);
	}

}
