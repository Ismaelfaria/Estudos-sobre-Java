package Heranca;

public class Diretor extends Pessoa implements Autenticar{

	private String registroEducacao;
	private String tempoDirecao;
	private String titulacao;
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public String getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(String tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	//Uso do "OVERRIDE" para identificar que é um método sobrescrito
		@Override
		public void TestSobrescrita() {
			System.out.println("Sobrescrito Pelo Diretor");
		}
		
    //Método do contrato da interface
	@Override
	public boolean Autenticado() {
		return true;
	}
	
}
