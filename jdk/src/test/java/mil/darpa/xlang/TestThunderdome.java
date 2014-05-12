package mil.darpa.xlang;

import mil.darpa.xlang.exceptions.EnvironmentNotSupportedException;
import mil.darpa.xlang.exceptions.TypeNotSupportedException;
import mil.darpa.xlang.exceptions.UnknownFunctionException;
import org.junit.Before;
import org.junit.Test;

import static mil.darpa.xlang.TdValueFactory.newTdValue;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TestThunderdome {
    Thunderdome td;

    @Before
    public void setup_thunderdome() throws EnvironmentNotSupportedException {
        td = TdFactory.forEnvironment(TdEnvironments.C);
    }

    @Test
    public void should_call_no_arg_function() throws Exception, UnknownFunctionException, TypeNotSupportedException {
        TdValue output = td.invoke("mil.darpa.xlang.TestThunderdome.zero");

        assertThat(output, is(newTdValue(0)));
    }

    @Test
    public void should_call_1_arg_function() throws Exception, UnknownFunctionException, TypeNotSupportedException {
        TdValue output = td.invoke("mil.darpa.xlang.TestThunderdome.identity",
                newTdValue(1));

        assertThat(output, is(newTdValue(1)));
    }

    @Test
    public void should_call_2_arg_function() throws Exception, UnknownFunctionException, TypeNotSupportedException {
        TdValue output = td.invoke("mil.darpa.xlang.TestThunderdome.add",
                newTdValue(1), newTdValue(1));

        assertThat(output, is(newTdValue(2)));
    }

    @Test(expected = UnknownFunctionException.class)
    public void should_report_unknown_functions() throws UnknownFunctionException, TypeNotSupportedException {
        String unsupportedFunction = "mil.darpa.xlang.TestThunderdome.does_not_exist";

        td.invoke(unsupportedFunction);
    }

    @Test(expected = TypeNotSupportedException.class)
    public void should_report_unknown_arg_types() throws UnknownFunctionException, TypeNotSupportedException {
        Object unsupportedType = new StringBuilder();

        td.invoke("mil.darpa.xlang.TestThunderdome.identity", newTdValue(unsupportedType));
    }

    public static Integer zero() {
        return 0;
    }

    public static Integer identity(Integer x) {
        return x;
    }

    public static Integer add(Integer left, Integer right) {
        return left + right;
    }
}
