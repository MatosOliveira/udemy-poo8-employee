/**
 * 
 */
package entities;

/**
 * Classe que contem as informacoes do funcionario
 * 
 * @author Matos - 14.06.2023
 *
 */
public class Employee {
	
	protected String name;
	private Integer hours;
	private Double valuePerHour;
	
	public Employee() {
	}

	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Double payment() {
		return  hours * valuePerHour;
	}

}
