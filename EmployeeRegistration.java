package edbms;

import java.util.Scanner;

public class EmployeeRegistration {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		EmployeeManagmentSystem emp=new EmployeeImpl();
		while(true) {
			System.out.println("WELCOME TO EDBMS");
			System.out.println("-----------------");
			System.out.println("1: Add Employee\n2: RemoveEmployee\n3: RemoveAllEmployee");
			System.out.println("4: DisplayEmployee\n5: DisplayAllEmployee\n6: UpdateEmployee");
			System.out.println("7: CountEmployee\n8: SortEmployee\n9: Exit");
			System.out.println("----------------------------------");
			System.out.println("Enter the Choice");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:emp.addEmployee();
			break;
			case 2:emp.removeEmployee();
			break;
			case 3:emp.removeAllEmployee();
			break;
			case 4:emp.DisplayEmployee();
			break;
			case 5:emp.DisplayAllEmployee();
			break;
			case 6:emp.UpdateEmployee();
			break;
			case 7:emp.CountEmployee();
			break;
			case 8:emp.sortEmployee();
			break;
			case 9:System.out.println("THANK YOU...........");
				System.exit(0);
				break;
			default:System.out.println("Enter valid choice\n__________________________________________");
			break;
			}

		}
	}

}
//void addEmployee();
//void removeEmployee();
//void removeAllEmployee();
//void DisplayEmployee();
//void DisplayAllEmployee();
//void UpdateEmployee();
//void CountEmployee();
//void sortEmployee();