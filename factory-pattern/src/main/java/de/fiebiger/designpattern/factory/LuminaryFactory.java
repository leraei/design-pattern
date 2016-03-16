package de.fiebiger.designpattern.factory;

import de.fiebiger.designpattern.model.*;

/**
 * Created by Timo on 13.03.16.
 */
public class LuminaryFactory {

    /**
     * Creates a new Luminary by the given type
     * @param type One of the possible Types for Luminaries
     * @return
     */
    public static Luminary create(LuminaryType type) {
        switch(type) {
            case ASTEROID:
                return new Asteroid();
            case PLANET:
                return new Planet();
            case STAR:
                return new Star();
            default:
                return null;
        }
    }


    /**
     * Creates a new Luminary that is just discovered by explorers. They gave it a name. It must be valid!
     * @param type One of the possible Types for Luminaries
     * @param name A hopefully valid name for this luminary
     * @return
     */
    public static Luminary createAndDiscover(LuminaryType type, String name) {
        Luminary luminary = create(type);
        luminary.setName(name);

        if(luminary.hasValidName()) {
            return luminary;
        }
        else {
            throw new IllegalArgumentException("No valid name for this lumiary. Stupid Explorer.");
        }
    }
}
