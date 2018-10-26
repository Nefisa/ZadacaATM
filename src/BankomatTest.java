import java.util.Scanner;

public class BankomatTest {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		bankomat();
	}
		
		public static void bankomat() {
		int izbor;
		System.out.println("Izaberite opciju:");
		System.out.println("1. Kreiranje racuna");
		System.out.println("2. Transfer novca");
		System.out.println("3. Stanje racuna");
		
		izbor = input.nextInt();
		while (izbor != 1 && izbor != 2 && izbor != 3){
			System.out.println("Pogresan unos. Pokusajte ponovo.");
			izbor = input.nextInt();
		}

		switch (izbor) {
		case 1:
			kreiranjeRacuna();
			break;
		case 2:
			transfer();
			break;
		case 3:
			ispis();
			break;
		}
	}

	public static void kreiranjeRacuna() {

		System.out.println("Unesite broj racuna: ");
		int brojRacuna = input.nextInt();

		System.out.println("Unesite Vase ime: ");
		String ime = input.next();

		System.out.println("Unesite iznos koji zelite uplatiti na racun: ");
		double iznos = input.nextDouble();
		
		KreirajRacun racun1 = new KreirajRacun();

		racun1.kreirajRacun(brojRacuna,ime, iznos);
		
		bankomat();

	}
	
	public static void transfer() {
		
		System.out.println("Unesite broj racuna sa kojeg zelite prebaciti novac: ");
		int source = input.nextInt();
		
		System.out.println("Unesite broj racuna na koji zelite da prebacite novac: ");
		int target = input.nextInt();
		
		System.out.println("Unesite iznos koji zelite da prebacite: ");
		double iznos = input.nextDouble();
		
		Transfer transfer = new Transfer();
		transfer.transfer(source, target, iznos);
		
		bankomat();
	}
	
	public static void ispis() {
		
		System.out.println("Unesite broj racuna: ");
		int brojRacuna = input.nextInt();
		
		Transfer transfer = new Transfer();
		
		transfer.informacijeORacunu(brojRacuna);
		
		bankomat();
	}
	
}
