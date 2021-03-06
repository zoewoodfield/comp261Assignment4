
public class NumberNode extends ExpressionNode implements RobotProgramNode {
	
	int value;
	
	public NumberNode(int value) {
		this.value = value;
	}

	@Override
	public void execute(Robot robot) {
		// Do nothing
	}
	
	public int getValue(Robot robot) {
		return value;
	}

	@Override
	public String toString() {
		return value + "";
	}

}
