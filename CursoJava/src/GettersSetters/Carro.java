package GettersSetters;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carro {

	String nome;
	String placa;
	String cor;
	
	private List<Itens> its = new ArrayList<Itens>();
	
	
	//SET adiciona ou recebe dados aos atributos.
	//GET para resgarar ou obter o valor do atributo.

	
	public int getNumItens() {
		int somaItens = 0;
		
		for (Itens it : its) {
			somaItens += it.getNumero();
		}
		return somaItens;
	}
	
	public String getNome() {
		return nome;
	}
	public List<Itens> getIts() {
		return its;
	}
	public void setIts(List<Itens> its) {
		this.its = its;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cor, its, nome, placa);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(its, other.its) && Objects.equals(nome, other.nome)
				&& Objects.equals(placa, other.placa);
	}

	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", placa=" + placa + ", cor=" + cor + ", its=" + its + "]";
	}
	
	
	
	
	
}
