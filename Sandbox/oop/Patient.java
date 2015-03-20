// Practice for Object Oriented Programming
// Create a patient with diseases

import java.util.LinkedList;

public class Patient {
	private String name;
	private LinkedList<Disease> diseaseList;

	public Patient(String name) {
		this.name = name;
		diseaseList = new LinkedList<Disease>();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addDisease(Disease d) {
		if(!diseaseList.contains(d)) {
			diseaseList.add(d);
		}
	}

	public Iterable<Disease> getDiseases() {
		return diseaseList;
	}
}