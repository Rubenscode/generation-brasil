package exerciciosLista7;

public class CriarAnimal {

	public static void main(String[] args) {
		Cachorro cachorro01 = new Cachorro();
		Cavalo cavalo01 = new Cavalo();
		Preguica preguica01 = new Preguica();
		
		cachorro01.setNome("Cachorro");
		cachorro01.setIdade(17);
		cachorro01.setSom("rolf rolf");
		cachorro01.setMovimento("Corre");
		
		cachorro01.emitirSom();
		cachorro01.movimento();
		cachorro01.infoAnimal();
		
		cavalo01.setNome("Cavalo");
		cavalo01.setIdade(10);
		cavalo01.setSom("hinn in in");
		cavalo01.setMovimento("Corre");
		
		cavalo01.emitirSom();
		cavalo01.movimento();
		cavalo01.infoAnimal();
		
		preguica01.setNome("Bicho ");
		preguica01.setIdade(30);
		preguica01.setSom("Eu assobio");
		preguica01.setMovimento("Sobe na Arvore");
		
		preguica01.emitirSom();
		preguica01.movimento();
		preguica01.infoAnimal();

	}

}
