import java.util.ArrayList;

public class Racun {
	
	private int brojRacuna;
	private String imeVlasnikaRacuna;
	private double iznos;
	
	protected static ArrayList<Racun> racuni = new ArrayList<>();
	
	public Racun() {
		
	}
	
	public Racun(int brojRacuna, String imeVlasnika, double iznos) {
		this.brojRacuna = brojRacuna;
		this.imeVlasnikaRacuna = imeVlasnika;
		this.iznos = iznos;
		racuni.add(this);
		System.out.println("Racun kreiran.");
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
