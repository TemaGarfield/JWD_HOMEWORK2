package by.tc.task01.entity;

import java.util.Objects;

public class Oven extends Appliance{
    private static final String TYPE = "Oven";

    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven() {
        super(TYPE);
    }

    public Oven(double powerConsumption, double weight, double capacity, double depth, double height, double width) {
        super(TYPE);

        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Oven oven = (Oven) o;
        return Double.compare(oven.powerConsumption, powerConsumption) == 0 && Double.compare(oven.weight, weight) == 0 && Double.compare(oven.capacity, capacity) == 0 && Double.compare(oven.depth, depth) == 0 && Double.compare(oven.height, height) == 0 && Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, weight, capacity, depth, height, width);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public String formattedString() {
        return "Oven : " +
                "POWER_CONSUMPTION=" + powerConsumption +
                ", WEIGHT=" + weight +
                ", CAPACITY=" + capacity +
                ", DEPTH=" + depth +
                ", HEIGHT=" + height +
                ", WIDTH=" + width;
    }
}
