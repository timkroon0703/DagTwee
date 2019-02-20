
public class BuurmanVraag {
	public static void main(String [] args) {
		
		Tandpasta aa = new Tandpasta("Colgate");
		Tandpasta bb = new Tandpasta ("Sensodyne");
		
		aa.merknaam = "Aquafresh";
		
		System.out.println(aa.merknaam);
		System.out.println(bb.merknaam);
		
		bb.pittigheid = "Niet zo pittig";
		
		System.out.println(aa.pittigheid);
		System.out.println(bb.pittigheid);
		
	}
}

class Tandpasta{
	String merknaam;
	static String pittigheid = "Heel pittig";
	Tandpasta(String naamMerk){
		merknaam = naamMerk;
	}
}