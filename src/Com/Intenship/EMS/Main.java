package Com.Intenship.EMS;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name1;
		int id;
		//We can access all the method 
		EmployeeDaoIntrf dao=new EmployeeDaoImpl();
		System.out.println("Welcome to Employee management application");
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.Add Employee \n" + "2. Show All Employee \n" + "3. Show Employee based on id \n"
					+ "4. Upadate the employee\n" + "5. Delete the Employee\n");
			System.out.println("Enter your choice: ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				Employee emp=new Employee();
				System.out.println("Enter Employee id  :");
				 id=sc.nextInt();
				
				System.out.println("Enter Employee name: " +sc.nextLine());
				 name1=sc.nextLine();
				System.out.println("Enter Employee salary");
				double salary=sc.nextDouble();
				System.out.println("Enter Employee age");
				int age=sc.nextInt();
				//using set What ever got from the user as a input
				emp.setId(id);
				emp.setName(name1);
				emp.setSalary(salary);
				emp.setAge(age);
				dao.createEmployee(emp);
				break;
			case 2:
				dao.showAllEmployee();
				break;
			case 3:
				System.out.println("Enter id to show the detaile");
				int empid=sc.nextInt();
				dao.showEmployeeBaseOnId(empid);
				break;
			case 4:
				System.out.println("Enter id to update the details");
				 empid=sc.nextInt();
				 System.out.println("Enter the new name"+sc.nextLine());
				 name1=sc.nextLine();
				dao.updateEmployee(empid , name1);
				break;
			case 5:
				System.out.println("Enter the id to delete");
				id=sc.nextInt();
				dao.deleteEmployee(id);
				break;
			case 6:
				System.out.println("Thanks for using this application");
				System.exit(0);
				//default case is used to print any Invalid value get from the user
				default:
					System.out.println("Enter valid choice");
					break;
				
			}

		} while (true);

	}

}
