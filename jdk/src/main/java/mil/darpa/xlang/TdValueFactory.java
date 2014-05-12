package mil.darpa.xlang;

import mil.darpa.xlang.exceptions.TypeNotSupportedException;

public class TdValueFactory {
    public static TdValue newTdValue(Object obj) throws TypeNotSupportedException {
        for (TdTag tdTag : TdTag.values()) {
            if(tdTag.classMapping().isInstance(obj)) {
                return new TdValue(obj, tdTag);
            }
        }

        throw new TypeNotSupportedException("not able to handle type: " + obj.getClass());
    }
}
