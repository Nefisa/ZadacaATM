
public class KreirajRacun extends Racun {

	public void kreirajRacun(int brojRacuna, String imeVlasnika, double iznos) {
		if (validacijaBrojaRacuna(brojRacuna) && validacijaIznosa(iznos)) {
			Racun racun = new Racun(brojRacuna, imeVlasnika, iznos);
		} else
			System.out.println("Nemoguce kreirati racun.");
	}

	public boolean validacijaBrojaRacuna(int brojRacuna) {
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

	public boolean validacijaIznosa(double iznos) {
		if (iznos < 0) {
			System.out.println("Iznos mora biti veci od nule.");
			return false;
		} else

			return true;

	}

}
