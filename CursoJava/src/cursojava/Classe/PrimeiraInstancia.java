package cursojava.Classe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrimeiraInstancia {

	public static void main(String[] args) {

		//New Aluno é uma instância
		//aluno é uma referência
		Aluno aluno = new Aluno(18);
		Aluno alunoa;

		
		//Uso de static
		System.out.println(aluno.APROVADO);
		
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		maps.put(aluno.APROVADO, new ArrayList<Aluno>());
		
		/*
		for(Aluno alunor : alunoa) {
			if(aluno.APROVADO == "Aprovado") {
				maps.get(aluno.APROVADO).add(aluno);
			}
		}*/

	}

}
