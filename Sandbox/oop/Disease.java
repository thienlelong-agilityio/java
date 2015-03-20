// Practice for Object Oriented Programming
// Create a patient with diseases

public class Disease {
	private String disease;
	private String comment;

	public Disease(String disease, String comment) {
		this.disease = disease;
		this.comment = comment;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getDisease() {
		return disease;
	}

	public String getComment() {
		return comment;
	}

	public String toString() {
		return disease;
	}

	public boolean equals(Object o) {
		if(o instanceof Disease) {
			Disease that = (Disease) o;
			if(this.getDisease().equals(that.getDisease()) &&
				this.getComment().equals(that.getComment())) {
				return true;
			}
			return false;
		}
		return false;
	}
}