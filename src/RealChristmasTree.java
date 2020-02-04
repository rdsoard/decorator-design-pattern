//class for the real Christmas tree
public class RealChristmasTree extends ChristmasTree{
    public static final double COST = 40;
    //sets the description of the tree
    RealChristmasTree() {
		this.description = "Real Fir Christmas Tree";
	}
    //returns the cost of the tree
	public double getCost() {
		return COST;
	}
	
}
