

public class DagTweeVerhaalTwee {
	
	public static void main(String [] args) {
		
			Ziekenhuis ziekenhuis = new Ziekenhuis("VU");
				System.out.println(ziekenhuis.naam);
				
			ziekenhuis.dePatient = new Patient();
				System.out.println(ziekenhuis.dePatient.ziek);
				
			ziekenhuis.opereren
		
	}
}


class Ziekenhuis {
	String naam;
	
	Patient dePatient;
	
	Ziekenhuis(String deNaam){
		naam = deNaam;
	}
	
	void opereren(Patient patient) {
		patient.ziek = false;
		
		
	}
}


class Patient {
	boolean ziek = true;
	
}