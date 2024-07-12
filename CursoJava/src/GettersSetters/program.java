package GettersSetters;

public class program {

	public static void main(String[] args) {
		
		Carro car = new Carro();
		car.setNome("Joao");
		
		Carro car5 = new Carro();
		car5.setNome("Joao77");
		
		Itens it = new Itens();
		it.setNome("Banco");
		it.setNumero(1);
		
		Itens it2 = new Itens();
		it2.setNome("Volante");
		it2.setNumero(6);
		
		Itens it3 = new Itens();
		it3.setNome("Vidro");
		it3.setNumero(1);
		
		
//  Adiciona as os objetos a lista
		car.getIts().add(it);
		car.getIts().add(it2);
		car.getIts().add(it3);

		
		
		
		System.out.println(car.getNumItens());

		
		
	}

}
