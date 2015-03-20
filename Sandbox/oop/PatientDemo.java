// Practice for Object Oriented Programming
// Create a patient with diseases

public class PatientDemo {
	public static void main(String args[]) {
		Patient p1 = new Patient("John");

		Disease something = new Disease("Something", "A disease");
		p1.addDisease(new Disease("Cancer", "Skin Cancer"));
		p1.addDisease(something);

		for(Disease d : p1.getDiseases()) {
			System.out.println(d);
		}
	}
}