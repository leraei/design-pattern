package de.fiebiger.factorypattern.model;

/**
 * Created by Timo on 13.03.16.
 */
public class Star extends Luminary {

    public Star() {
        habitable = false;
    }

    /**
     * Checks if the Star has a valid name. In this project for stars the name is valid unless it is blank or null.
     * Please refer this article for real naming of asteroids: (https://de.wikipedia.org/wiki/Sternbenennung)
     * @return
     */
    @Override
    public boolean hasValidName() {
        return super.hasValidName();
    }

    public LuminaryType getType() {
        return LuminaryType.STAR;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
