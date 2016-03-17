package de.fiebiger.designpattern;

import de.fiebiger.designpattern.model.FlowerType;
import de.fiebiger.designpattern.model.TreeType;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;



/**
 * Created by tfiebige on 17.03.16.
 */
public class ForrestTest {
	@Test
	public void testPreparePrototypes() {
		Forrest forrest = new Forrest();
		for (TreeType treeType : TreeType.values()) {
			assertThat(forrest.getTreePrototypes().containsKey(treeType), is(true));
		}
		for (FlowerType flowerType : FlowerType.values()) {
			assertThat(forrest.getFlowerPrototypes().containsKey(flowerType), is(true));
		}
	}

	@Test
	public void testAddTreesToForrest() {
		Forrest forrest = new Forrest();
		forrest.addTreesToForrest(TreeType.EICHE, 2);

		assertThat(forrest.getTrees().size(), is(2));
	}

	@Test
	public void testAddFlowersToForrest() {
		Forrest forrest = new Forrest();
		forrest.addFlowersToForrest(FlowerType.SONNENBLUME, 2);

		assertThat(forrest.getFlowers().size(), is(2));
	}

}
