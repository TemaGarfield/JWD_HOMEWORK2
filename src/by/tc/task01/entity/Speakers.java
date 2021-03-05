package by.tc.task01.entity;

import java.util.Objects;

public class Speakers extends Appliance{
    private static final String TYPE = "Speakers";

    private double powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    public Speakers() {
        super(TYPE);
    }

    public Speakers(double powerConsumption, int numberOfSpeakers, String frequencyRange, double cordLength) {
        super(TYPE);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Speakers speakers = (Speakers) o;
        return Double.compare(speakers.powerConsumption, powerConsumption) == 0 && numberOfSpeakers == speakers.numberOfSpeakers && Double.compare(speakers.cordLength, cordLength) == 0 && Objects.equals(frequencyRange, speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength=" + cordLength +
                '}';
    }

    public String formattedString() {
        return "Speakers : " +
                "POWER_CONSUMPTION=" + powerConsumption +
                ", NUMBER_OF_SPEAKERS=" + numberOfSpeakers +
                ", FREQUENCY_RANGE=" + frequencyRange +
                ", CORD_LENGTH=" + cordLength;
    }
}
