package M8.Employee;
class FullEmployee extends Employee{
    int pro;
    public FullEmployee(String name, String surname, String address, Double basicSalary, int pro) {
		super(name, surname, address, basicSalary);
		this.pro = pro;
    }
	public void netsalary() {
        double pf=(BasicSalary+((BasicSalary*pro)/100));
        System.out.println(pf);
	}

}