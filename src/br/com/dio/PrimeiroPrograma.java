package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.print(livros);
		
		/*int a=2;
		int b=3;
		
		System.out.println("Olá Mundo " +(a+b));*/

	}

}

class Livros {
 public String nome;
public String npag;
}