/**
 * 
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

/**
 * @author Matos
 *
 */
public class EmployeeProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		List<Employee> employees = new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data: ");
			
			System.out.print("Outsourced (y/n)?");
			char opcao = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			double value = sc.nextDouble();
			
			if(opcao == 'y' || opcao == 'Y') {
				System.out.print("Additional charge: ");
				double addCharge = sc.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, value, addCharge));
			} else {
				employees.add(new Employee(name, hours, value));
			}
			
		}
		
		System.out.println("PAYMENTS:");
		for(Employee e: employees) {
			System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
		}
		
		sc.close();

	}

}
