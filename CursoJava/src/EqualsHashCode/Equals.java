package EqualsHashCode;

public class Equals {

	public static void main(String[] args) {

		
		//Usamos o método Equals e HastCode para comparação
		
		//Usamos a sobrescrita dos métodos Equals e HastCode para comparar Atributos e não o Obj em memória.
		
		Carro car1 = new Carro();
		car1.setNome("Corolla");
		Carro car2 = new Carro();
		car2.setNome("Corolla");
		
		
		
		if(car1.equals(car2)){
			System.out.println("Objetos são iguais");
		}else {
			System.out.println("Objetos diferentes");
		}

	}

}
