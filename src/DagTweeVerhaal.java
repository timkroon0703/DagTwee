
public class DagTweeVerhaal {
	public static void main(String [] args) {
		
		Dier deDier = new Dier("Simba"); 
			System.out.println(deDier.naam);
			
		deDier.deGebit = new Gebit();
			System.out.println( "Is zijn gebit stuk? " + deDier.deGebit.stuk );
			
		deDier.deGebit.stukgaan();
			System.out.println( "Is zijn gebit stuk? " + deDier.deGebit.stuk );
			
		Dierenarts artspiet = new Dierenarts();
		deDier.geld-=artspiet.fixen(deDier.deGebit);
			System.out.println("Hij is naar artspiet gegaan, is zijn gebit stuk? " + deDier.deGebit.stuk);
			System.out.println("Hoeveel geld heeft ie nog? "+ deDier.geld + " Euro.");
			
			
	}
}

class Dier{
	static String naam;
	Gebit deGebit;
	int geld = 60;
	Dier(String naamNaam){
		naam = naamNaam;

	}
}

class Gebit{
	String kleur = "Wit";
	boolean stuk;
	void stukgaan() {
		stuk = true;
		
	}
}

class Dierenarts{
	int fixen(Gebit gebit) {
		gebit.stuk = false;
		return 30;
		
	}
}
	

