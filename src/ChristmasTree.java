//Rebekah Soard
//abstract class to extend the trees from
public abstract class ChristmasTree {
	protected String description;
	//returns the description of the tree
	public String toString() {
		return description;
	}
	//gets the cost of the tree/decorations
	public abstract double getCost();
	
}
