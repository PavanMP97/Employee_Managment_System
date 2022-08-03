package edbms;

import java.sql.Date;

public class Employee {
	private String name;
	private int id;
	private String date;
	private int salary;
	private long phonenumber;
	private int password;
	public Employee(String name, int id, String date, int salary, long phonenumber,int password) {
		this.name = name;
		this.id = id;
		this.date = date;
		this.salary = salary;
		this.phonenumber = phonenumber;
		this.password=password;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "name=" + name + "  id=" + id + "  date=" + date + "  salary=" + salary + "  phonenumber="
				+ phonenumber+"\n\n";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getDate() {
		return date;
	}
//	public void setDate(String date) {
//		System.out.println("enter");
//		this.date = date;
//	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}


}
