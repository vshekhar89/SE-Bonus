

public class DoubleScoop extends IceCreamDecorator {
	IceCream ic = null;
	
	public DoubleScoop(IceCream i){
		ic =i;
	}
	
	@Override
	public String getDescription() {
		return ic.getDescription() + " with double scoop";
	}
	
	@Override
	public double getCost() {
		return 0.8 + ic.getCost();
	}
}