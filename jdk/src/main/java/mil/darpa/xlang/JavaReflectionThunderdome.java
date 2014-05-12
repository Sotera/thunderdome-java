package mil.darpa.xlang;

import mil.darpa.xlang.exceptions.TypeNotSupportedException;
import mil.darpa.xlang.exceptions.UnknownFunctionException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static mil.darpa.xlang.TdValueFactory.newTdValue;

public class JavaReflectionThunderdome implements Thunderdome {
    @Override
    public TdValue invoke(String function) throws TypeNotSupportedException, UnknownFunctionException {

        final TdValue ret;
        try {
            Method method = getMethod(function);

            ret = newTdValue(method.invoke(null));
        } catch (ClassNotFoundException e) {
            throw new UnknownFunctionException(e);
        } catch (NoSuchMethodException e) {
            throw new UnknownFunctionException(e);
        } catch (InvocationTargetException e) {
            throw new UnknownFunctionException(e);
        } catch (IllegalAccessException e) {
            throw new UnknownFunctionException(e);
        }

        return ret;
    }

    @Override
    public TdValue invoke(String function, TdValue arg1) throws TypeNotSupportedException, UnknownFunctionException {
        final TdValue ret;
        try {
            Method method = getMethod(function,
                    arg1.tag().classMapping());


            ret = newTdValue(method.invoke(null, arg1.value()));
        } catch (ClassNotFoundException e) {
            throw new UnknownFunctionException(e);
        } catch (NoSuchMethodException e) {
            throw new UnknownFunctionException(e);
        } catch (InvocationTargetException e) {
            throw new UnknownFunctionException(e);
        } catch (IllegalAccessException e) {
            throw new UnknownFunctionException(e);
        }

        return ret;
    }

    @Override
    public TdValue invoke(String function, TdValue arg1, TdValue arg2) throws TypeNotSupportedException, UnknownFunctionException {
        final TdValue ret;
        try {
            Method method = getMethod(function,
                    arg1.tag().classMapping(),
                    arg2.tag().classMapping());

            ret = newTdValue(method.invoke(null, arg1.value(), arg2.value()));
        } catch (ClassNotFoundException e) {
            throw new UnknownFunctionException(e);
        } catch (NoSuchMethodException e) {
            throw new UnknownFunctionException(e);
        } catch (InvocationTargetException e) {
            throw new UnknownFunctionException(e);
        } catch (IllegalAccessException e) {
            throw new UnknownFunctionException(e);
        }

        return ret;
    }

    private Method getMethod(String function, Class<?>... argTypes) throws ClassNotFoundException, NoSuchMethodException {
        int methodIndex = function.lastIndexOf(".");
        Class<?> cls = Class.forName(function.substring(0, methodIndex));

        return cls.getMethod(function.substring(methodIndex+1), argTypes);
    }
}