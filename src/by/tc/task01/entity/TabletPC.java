package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC extends Appliance{
    private static final String TYPE = "TabletPC";

    private double batteryCapacity;
    private double displayInches;
    private int memoryRom;
    private double flashMemoryCapacity;
    private String color;

    public TabletPC() {
        super(TYPE);
    }

    public TabletPC(double batteryCapacity, double displayInches, int memoryRom, double flashMemoryCapacity, String color) {
        super(TYPE);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0 && Double.compare(tabletPC.displayInches, displayInches) == 0 && memoryRom == tabletPC.memoryRom && Double.compare(tabletPC.flashMemoryCapacity, flashMemoryCapacity) == 0 && Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }

    public String formattedString() {
        return "TabletPC : " +
                "BATTERY_CAPACITY=" + batteryCapacity +
                ", DISPLAY_INCHES=" + displayInches +
                ", MEMORY_ROM=" + memoryRom +
                ", FLASH_MEMORY_CAPACITY=" + flashMemoryCapacity +
                ", COLOR=" + color;
    }
}
