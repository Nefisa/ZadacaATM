import java.util.ArrayList;

public class Racun {

	private int brojRacuna;
	private String imeVlasnikaRacuna;
	private double iznos;

	protected static ArrayList<Racun> racuni = new ArrayList<>(); // pohranjuje podatke o svim racunima

	public Racun() {

	}

	private Racun(int brojRacuna, String imeVlasnika, double iznos) {
		this.brojRacuna = brojRacuna;
		this.imeVlasnikaRacuna = imeVlasnika;
		this.iznos = iznos;
		racuni.add(this);
	}

	// metoda kreirajRacun() kreira objekat Racun, tj poziva konstruktor ove klase,
	// ukoliko su ispunjeni svi uslovi
	// ne dozvoljava kreiranje racuna, ukoliko jedan od uslova nije ispunjen

	public static void kreirajRacun(int brojRacuna, String imeVlasnika, double iznos) {
		if (validacijaBrojaRacuna(brojRacuna) && validacijaIznosa(iznos)) {
			Racun racun = new Racun(brojRacuna, imeVlasnika, iznos);
			System.out.println("Racun kreiran.");
		} else
			System.out.println("Nemoguce kreirati racun.");
	}

	
	// provjerava da li je uneseni broj racuna validan, tj. da li ispunjava sve uslove
	public static boolean validacijaBrojaRacuna(int brojRacuna) {
		if (brojRacuna < 0) {
			System.out.println("Broj racuna ne smije biti negativan broj.");
			return false;
		}
		for (Racun element : racuni) {
			if (element.getBrojRacuna() == brojRacuna) {
				System.out.println("Racun pod tim brojem vec postoji u sistemu.");
				return false;
			}
		}
		return true;

	}

	// provjerava da li je uneseni iznos validan tj da li ispunjava sve uslove
	public static boolean validacijaIznosa(double iznos) {
		if (iznos < 0) {
			System.out.println("Iznos mora biti veci od nule.");
			return false;
		} else

			return true;

	}

	public int getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(int brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getImeVlasnikaRacuna() {
		return imeVlasnikaRacuna;
	}

	public void setImeVlasnikaRacuna(String imeVlasnikaRacuna) {
		this.imeVlasnikaRacuna = imeVlasnikaRacuna;
	}

	public double getIznos() {
		return iznos;
	}

	public void setIznos(double iznos) {
		this.iznos = iznos;
	}

}
