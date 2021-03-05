package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Appliance {
    private String type;
    private Map<String, Object> specifications = new HashMap();

    public Appliance() {
        this.type = "";
    }

    public Appliance(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getSpecifications() {
        return specifications;
    }

    public void add(String valueName, Object value) {
        specifications.put(valueName, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return Objects.equals(type, appliance.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
