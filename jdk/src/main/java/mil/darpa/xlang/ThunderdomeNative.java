package mil.darpa.xlang;

import mil.darpa.xlang.exceptions.TypeNotSupportedException;
import mil.darpa.xlang.exceptions.UnknownFunctionException;

public class ThunderdomeNative implements Thunderdome {
    static {
        System.loadLibrary("thunderdome");
    }

    private ThunderdomeNativeAdapter adapter = new ThunderdomeNativeAdapter();

    @Override
    public TdValue invoke(String function) throws TypeNotSupportedException, UnknownFunctionException {
        return adapter.invoke(function);
    }

    @Override
    public TdValue invoke(String function, TdValue arg1) throws TypeNotSupportedException, UnknownFunctionException {
        return adapter.invoke(function, arg1);
    }

    @Override
    public TdValue invoke(String function, TdValue arg1, TdValue arg2) throws TypeNotSupportedException, UnknownFunctionException {
        return adapter.invoke(function, arg1, arg2);
    }
}
