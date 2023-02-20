package Com.Intenship.EMS;

public class Employee {
	private int id;
	private String name1;
	private double salary;
	private int age;
	
	//default constructor
	public Employee() {
		
	}
	
	//Creating the constructor with fields 
	public Employee(int id, String name1, double salary, int age) {
		super();
		this.id = id;
		this.name1 = name1;
		this.salary = salary;
		this.age = age;
	}
	public int getId() {
		return id;
	
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name1;
	}
	public void setName(String name) {
		this.name1 = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name1 + ", salary=" + salary + ", age=" + age + "]";
	}
                       
	
	

}
