package de.fiebiger.factorypattern.model;

/**
 * Created by Timo on 13.03.16.
 */
public class Planet extends Luminary {


    /**
     * Checks if the Planet has a valid name. In this project it is valid for names containing only chars.
     * Please refer this article for real naming of planets: (https://de.wikipedia.org/wiki/Planetare_Nomenklatur)
     *
     * @return
     */
    @Override
    public boolean hasValidName() {
        return super.hasValidName() && name.matches("[a-zA-Z]+");
    }

    public LuminaryType getType() {
        return LuminaryType.PLANET;
    }

    public Boolean getHabitable() {
        return habitable;
    }

    public void setHabitable(Boolean habitable) {
        this.habitable = habitable;
    }
}
