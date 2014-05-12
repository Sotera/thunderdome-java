package mil.darpa.xlang;

class ThunderdomeNativeAdapter {
    public native TdValue invoke(String function);
    public native TdValue invoke(String function, TdValue arg1);
    public native TdValue invoke(String function, TdValue arg1, TdValue arg2);
}
