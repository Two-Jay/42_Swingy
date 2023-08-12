package kr.seoul.ftseoul.swingy.view.store;

public interface Store {

    public void set(String propertyName, Object value);

    public Object get(String propertyName);
}
