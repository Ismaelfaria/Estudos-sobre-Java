package cursojava.Classe;

public class Aluno {
		
		//Atributos do aluno
		//private = privados para a classe
		//publico = publico para as outras classes
		private String nome;
		public int idade;
		String dataNascimento;
		String registroGeral;
		String numeroCpf;
		
		public static String APROVADO = "Aprovado";
		
		
		public Aluno(int idade){
			this.idade = idade;
		}

		@Override
		public String toString() {
			return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
					+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + "]";
		}
		
		
		
	
}
