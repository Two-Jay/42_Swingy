package kr.seoul.ftseoul.swingy.View.Store;

public interface Store {

    public void set(String propertyName, Object value);

    public Object get(String propertyName);
}
