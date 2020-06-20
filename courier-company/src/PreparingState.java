public class PreparingState implements State {
	private String stateName = "PREPARING_PACKAGE";
	
	@Override
	public void applyState(Employee employee) {
		employee.setState(this);
	}

	@Override
	public String getStateName() {
		return this.stateName;
	}
}
