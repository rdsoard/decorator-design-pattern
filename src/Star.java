//class for star decoration
public class Star extends TreeDecorator {
	public static final double COST = 6;
	private ChristmasTree tree;
	//constructor
	Star(ChristmasTree tree){
		this.tree = tree;
	}
	//returns the tree description and decoration description
	public String toString() {
		return this.tree.toString()+" + a star on top";
	}
	//returns the sum of the tree cost and decoration cost
	public double getCost() {
		return this.tree.getCost()+COST;
	}
}

