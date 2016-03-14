package de.fiebiger.factorypattern.model;

/**
 * Created by Timo on 13.03.16.
 */
public class Asteroid extends Luminary {


    public Asteroid() {
        habitable = false;
    }

    /**
     * Checks if the Asteroid has a valid name. In this project it is valid for names containing only numbers.
     * Please refer this article for real naming of asteroids: (https://de.wikipedia.org/wiki/Benennung_von_Asteroiden_und_Kometen)
     * @return
     */
    @Override
    public boolean hasValidName() {
        return super.hasValidName() && name.matches("-?\\d+(.\\d+)?");
    }

    public LuminaryType getType() {
        return LuminaryType.ASTEROID;
    }
}
