package M8.Employee;
class TempEmployee extends Employee{

    int no_of_days_worked;
    public TempEmployee(String name, String surname, String address, Double basicSalary, int no_of_days_worked) {
        super(name, surname, address, basicSalary);
        this.no_of_days_worked = no_of_days_worked;
        
    }
	public double netSalary(int no_of_days_in_month){
        double salary = (no_of_days_worked * BasicSalary) / no_of_days_in_month;
        return salary;
    }
}