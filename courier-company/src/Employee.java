public abstract class Employee {
	public static int WORLD = 1;
	public static int COUNTRY = 2;
	public static int CITY = 3;
	
	// Само един наблюдател - момчето
	protected Boy observer;
	protected State state;
	protected String name;
	protected int level;
	protected Employee nextEmployee;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public void setState(State state) {
		this.state = state;
		this.notifyObserver();
	}
	
	public void setNextEmployee(Employee employee) {
		this.nextEmployee = employee;
	}
	
	public void processOrPassToNext(Package pkg) {
		String stateName = this.state.getStateName();

		// Обработи само ако работникът е в режим на изчакване
		if (this.level == pkg.getEmployeeLevel() && stateName.equals("WAITING")) {
			this.processPackage(pkg);
		}
		else {
			this.nextEmployee.processOrPassToNext(pkg);
		}
	}
	
	public void subscribe(Boy observer) {
		this.observer = observer;
	}

	public void unsubscribe(Boy observer) {
		this.observer = null;
	}
	
	public void notifyObserver() {
		observer.update(this);
	}
	
	public State getState() {
		return this.state;
	}
	
	public String getName() {
		return this.name;
	}
	
	abstract protected void processPackage(Package pkg);
}
