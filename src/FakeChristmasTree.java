//class for the fake Christmas tree
public class FakeChristmasTree extends ChristmasTree{
    public static final double COST = 50;
    //sets the description of the tree
    FakeChristmasTree() {
		this.description = "Artificial Christmas Tree";
	}
	//returns the cost of the tree
	public double getCost() {
		return COST;
	}
	
}
