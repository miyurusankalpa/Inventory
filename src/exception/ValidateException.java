package exception;

@SuppressWarnings("serial")
public class ValidateException extends Exception {
	private String error;
	
	public ValidateException(String message) {
		 super(message);
		 this.error = message;
	}
	 
	 public String getValidateException() {
		 return error;
	}
}
