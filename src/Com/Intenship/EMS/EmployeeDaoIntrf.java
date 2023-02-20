package Com.Intenship.EMS;

//This interface is used to tell what are the operations done on it
public interface EmployeeDaoIntrf {
	
	//create employee
	public void createEmployee(Employee emp);
	
	//show all employee
	public void showAllEmployee();
	
	//show employee based on id
	public void showEmployeeBaseOnId(int id);
	
	//update employee
	public void updateEmployee(int id,String name);
	
	//delete employee
	public void deleteEmployee(int id);
	

}
