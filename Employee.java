package task10;

public class Employee {
	
	    
	    private int id;
	    private String name;
	    private double salary;

	    public Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    public void raiseSalary(double percent) {
	        if (percent > 0) {
	            double raiseAmount = (percent / 100) * this.salary;
	            this.salary += raiseAmount;
	            System.out.println(name + "'s salary has been raised by " + percent + "%. New salary: $" + this.salary);
	        } else {
	            System.out.println("Invalid percentage. Salary remains unchanged.");
	        }
	    }

	    public String toString() {
	        return "Employee [ID=" + id + ", Name=" + name + ", Salary=$" + salary + "]";
	    }

	    public static void main(String[] args) {

	        Employee employee = new Employee(12, "Shri", 9000);

	        System.out.println("Employee Information:");
	        System.out.println(employee);

	        employee.raiseSalary(10);

	        System.out.println("Updated Employee Information:");
	        System.out.println(employee);
	    }
	}



