package de.fiebiger.multitonpattern;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Timo on 14.03.16.
 */
public class PlanetsTest {
    @Test
    public void testGetInstanceOf() {
        double gravity = 123.456;

        Planet earth = Planets.getInstanceOf(PlanetName.EARTH);
        earth.setGravity(gravity);

        earth = Planets.getInstanceOf(PlanetName.EARTH);
        assertThat(earth.getGravity(), is(gravity));
    }
}
