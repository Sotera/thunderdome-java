package mil.darpa.xlang;

public class TdValue<T> {
    private final T value;
    private final TdTag tag;

    public TdValue(T value, TdTag tag) {
        this.value = value;
        this.tag = tag;
    }

    public T value() {
        return value;
    }

    public TdTag tag() {
        return tag;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("TdValue{value=")
                .append(value)
                .append(",tag=")
                .append(tag).append("}")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TdValue)) return false;

        TdValue tdValue = (TdValue) o;

        return tag == tdValue.tag &&
                value.equals(tdValue.value);
    }

    @Override
    public int hashCode() {
        int result = value.hashCode();
        result = 31 * result + tag.hashCode();
        return result;
    }
}
