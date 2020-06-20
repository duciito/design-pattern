public class CityEmployee extends Employee {

	public CityEmployee(String name) {
		super(name);
		this.level = Employee.CITY;
	}

	@Override
	protected void processPackage(Package pkg) {
		System.out.println(this.getName() + " is preparing package " + pkg.getName());
		this.setState(new PreparingState());
	}

}