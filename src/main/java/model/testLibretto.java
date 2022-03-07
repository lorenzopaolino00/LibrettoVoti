package model;

public class testLibretto {

	public static void main(String[] args) {
		Libretto lib = new Libretto();
		lib.add(new Voto("Analisi 1", 18));
		lib.add(new Voto("Fisica 1", 20));
		lib.add(new Voto("Informatica", 25));
		lib.add(new Voto("Algebra", 25));
		System.out.println("voti pari a 25:");
		Libretto lib25 = lib.filtraPunti(25);
		System.out.println(lib25);
		System.out.println("voto di Informatica: " + lib.cercaNome("Informatica"));
	}
}
