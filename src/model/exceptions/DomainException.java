package model.exceptions;

// Exception -> obriga a tratar ou propagar 
// RuntimeException -> compilador n�o obriga
public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}
