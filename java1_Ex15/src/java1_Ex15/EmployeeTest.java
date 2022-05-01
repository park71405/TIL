package java1_Ex15;

interface Payable{
	double getPaymentAmount();
}

class Invoice implements Payable{
	private String description;
	private int quantity;
	private double price;
	private static int count = 0;
	
	public Invoice(String description, int quantity, double price) {
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		count++;
	}
	@Override 
	public double getPaymentAmount() {
		return quantity * price;
	}
	@Override
	public String toString() {
		return description + "\n" + "quantity: " + quantity + "\n" + "price: " + price;
	}
	
	public static int getCount() {
		return count;
	}
}

abstract class Employee implements Payable{
	private String name, id;
	static private int count = 0;
	
	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
		count++;
	}
	@Override
	public String toString() {
		return name + "(" + id + ")";
	}
	public static int getCount() {
		return count;
	}
}

class SalariedEmployee extends Employee{
	private double monthlySalary;
	
	public SalariedEmployee(String name, String id, double salary) {
		super(name, id);
		monthlySalary = salary;
	}
	@Override
	public double getPaymentAmount() {
		return monthlySalary;
	}
	@Override
	public String toString() {
		return super.toString() + "\nmonthly salary: " + monthlySalary;
	}
}

class HourlyEmployee extends Employee{
	private double wage, hours;
	
	public HourlyEmployee(String name, String id, double wage, double hours) {
		super(name, id);
		this.wage = wage;
		this.hours = hours;
	}
	@Override
	public double getPaymentAmount() {
		return wage*hours;
	}
	@Override
	public String toString() {
		return super.toString() + "\nwage: " + wage + "\nhours: " + hours;
	}
}

class CommissionEmployee extends Employee{
	private double grossSales, commissionRate;
	
	public CommissionEmployee(String name, String id, double sales, double rate) {
		super(name, id);
		grossSales = sales;
		commissionRate = rate;
	}
	@Override
	public double getPaymentAmount() {
		return grossSales * commissionRate;
	}
	@Override
	public String toString() {
		return super.toString() + "\ngross sales: " + grossSales + "\ncommissions rate: " + commissionRate;
	}
}

class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String name, String id, double sales, double rate, double salary) {
		super(name, id, sales, rate);
		baseSalary = salary;
	}
	@Override
	public double getPaymentAmount() {
		return baseSalary + super.getPaymentAmount();
	}
	@Override
	public String toString() {
		return super.toString() + "\nbase salary: " + baseSalary;
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Payable[] arr = new Payable[6];
		arr[0] = new SalariedEmployee("Smith", "s1111", 300);
		arr[1] = new HourlyEmployee("Karen", "h2222", 1, 160);
		arr[2] = new CommissionEmployee("Jones", "c3333", 2000, 0.1);
		arr[3] = new BasePlusCommissionEmployee("Lewis", "b4444", 2000, 0.06, 100);
		arr[4] = new Invoice("seat", 2, 30000);
		arr[5] = new Invoice("tire", 4, 80000);
		
		double sum = 0.0;
		for(Payable e : arr) {
			System.out.println(e);
			System.out.println("payment: " + e.getPaymentAmount());
			System.out.println();
			sum += e.getPaymentAmount();
		}
		System.out.println("Total employee: " + Employee.getCount());
		System.out.println("Total payment: " + sum);
	}
}
