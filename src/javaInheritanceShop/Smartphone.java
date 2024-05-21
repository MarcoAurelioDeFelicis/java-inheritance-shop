package javaInheritanceShop;

public class Smartphone extends Prodotto {
	
	protected String IMEI;
	protected long memoria;
	

	public Smartphone(String nome, String marca, double prezzo, 
			String imei, long memoria) {
		
		super(nome, marca, prezzo);
		
		this.IMEI = imei;
		this.memoria = memoria;
		this.codice = super.codice;
		
	}
	
	@Override
	public String toString() {
		return "Smartphone: " + super.toString() +
				"- memoria: " + memoria +
				"- imei: " + IMEI;
		
	}
}
