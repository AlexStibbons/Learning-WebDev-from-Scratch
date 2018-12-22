package test;

public class Poruka {
	
	private Korisnik korisnik;
	private String tekstPoruke;
	
	public Poruka(Korisnik korisnik, String tekstPoruke) {
		this.korisnik = korisnik;
		this.tekstPoruke = tekstPoruke;
	}

	public Poruka() {
		
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public String getTekstPoruke() {
		return tekstPoruke;
	}

	public void setTekstPoruke(String tekstPoruke) {
		this.tekstPoruke = tekstPoruke;
	}

	@Override
	public String toString() {
		return "Korisnik:" + korisnik.getIme() + ", tekst poruke:" + tekstPoruke;
	}

	
	
}
