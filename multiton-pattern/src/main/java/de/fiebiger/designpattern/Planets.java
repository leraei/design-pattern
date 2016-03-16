package de.fiebiger.designpattern;

import java.util.HashMap;

/**
 * Created by Timo on 14.03.16.
 */
public final class Planets {

    private static HashMap<PlanetName, Planet> instances = new HashMap<PlanetName, Planet>();

    private static boolean initialized = false;

    /**
     * The multiton pattern needs the constructor to be private. All planets of our SolarSystem will be created when
     * this class gets intialized.
     */
    private Planets() {
    }

    /**
     * This method gets called when the instance is used the first time. It initializes
     * all nine planets of our solar system.
     */
    private static void init() {
        instances.put(PlanetName.MERCURY, new Planet(PlanetName.MERCURY, 100, 100, 1.0));
        instances.put(PlanetName.VENUS, new Planet(PlanetName.VENUS, 100, 100, 1.0));
        instances.put(PlanetName.EARTH, new Planet(PlanetName.EARTH, 100, 100, 1.0));
        instances.put(PlanetName.MARS, new Planet(PlanetName.MARS, 100, 100, 1.0));
        instances.put(PlanetName.JUPITER, new Planet(PlanetName.JUPITER, 100, 100, 1.0));
        instances.put(PlanetName.SATURN, new Planet(PlanetName.SATURN, 100, 100, 1.0));
        instances.put(PlanetName.URANUS, new Planet(PlanetName.URANUS, 100, 100, 1.0));
        instances.put(PlanetName.NEPTUN, new Planet(PlanetName.NEPTUN, 100, 100, 1.0));
        initialized = true;
    }


    /**
     * Call this static method to get an instance of your desired planet.
     *
     * @return the singleton instance of a planet
     */
    public static Planet getInstanceOf(PlanetName planetName) {
        if (!initialized) {
            init();
        }
        return instances.get(planetName);
    }


}
