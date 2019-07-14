package test;

import java.util.ArrayList;
import java.util.List;

public class Korisnik {
	
	private String korisnickoIme;
	private String ime;
	private String prezime;
	private String lozinka;
	
	private List<Poruka> poruke = new ArrayList<>();
	
	public Korisnik() {
		
	}
	
	public Korisnik(String korisnickoIme, String ime, String prezime, String lozinka) {
		this.korisnickoIme = korisnickoIme;
		this.ime = ime;
		this.prezime = prezime;
		this.lozinka = lozinka;
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public List<Poruka> getPoruke() {
		return poruke;
	}

	public void setPoruke(List<Poruka> poruke) {
		this.poruke = poruke;
	}

	@Override
	public String toString() {
		return "Korisnik [korisnickoIme=" + korisnickoIme + ", ime=" + ime + ", prezime=" + prezime + ", lozinka="
				+ lozinka + "]";
	}
	
	

}
