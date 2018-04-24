package patterns.delegation.office;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BinaryOperator;

public class Manager implements Employee {

	private List<Employee> employees;
	
	public Manager(Collection<Employee> employees) {
		if (employees.isEmpty()) {
			throw new IllegalArgumentException("A Manager must have someone to delegate to!");
		}
		this.employees = new ArrayList<Employee>(employees);
	}

	private Employee getTaskDelegate() {
		return this.employees.get(this.getTaskCount() % employees.size());
	}
	
	@Override
	public double doCalculations(BinaryOperator<Double> operation, double value1, double value2) {
		return getTaskDelegate().doCalculations(operation, value1, value2);
	}

	@Override
	public void printDocument(String document) {
		
		getTaskDelegate().printDocument(document);
	}

	@Override
	public int getTaskCount() {
		//Ved hjelp av streams
		return employees.stream().mapToInt(employee->employee.getTaskCount()).sum(); 
		/*Tradisjonell metode
		 int task = 0; 
		 for(Employee e: employees) {
		 	task += e.getTaskCount(); 
		 }
		 return task; 
		 */
	}

	@Override
	public int getResourceCount() {
		int sum = 1;
		for (Employee employee : employees) {
			sum += employee.getResourceCount();
		}
		return sum;
	}
}
