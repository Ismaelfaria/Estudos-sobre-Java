package Heranca;

public class mainnn {

	public static void main(String[] args) {
	
		
		Aluno a = new Aluno();
		Diretor d = new Diretor();
		
		//Não podemos usar diretamento o tipo pessoa pois ele esta marcado como 'abstract'
		//ou seja, agr ele serve apenas como um modelo, não podendo ser instanciado
		//apenas herdado.
		//Pessoa p = new Pessoa();
		
		
		a.TestSobrescrita();
		d.TestSobrescrita();

	}

}
