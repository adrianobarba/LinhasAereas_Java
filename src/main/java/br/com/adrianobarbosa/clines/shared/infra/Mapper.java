package br.com.adrianobarbosa.clines.shared.infra;

public interface Mapper<S, T> {
    T map(S source);
}
