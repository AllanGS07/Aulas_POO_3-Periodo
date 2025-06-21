package exceptions;

public class InvestimentoNaoPertenceAoClienteException extends RuntimeException {
    public InvestimentoNaoPertenceAoClienteException(String message) {
        super(message);
    }
}
