package GettersSetters;

import java.util.Objects;

public class Itens {

	private String nome;
	private int numero;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Itens other = (Itens) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numero, other.numero);
	}
	@Override
	public String toString() {
		return "Itens [nome=" + nome + ", numero=" + numero + "]";
	}
	
	
}
