//class for light decorations
public class Lights extends TreeDecorator {
	public static final double COST = 2;
	private ChristmasTree tree;
	//constructor
	Lights(ChristmasTree tree){
		this.tree = tree;
	}
	//returns the tree description and decoration description
	public String toString() {
		return this.tree.toString()+" + strings of lights";
	}
	//returns the sum of the tree cost and decoration cost
	public double getCost() {
		return this.tree.getCost()+COST;
	}
}
