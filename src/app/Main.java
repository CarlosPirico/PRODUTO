package app;
import models.*;


public class Main {

	public static void main(String[] args) {
		try {
			// criando produto.
			Produto produto1 = new Produto("Iogurte", "Danone", 2.00, 3.50);
			
			// mostrando o produto registrado com lucro que terá com a venda.
			System.out.println(produto1.toString());
			
			// Criando pessoa
			Pessoa pessoa1 = new Pessoa("Carlos Pirico", 1.70, "30/08/2000");
			
			// mostrando pessoa com o email criado.
			System.out.println(pessoa1.toString());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
