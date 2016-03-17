package de.fiebiger.designpattern;

import de.fiebiger.designpattern.model.Flower;
import de.fiebiger.designpattern.model.FlowerType;
import de.fiebiger.designpattern.model.Tree;
import de.fiebiger.designpattern.model.TreeType;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;



/**
 * Created by tfiebige on 17.03.16.
 */
public class Forrest {

	public Set<Tree> trees = new HashSet<Tree>();
	public Set<Flower> flowers = new HashSet<Flower>();


	public HashMap<TreeType, Tree> treePrototypes = new HashMap<TreeType, Tree>();
	public HashMap<FlowerType, Flower> flowerPrototypes = new HashMap<FlowerType, Flower>();

	public Forrest() {
		preparePrototypes();
	}

	private void preparePrototypes() {
		for (TreeType treeType : TreeType.values()) {
			treePrototypes.put(treeType, new Tree(treeType));
		}
		for (FlowerType flowerType : FlowerType.values()) {
			flowerPrototypes.put(flowerType, new Flower(flowerType));
		}
	}

	public void addTreesToForrest(TreeType treeType, int quantity) {
		for(int i = 0; i < quantity; i++) {
			trees.add(treePrototypes.get(treeType).clone());
		}
	}

	public void addFlowersToForrest(FlowerType flowerType, int quantity) {
		for(int i = 0; i < quantity; i++) {
			flowers.add(flowerPrototypes.get(flowerType).clone());
		}
	}


	public Set<Tree> getTrees() {
		return trees;
	}


	public void setTrees(Set<Tree> trees) {
		this.trees = trees;
	}


	public Set<Flower> getFlowers() {
		return flowers;
	}


	public void setFlowers(Set<Flower> flowers) {
		this.flowers = flowers;
	}


	public HashMap<TreeType, Tree> getTreePrototypes() {
		return treePrototypes;
	}


	public void setTreePrototypes(HashMap<TreeType, Tree> treePrototypes) {
		this.treePrototypes = treePrototypes;
	}


	public HashMap<FlowerType, Flower> getFlowerPrototypes() {
		return flowerPrototypes;
	}


	public void setFlowerPrototypes(HashMap<FlowerType, Flower> flowerPrototypes) {
		this.flowerPrototypes = flowerPrototypes;
	}
}
