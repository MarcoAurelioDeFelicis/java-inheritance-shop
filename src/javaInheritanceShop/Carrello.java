package javaInheritanceShop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CIAO! inserisci un prodotto tra questi nel tuo carrello \n "
				          + " SCEGLI TRA : \n"
				          + " - Smartphone \n"
				          + " - Televisore \n"
				          + " - Cuffie");
		String UserProdotto = scan.nextLine();
		
		System.out.println("inserire nome Prodotto : ");
		String nome = scan.nextLine();
		
		System.out.println("inserire marca Prodotto : ");
		String marca = scan.nextLine();
		
		System.out.println("inserire prezzo Prodotto : ");
		double prezzo = Double.parseDouble(String.format("%.2f", scan.nextDouble()));

		Prodotto prodotto;
		
		switch (UserProdotto.toLowerCase()) {
		
		case "smartphone":
			System.out.println("inserire codice IMEI: ");
			String IMEI = scan.nextLine();
			System.out.println("inserire peso memoria: ");
			long memoria = scan.nextLong();
			
			prodotto = new Smartphone (nome, marca, prezzo, IMEI, memoria);
			break;
			
		case "televisore":
			System.out.println("inserire dimensioni TV: ");
			int dimensioni = scan.nextInt();
			System.out.println("è una smart tv? SI / NO");
			String userScan = scan.nextLine();
			String userSi = userScan.toLowerCase();
			boolean smart = false;
			
			if (userSi.equals("si")) {
				smart = true;
			}else{
				smart = false;
			}
			
			prodotto = new Televisori(nome, marca, prezzo, dimensioni, smart);
			break;
			
		case "cuffie":
			System.out.println("inserire colore Cuffie: ");
			String colore = scan.nextLine();
			System.out.println("inserire tipo di Cuffie (WIRLES / CABLE): ");
			String tipo = scan.nextLine();
			
			prodotto = new Cuffie (nome, marca, prezzo, colore, tipo);
			break;
			
		default :
			System.out.println("ALLERT! PRODOTTO NON VALIDO!!");
			return;
			
		}
		
			//STAMPA PRODOTTO COSTRUITO DALL'UTENTE NEL CARRELLO
			System.out.println("\n"+ "il Prodotto : " + prodotto + "è stato inserito nel carrello");
			
			scan.close();
		
		
	}

}
