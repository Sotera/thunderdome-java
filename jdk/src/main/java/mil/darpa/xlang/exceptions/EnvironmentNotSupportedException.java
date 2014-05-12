package mil.darpa.xlang.exceptions;

import mil.darpa.xlang.TdEnvironments;

public class EnvironmentNotSupportedException extends Exception {
    private final TdEnvironments env;

    public EnvironmentNotSupportedException(TdEnvironments env) {
        this.env = env;
    }

    @Override
    public String getMessage() {
        return "Environment not supported: " + env;
    }
}
