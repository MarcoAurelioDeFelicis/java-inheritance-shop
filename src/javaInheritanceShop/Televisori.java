package javaInheritanceShop;

public class Televisori extends Prodotto {
	
	protected int dimensioni;
	protected boolean smart;
	

	public Televisori (String nome, String marca, double prezzo, 
			int dimensioni, boolean smart ) {
		
		super(nome, marca, prezzo);
		
		this.dimensioni = dimensioni;
		this.smart = smart;
		this.codice = super.codice;
		
		
	}
	
	

}