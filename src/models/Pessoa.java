package models;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Pessoa {
	// criando os atributos.
	private String nome;
	private Double altura;
	private LocalDate nascimento;
	private String email;
	
	// criando o construtor.
	public Pessoa(String nome, Double altura, String nascimento) throws Exception {
		this.nome = nome;
		this.altura = altura;
		this.nascimento = verificarData(nascimento);
		this.email = criarEmail(nome);
	}
	
	// metodo para validador de data.
	private LocalDate verificarData(String nascimento) throws Exception {
		// criando o molde que estarei recebendo pra depois converter.
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// pegando a data de hoje.
		LocalDate hoje = LocalDate.now();
		// usando a data de nascimento em string e convertendo para tipo LocalDate usando o molde. 
		LocalDate nascimentoDate = LocalDate.parse(nascimento, formatter);
		// validando de data que o usuario passou é menor que hoje.
		if (nascimentoDate.isBefore(hoje)) {
			return nascimentoDate;
		}
		throw new Exception("Data de nascimento invalido.");
		
	}
	
	// criar email atraves do nome do usuario.
	private String criarEmail(String nome) {
		// divindo o nome por espaço e deixando todas as letras minusculas e colocando dentro de um array.
		String[] nomeDiv = nome.toLowerCase().split(" ");
		return nomeDiv[0] + "." + nomeDiv[1] + "@facens.br";
	}
	
	// exibindo o resultado
	public String toString() {
		return "Nome: " + nome + "\n" + 
			   "Altura: " + altura + "\n" + 
				// convertendo o tipo LocalDate para data de tipo calendario brasileiro.
			   "Nascimento: " + nascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n" + 
			   "Email: " + email ;
	}
}
