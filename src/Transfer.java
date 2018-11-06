
public class Transfer extends Racun {
	
	// metode za transakciju su odvojene u ovu klasu zbog preglednosti
	// obzirom da u klasi racun postoji metoda validacijaRacuna(), a u ovoj provjeraRacuna(), da ne bi doslo do konfuzije
	// iako sliène, navedene metode testiraju drugacije uslove 

	public void transfer(int brojSource, int brojTarget, double iznos) {
		if (provjeraRacuna(brojSource) && provjeraRacuna(brojTarget) && provjeraIznosa(iznos) && brojSource != brojTarget) {
			podigniNovac(brojSource, iznos);
			uplatiNovac(brojTarget, iznos);
			System.out.println("Transakcija uspjesno izvrsena.");
		}
		else
			System.out.println("Nemoguce izvrsiti transakciju.");
	}

	public void podigniNovac(int brojRacuna, double iznos) {
		if (provjeraRacuna(brojRacuna) && provjeraIznosa(iznos) && iznos > 0) {
			for (Racun racun : racuni)
				if (racun.getBrojRacuna() == brojRacuna) {
					racun.setIznos(racun.getIznos() - iznos);
					System.out.println("Sa racuna broj " + racun.getBrojRacuna() + " podignut iznos " + iznos);
					System.out.println("Iznos na racunu: " + racun.getIznos());
				}
		} else
			System.out.println("Nemoguce ostvariti transakciju.");

	}
	
	
	public boolean provjeraRacuna(int brojRacuna) {

		for (Racun racun : racuni) {
			if (racun.getBrojRacuna() == brojRacuna)
				return true;
		}
		return false;
	}

	public boolean provjeraIznosa(double iznos) {

		for (Racun racun : racuni) {
			if (racun.getIznos() - iznos > 0)
				return true;
		}
		return false;
	}

	public void uplatiNovac(int brojRacuna, double iznos) {

		if (provjeraRacuna(brojRacuna) && iznos > 0) {
			for (Racun racun : racuni)
				if (racun.getBrojRacuna() == brojRacuna) {
					racun.setIznos(racun.getIznos() + iznos);
					System.out.println("Na racun broj " + racun.getBrojRacuna() + " zuplacen iznos " + iznos);
					System.out.println("Iznos na racunu: " + racun.getIznos());

				}

		}

	}

	public void informacijeORacunu(int brojRacuna) {
		if (provjeraRacuna(brojRacuna)) {
			for (Racun racun : racuni) {
				if (racun.getBrojRacuna() == brojRacuna) {
					System.out.println("Stanje za broj racuna: " + racun.getBrojRacuna());
					System.out.println("Ime vlasnika: " + racun.getImeVlasnikaRacuna());
					System.out.println("Iznos na racunu : " + racun.getIznos());
				}

			}
		} else
			System.out.println("Ne postoji racun sa tim brojem u sistemu.");
	}
}