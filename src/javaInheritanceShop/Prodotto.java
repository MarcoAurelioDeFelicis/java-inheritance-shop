package javaInheritanceShop;

import java.util.Random;

public class Prodotto {
	
	protected int codice;	
	protected String nome;
	protected String marca;	
	protected double prezzo;	
	protected static final int Iva = 22;
	
	public Prodotto () {
		
	}
	
    public Prodotto (String nome, String marca, double prezzo ) {
		
		this.codice = randomCode();
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
	}


	public int randomCode() {
		Random random = new Random();
		return random.nextInt(10000000);
	}
	

	public double prezzoBase() {
		return prezzo;
	}
	
	public double prezzoConIva() {
		return this.prezzo + (this.prezzo * Iva /100);
	}
	
	public String nomeEsteso() {
		return String.format("%08d", getCodice()) + " - " + this.nome;
	}

	//GETTER E SETTER
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getCodice() {
		return codice;
	}


	public void setCodice(int codice) {
		this.codice = codice;
	}
	
	public static int getIva() {
		return Iva;
	}

	//GETTER E SETTER/
	
	@Override
	public String toString () {
		return "\n" + "Codice Prodotto: " + String.format("%08d", codice) + "\n" +
			"Nome: " + nome + "\n" +
			"Marca: " + marca + "\n" +
			"Prezzo: $ " + String.format("%.2f" , prezzoBase()) + "\n" +
			"Prezzo + Iva: $ " + String.format("%.2f" , prezzoConIva());			
				
	}
}
