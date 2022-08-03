package edbms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeImpl implements EmployeeManagmentSystem 
{
	LinkedHashMap<Integer, Employee> db=new LinkedHashMap<>();
	public LinkedHashMap<Integer, Employee> getDb() {
		return db;
	}

//	public void setDb(LinkedHashMap<Integer, Employee> db) {
//		this.db = db;
//	}

	Scanner scan=new Scanner(System.in);
	Date d=new Date();
	@Override
	public void addEmployee() 
	{
		System.out.println("Enter employee ID:");
		int id=scan.nextInt();
		System.out.println("Enter employee name:");
		String name=scan.next();
		System.out.println("Enter salary:");
		int salary=scan.nextInt();
		System.out.println("Enter phone number:");
		long phnum=scan.nextLong();
		System.out.println("enter password");
		int password=scan.nextInt();
//		String date=d.toLocaleString();
		Employee emp=new Employee(name, id, d.toLocaleString(), salary, phnum,password);
		db.put(id, emp);
		System.out.println("Employee details added Succesfully\n");
	}

	@Override
	public void removeEmployee()
	{
		System.out.println("Enter id to remove employee");
		int id=scan.nextInt();
		try {
			db.containsKey(id);
			System.out.println("Details removed sucessfully\n");
			throw new EmplloyeeNotFoundExcaption("Employee Not Found");
		}
		catch(EmplloyeeNotFoundExcaption e)
		{
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void removeAllEmployee() 
	{
		Set<Integer> set=db.keySet();
		for(int i:set) {
			db.remove(i);
		}
		System.out.println("All details are removed from DataBase\n");
	}

	@Override
	public void DisplayEmployee() 
	{
		System.out.println("Enter ID to display:\n");
		int id=scan.nextInt();
		System.out.println(db.get(id)+"\n");
	}

	@Override
	public void DisplayAllEmployee() 
	{
		Set<Integer> set=db.keySet();
		for(int i:set) {
			System.out.println(db.get(i));
		}
	}

	@Override
	public void UpdateEmployee() 
	{
		System.out.println("Enter the area to update");
		System.out.println("1: name\n2: salary\n3: phonenumber");
		int choice=scan.nextInt();
		System.out.println("Enter id to  update: ");
		int id=scan.nextInt();

		if(db.containsKey(id)) 
		{

			switch(choice) 
			{

			case 1:
				System.out.println("Enter name to update");
				String name =scan.next();
				db.get(id).setName(name);
				System.out.println("Name Updated Sucessfully");
				break;
			case 2: 
				System.out.println("Enter salary to update");
				int salary=scan.nextInt();
				db.get(id).setSalary(salary);
				System.out.println("Employee Salary Updated Sucessfully");
				break;
			case 3:
				System.out.println("Enter Phone Number to Update");
				long Phno=scan.nextLong();
				db.get(id).setPhonenumber(Phno);
				System.out.println("Employee PhoneNumber Updated Sucessfully");
				break;
			default:
				System.out.println("Enter valid choice");
			}
		}
		else
		{

			try
			{
				throw new EmplloyeeNotFoundExcaption("employee not found");
			}
			catch (EmplloyeeNotFoundExcaption e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void CountEmployee()
	{
		System.out.println("There are "+db.size()+" number of employees");
	}

	@Override
	public void sortEmployee()
	{
		System.out.println("Select the area to sort:");
		System.out.println("1: name \n2: salary");
		int choice=scan.nextInt();
		Set<Integer> set=db.keySet();
		System.out.println("Enter order of sorting: ");
		System.out.println("1:  Ascending\n2: Descending");
		int order=scan.nextInt();
		ArrayList<Employee> t1=new ArrayList<>();
		for(int s:set) {
			t1.add(db.get(s));
		}
		switch(order) {
		case 1:
			switch(choice) {
			case 1:
//				TreeSet<Employee> t1=new TreeSet<>(new SortEmployeeNameByAscendingOrder());
//				for(int s:set) {
//					t1.add(db.get(s));
//				}
				Collections.sort(t1,new SortEmployeeNameByAscendingOrder());
				System.out.println(t1);
				break;
			case 2:
//				TreeSet<Employee> t2=new TreeSet<>(new SortEmployeeSalaryByAscendingOrder());
//				for(int i:set) {
//					t2.add(db.get(i));
//				}
				Collections.sort(t1,new SortEmployeeSalaryByAscendingOrder());
				System.out.println(t1);
				break;
			default:
				System.out.println("enter valid choice");
				break;
			}
			break;
		case 2:
			switch(choice) {
			case 1:
//				TreeSet<Employee> t1=new TreeSet<>(new SortEmployeeNameByDescendingOrder());
//				for(int s:set) {
//					t1.add(db.get(s));
//				}
				Collections.sort(t1,new SortEmployeeNameByDescendingOrder());
				System.out.println(t1);
				break;
			case 2:
//				TreeSet<Employee> t2=new TreeSet<>(new SortEmployeeSalaryByDescendingOrder());
//				for(int i:set) {
//					t2.add(db.get(i));
//				}
				Collections.sort(t1,new SortEmployeeSalaryByDescendingOrder());
				System.out.println(t1);
				break;
			default:
				System.out.println("enter valid choice");
			}
			break;
		default:
			System.out.println("select valid order");
		}

	}

}
