package de.fiebiger.designpattern.model;

/**
 * Created by Timo on 13.03.16.
 */
public abstract class Luminary {

    protected String name;
    protected int mass;
    protected Boolean habitable;
    protected int temperature;
    protected LuminaryType type;




    /**
     * Checks if the Luminary has a valid name. For Luminaries the name is valid unless it is blank or null.
     * @return
     */
    public boolean hasValidName() {
        return name != null && !name.equals("");
    }

    public abstract LuminaryType getType();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public Boolean getHabitable() {
        return habitable;
    }

    public void setHabitable(Boolean habitable) {
        this.habitable = habitable;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
