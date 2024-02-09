package br.com.adrianobarbosa.clines.shared.exceptions;

public class AircraftNotFoundException extends IllegalArgumentException {
	private static final long serialVersionUID = 1L;

	public AircraftNotFoundException(String message) {
        super(message);
    }
}
