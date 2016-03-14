package de.fiebiger.factorypattern.factory;

import de.fiebiger.factorypattern.model.Luminary;
import de.fiebiger.factorypattern.model.LuminaryType;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

/**
 * Created by Timo on 13.03.16.
 */
public class LuminaryFactoryTest {

    @Test
    public void testCreateStar() {
        Luminary star = LuminaryFactory.create(LuminaryType.STAR);

        assertThat(star, notNullValue());
        assertThat(star.getType(), is(LuminaryType.STAR));
    }

    @Test
    public void testCreatePlanet() {
        Luminary planet = LuminaryFactory.create(LuminaryType.PLANET);

        assertThat(planet, notNullValue());
        assertThat(planet.getType(), is(LuminaryType.PLANET));
    }

    @Test
    public void testCreateAsteroid() {
        Luminary asteroid = LuminaryFactory.create(LuminaryType.ASTEROID);

        assertThat(asteroid, notNullValue());
        assertThat(asteroid.getType(), is(LuminaryType.ASTEROID));
    }

    @Test
    public void testCreateAndDiscoverStar_WithValidName() {
        String name = "Sun";
        Luminary star = LuminaryFactory.createAndDiscover(LuminaryType.STAR, name);

        assertThat(star.hasValidName(), is(true));
        assertThat(star.getName(), is(name));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateAndDiscoverStar_WithInValidName() {
        String name = "";
        Luminary star = LuminaryFactory.createAndDiscover(LuminaryType.STAR, name);

        assertThat(star.hasValidName(), is(true));
        assertThat(star.getName(), is(name));
    }

    @Test
    public void testCreateAndDiscoverPlanet_WithValidName() {
        String name = "Neptun";
        Luminary star = LuminaryFactory.createAndDiscover(LuminaryType.PLANET, name);

        assertThat(star.hasValidName(), is(true));
        assertThat(star.getName(), is(name));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateAndDiscoverPlanet_WithInValidName() {
        String name = "AES-551";
        Luminary star = LuminaryFactory.createAndDiscover(LuminaryType.PLANET, name);

        assertThat(star.hasValidName(), is(true));
        assertThat(star.getName(), is(name));
    }

    @Test
    public void testCreateAndDiscoverAsteroid_WithValidName() {
        String name = "5761";
        Luminary star = LuminaryFactory.createAndDiscover(LuminaryType.ASTEROID, name);

        assertThat(star.hasValidName(), is(true));
        assertThat(star.getName(), is(name));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateAndDiscoverAsteroid_WithInValidName() {
        String name = "Apophis";
        Luminary star = LuminaryFactory.createAndDiscover(LuminaryType.ASTEROID, name);

        assertThat(star.hasValidName(), is(true));
        assertThat(star.getName(), is(name));
    }
}
