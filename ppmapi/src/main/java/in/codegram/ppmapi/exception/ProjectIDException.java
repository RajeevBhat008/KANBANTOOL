package in.codegram.ppmapi.exception;

public class ProjectIDException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This will create ProjectIDException object without error message
	 */
	public ProjectIDException() {
		super();
	}

	/**
	 * This will create ProjectIDException object with error message
	 */
	public ProjectIDException(String msg) {
		super(msg);
	}

}
