public class CountryEmployee extends Employee {

	public CountryEmployee(String name) {
		super(name);
		this.level = Employee.COUNTRY;
	}

	@Override
	protected void processPackage(Package pkg) {
		System.out.println(this.getName() + " is preparing package " + pkg.getName());
		this.setState(new PreparingState());
	}

}
