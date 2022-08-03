package edbms;

public class EmplloyeeNotFoundExcaption extends Exception {
	private String message;

	public EmplloyeeNotFoundExcaption(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	

}
