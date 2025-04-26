public class HourlyEmployee extends Employee{
	private double hourlyRatee
	private double hoursWorked;
	public HourlyEmployee(String name, double rate, double hours)
	{
		super(name);
		this.hourlyRate = rate;
		this.hoursWorked = hours;
	}//end constructo
	public double getPayment()
	{
		double payment = hourlyRate * hoursWorked;
		return payment;
	}
	public String toString()
	{
		return String.format("%s, hourly:$%.02f @ %.02f hours", super.toString(), hourlyRate, hoursWorked);
	}
}
