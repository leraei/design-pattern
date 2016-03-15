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
        double earthGravity = 123.456;
        double venusGravity = 456.789;

        Planet earth = Planets.getInstanceOf(PlanetName.EARTH);
        earth.setGravity(earthGravity);

        Planet venus = Planets.getInstanceOf(PlanetName.VENUS);
        venus.setGravity(venusGravity);

        Planet newEarth = Planets.getInstanceOf(PlanetName.EARTH);
        Planet newVenus = Planets.getInstanceOf(PlanetName.VENUS);

        assertThat(newEarth.getGravity(), is(earthGravity));
        assertThat(newVenus.getGravity(), is(venusGravity));

    }
}
