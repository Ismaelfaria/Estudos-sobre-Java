package EqualsHashCode;

import java.util.Objects;

public class Carro {
		
	String nome;
	String placa;
	String cor;
	
	//SET adiciona ou recebe dados aos atributos.
	//GET para resgarar ou obter o valor do atributo.

	public String getNome() {
		return nome;
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
		return Objects.hash(nome);
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
		return Objects.equals(nome, other.nome);
	}
	
	
	
	
	
}
