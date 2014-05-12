package mil.darpa.xlang;

public enum TdTag {
    BYTE(Byte.class),
    SHORT(Short.class),
    INTEGER(Integer.class),
    LONG(Long.class),
//    UBYTE(null),
//    USHORT(null),
//    UINTEGER(null),
//    ULONG(null),
    FLOAT(Float.class),
    DOUBLE(Double.class);

    private final Class classMapping;

    TdTag(Class classMapping) {
        this.classMapping = classMapping;
    }

    public Class classMapping() {
        return classMapping;
    }
}
