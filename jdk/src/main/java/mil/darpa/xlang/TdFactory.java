package mil.darpa.xlang;

import mil.darpa.xlang.exceptions.EnvironmentNotSupportedException;

public class TdFactory {
    public static Thunderdome forEnvironment(TdEnvironments env) throws EnvironmentNotSupportedException {
        switch(env) {
            case JAVA:
                return new JavaReflectionThunderdome();
            case C:
                return new ThunderdomeNative();
            default:
                throw new EnvironmentNotSupportedException(env);
        }
    }
}
