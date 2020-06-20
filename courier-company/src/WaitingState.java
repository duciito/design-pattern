public class WaitingState implements State {
	private String stateName = "WAITING";
	
	@Override
	public void applyState(Employee employee) {
		employee.setState(this);
	}

	@Override
	public String getStateName() {
		return this.stateName;
	}
}
