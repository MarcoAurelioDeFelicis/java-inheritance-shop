package javaInheritanceShop;

public class Main {

	public static void main(String[] args) {
		
		Prodotto prodotto = new Prodotto ("Gibson ", "Les Paul ", 1200.00) ;
		
		System.out.println("Nome prodotto: " + prodotto.getNome());
		System.out.println("Marca prodotto: " + prodotto.getMarca());
		System.out.println("Prezzo base prodotto: " + "euro " +prodotto.getPrezzo());
		System.out.println("Prezzo + Iva prodotto: " + "euro " + prodotto.prezzoConIva());
		System.out.println("Nome esteso: " + prodotto.nomeEsteso());
		
		
	}
}
