public class WorldEmployee extends Employee {

	public WorldEmployee(String name) {
		super(name);
		this.level = Employee.WORLD;
	}

	@Override
	protected void processPackage(Package pkg) {
		System.out.println(this.getName() + " is preparing package " + pkg.getName());
		this.setState(new PreparingState());
	}

}
