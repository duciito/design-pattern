public class Package {
	private String name;
	// Отговаря на това кой работник трябва да я обработи
	private int employeeLevel;
	
	public Package(String name, int employeeLevel) {
		this.setName(name);
		this.employeeLevel = employeeLevel;
	}
	
	public int getEmployeeLevel() {
		return this.employeeLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
