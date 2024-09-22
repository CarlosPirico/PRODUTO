package app;
import models.*;


public class Main {

	public static void main(String[] args) {
		try {
			Produto produto1 = new Produto("Iogurte", "Danone", 2.00, 3.50);
			
			System.out.println(produto1.toString());
			
			Pessoa pessoa1 = new Pessoa("Carlos Pirico", 1.70, "30/08/2000");
			
			System.out.println(pessoa1.toString());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
