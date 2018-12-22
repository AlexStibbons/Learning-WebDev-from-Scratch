package test;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	private static String userInput() {
		String input = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			 input = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return input;
	}

	private static List<Korisnik> korisnici = new ArrayList<>();
	private static List<String> neprikladneReci = new ArrayList<>();
	private static int pozicija;
	// some private static lists or anything that needs to exist and be visible in the entire package
	
	public static void main(String[] args) throws IOException {
		
		neprikladneReci.add("tamo");
		neprikladneReci.add("neprikladno");
		
		korisnici.add(new Korisnik("u1", "ime 1", "prezime 1", "lozinka 1"));
		korisnici.get(0).getPoruke().add(new Poruka(korisnici.get(0), "1 poruka 1 tekst poruke"));
		
		korisnici.add(new Korisnik("u2", "ime 2", "prezime 2", "lozinka 2"));
		korisnici.get(1).getPoruke().add(new Poruka(korisnici.get(1), "2 poruka 1 neprikladno tamo"));
		korisnici.get(1).getPoruke().add(new Poruka(korisnici.get(1), "2 poruka 2 tekst"));
		
		korisnici.add(new Korisnik("u3", "ime 3", "prezime 3", "lozinka 3"));
		korisnici.get(2).getPoruke().add(new Poruka(korisnici.get(2), "3 poruka 1 tekst poruke tamo korisnika 3"));
		korisnici.get(2).getPoruke().add(new Poruka(korisnici.get(2), "3 poruka 2 korisnik 3 poruka"));
		korisnici.get(2).getPoruke().add(new Poruka(korisnici.get(2), "3 tamo poruka 3 komentar neprikladno korisnik 3"));
		
		
		System.out.println("korisnicko ime?");
		String unetoime = userInput();
		
		//int pozicija;
		
		for (int i = 0; i < korisnici.size(); i++) {
			if (unetoime.equalsIgnoreCase(korisnici.get(i).getKorisnickoIme())) {
				
				pozicija = i;
				
				System.out.println("Lozinka?");
				
				String unetalozinka = userInput();
				if (unetalozinka.equalsIgnoreCase(korisnici.get(i).getLozinka())) {
					program();
				}
			}
		}
		

	}
	
	//private static methods 
	
	private static void program() throws IOException {
		String izbor;
		
		do {
				
				meni();
				
				izbor = userInput();
	
				
				switch (izbor) {
				
				case "1":
					prikazPoruka();
					break;
				case "2":
					pretragaKomentara();
					break;
				case "3":
					unosKomentara();
					break;
				case "4":
					neprikladniKomentari();
					break;
				case "q":
					System.out.println("Izlazak iz programa.");
					break;
				default:
					System.out.println("Pogresan unos. Unesite ponovo: ");
				}
				
			} while (!izbor.equalsIgnoreCase("q"));
		}
	
	private static void meni() {
		System.out.println("\n*****Meni*****\n"
							+ "1. Prikaz svih poruka\n"
							+ "2. Pretraga komentara\n"
							+ "3. Unos komentara\n"
							+ "4. Spisak neprikladnih komentara\n"
							+ "q - izlaz\n");
		System.out.println("Unos:");
	}
	
	private static void prikazPoruka() {
		int brojac = 1;
		for (Korisnik korisnik : korisnici) {
			for (Poruka poruka : korisnik.getPoruke()) {
				System.out.println(brojac + ". " + poruka.getKorisnik().getIme() + " " + poruka.getKorisnik().getPrezime() + ", poruka: "
									+ poruka.getTekstPoruke() + " (broj reci: " + brojanjeReci(poruka.getTekstPoruke()) + ")");
				brojac++;
			}
		}
	}
	
	private static void nadjiRec(String pretraga) {
		int brojac = 1;
		for (Korisnik korisnik : korisnici) {
			for (Poruka poruka : korisnik.getPoruke()) {
				
				if (poruka.getTekstPoruke().contains(pretraga)) { // contains je case sensitive i nece raditi
																// ako se promasi upper ili lower case
					System.out.println(brojac + ". Celokupan tekst poruke je: " + poruka.getTekstPoruke());
					brojac++; //moze se uraditi i kao returns String
				}
				
			}
		}
	}
	
	private static void pretragaKomentara() {
		System.out.println("Unesite tekst za pretragu: ");
		String pretraga = userInput();
		
		nadjiRec(pretraga);
		
		
	}
	
	private static void unosKomentara() {
		
		System.out.println("Unesite komentar: ");
		String komentar = userInput();
		
		korisnici.get(pozicija).getPoruke().add(new Poruka(korisnici.get(pozicija), komentar));
		
	}
	
	private static void neprikladniKomentari() throws IOException {
		
		//int brojNReci = 0;
		PrintWriter outputStream = new PrintWriter(new FileWriter("src/test/text.txt"));

		for (Korisnik korisnik : korisnici) {
			for (Poruka poruka : korisnik.getPoruke()) {
				
				int brojReci = brojanjeReci(poruka.getTekstPoruke());
				int brojNReci = 0;
				
				for (String neprikladno : neprikladneReci) {

					if (poruka.getTekstPoruke().contains(neprikladno)) {
						brojNReci++;
					}
					
				}
				if (brojNReci > 0) {
					System.out.println("Poruka sa neprikladnim recima je -----" + poruka.getTekstPoruke());
					System.out.println("Broj neprikladnih reci u njoj je: " + brojNReci);
					System.out.println("Broj reci u njoj je: " + brojReci + "\n");
					double procenat = brojNReci * 100 / brojReci;
					System.out.println("Procenat neprikladnosti je: " + procenat + " procenata.\n");
					
					
					outputStream.println(procenat + " procenata neprikladnosti. Teskt poruke: " + poruka.getTekstPoruke());
				}
				
			}
		}
		outputStream.close();
		
	}
	
	private static int brojanjeReci(String tekst) {
		
		String[] brojreci = tekst.split(" ");
		return brojreci.length;
	}

}
