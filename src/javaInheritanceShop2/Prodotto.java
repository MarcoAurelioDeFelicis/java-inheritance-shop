package javaInheritanceShop2;

import java.util.Random;

public class Prodotto {
	
	private int codice;	
	private String nome;
	private String marca;	
	private double prezzo;	
	private static final int Iva = 22;
	
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
		return prezzo + (this.prezzo * Iva /100);
	}
	
	public String nomeEsteso() {
		return String.format("%08d", codice) + " - " + nome;
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
	//GETTER E SETTER/

}
