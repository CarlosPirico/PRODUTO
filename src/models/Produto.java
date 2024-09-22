package models;

public class Produto {
	// criando os atributos.
	private String nome;
	private String marca;
	private Double custo;
	private Double venda;
	
	// criando o construtor.
	public Produto(String nome, String marca, Double custo, Double venda) {
		this.nome = nome;
		this.marca = marca;
		this.custo = custo;
		this.venda = venda;
	}
	
	// metodo para calcular o lucro.
	public Double lucro() {
		return venda - custo;
	}
	
	// exibindo o resultado.
	public String toString() {
		return "Nome: " + nome + "\n" +
			   "Marca: " + marca + "\n" +
			   "Custo: " + custo + "\n" +
			   "Venda: " + venda + "\n" +
			   "Lucro: " + lucro() + "\n";
	}
}
