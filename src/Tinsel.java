//class for the tinsel decorations
public class Tinsel extends TreeDecorator {
	public static final double COST = 2;
	private ChristmasTree tree;
	//construct
	Tinsel(ChristmasTree tree){
		this.tree = tree;
	}
	//returns the tree description and decoration description
	public String toString() {
		return this.tree.toString()+" + tinsel all around";
	}
	//returns the sum of the tree cost and decoration cost
	public double getCost() {
		return this.tree.getCost()+COST;
	}
}

