package br.com.adrianobarbosa.clines.shared.exceptions;

public class LocationNotFoundException extends IllegalArgumentException {
	private static final long serialVersionUID = 1L;

	public LocationNotFoundException(String message) {
		super(message);
	}
}
