package br.com.adrianobarbosa.clines.shared.exceptions;

public class AirportNotFoundException extends IllegalArgumentException {
	private static final long serialVersionUID = 1L;

	public AirportNotFoundException(String message) {
        super(message);
    }
}
