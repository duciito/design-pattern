import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Employee worldEmployee = new WorldEmployee("pesho");
		Employee countryEmployee = new CountryEmployee("galina");
		Employee cityEmployee = new CityEmployee("mario");
		ArrayList<Employee> employees = new ArrayList<Employee>(Arrays.asList(
			worldEmployee,
			countryEmployee,
			cityEmployee
		));
		Boy boy = new Boy("GOSHO");
		
		State waiting = new WaitingState();
		State preparing = new PreparingState();
		
		// Нагласяне на връзките и статуса
		worldEmployee.setNextEmployee(countryEmployee);
		countryEmployee.setNextEmployee(cityEmployee);
		
		for (Employee emp : employees) {
			emp.subscribe(boy);
			waiting.applyState(emp);
		}
		
		// Обработване на пратките...
		worldEmployee.processOrPassToNext(new Package("Pratka za plovdiv", Employee.CITY));
		countryEmployee.processOrPassToNext(new Package("Pratka za plovdiv 2", Employee.CITY));
		worldEmployee.processOrPassToNext(new Package("Pratka za Germaniq", Employee.WORLD));
		countryEmployee.processOrPassToNext(new Package("Pratka za Gabrovo", Employee.COUNTRY));
	}

}
