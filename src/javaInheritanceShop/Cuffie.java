package javaInheritanceShop;

public class Cuffie extends Prodotto {
	
	protected String colore;
	protected String tipo;
	
	public Cuffie (String nome, String marca, double prezzo, 
			String colore, String tipo ) {
		
		super(nome, marca, prezzo);
		
		this.colore = colore;
		this.tipo = tipo;
		this.codice = super.codice;
		
		
	}
	
	@Override
	public String toString() {
		return "Cuffie: " + super.toString() +
				" - colore: " + colore +
				" - tipo: " + tipo;
	}
}
