package mil.darpa.xlang.exceptions;

public class UnknownFunctionException extends Exception {
    public UnknownFunctionException() {
        super();
    }

    public UnknownFunctionException(String message) {
        super(message);
    }

    public UnknownFunctionException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public UnknownFunctionException(Throwable throwable) {
        super(throwable);
    }
}
