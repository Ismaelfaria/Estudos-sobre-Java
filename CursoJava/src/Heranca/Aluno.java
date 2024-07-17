package Heranca;

public class Aluno extends Pessoa {

	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private String diciplina;
	
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	public String getDiciplina() {
		return diciplina;
	}
	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}
	//Uso do "OVERRIDE" para identificar que é um método sobrescrito
	//Seguindo os princípios de POLIMORFISMO, pois podemos ter comportamentos direrentes dos métodos da classe BASE
	//Atravéis da palavra 'Override'.
	@Override
	public void TestSobrescrita() {
		System.out.println("Sobrescrito Pelo Aluno");
	}
	
	
}
