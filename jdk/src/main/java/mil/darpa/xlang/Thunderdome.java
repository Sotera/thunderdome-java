package mil.darpa.xlang;

import mil.darpa.xlang.exceptions.TypeNotSupportedException;
import mil.darpa.xlang.exceptions.UnknownFunctionException;

public interface Thunderdome {
    TdValue invoke(String function) throws TypeNotSupportedException, UnknownFunctionException;
    TdValue invoke(String function, TdValue arg1) throws TypeNotSupportedException, UnknownFunctionException;
    TdValue invoke(String function, TdValue arg1, TdValue arg2) throws TypeNotSupportedException, UnknownFunctionException;
}
