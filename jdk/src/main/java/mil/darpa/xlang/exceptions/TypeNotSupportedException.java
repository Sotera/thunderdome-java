package mil.darpa.xlang.exceptions;

public class TypeNotSupportedException extends Exception {
    public TypeNotSupportedException() {
    }

    public TypeNotSupportedException(String s) {
        super(s);
    }

    public TypeNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }

    public TypeNotSupportedException(Throwable cause) {
        super(cause);
    }
}
