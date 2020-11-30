package vmcs.model;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

public class OrderedProperties extends Properties {

    private final Vector names;

    public OrderedProperties() {
        super();
        names = new Vector();
    }

    @Override
    public Enumeration propertyNames() {
        return names.elements();
    }

    @Override
    public Object put(Object key, Object value) {
        names.add(key);
        return super.put(key, value);
    }

    @Override
    public Object remove(Object key) {
        names.remove(key);
        return super.remove(key);
    }
}
