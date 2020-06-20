public class Boy {
	private String name;

	public Boy(String name) {
		this.name = name;
	}
	
	public void update(Employee employee) {
		State state = employee.getState();
		
		if (state.getStateName() == "PREPARING_PACKAGE") {
			System.out.println(this.getName() + " is going to take that package to the warehouse.");
			// Възвръщане на режима след вземането на пратката
			employee.setState(new WaitingState());
		}
		else {
			System.out.println(this.getName() + " is watching " + employee.getName() + " who is now waiting for package");
		}
	}
	
	public String getName() {
		return name;
	}
}
