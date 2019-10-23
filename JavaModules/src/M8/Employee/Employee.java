package M8.Employee;
class Employee{
    String Name, Surname, Address ;
    double BasicSalary;

    public Employee(String name, String surname, String address, Double basicSalary) {
        Name = name;
        Surname = surname;
        Address = address;
        BasicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return BasicSalary;
    }

    @Override
    public String toString() {
        return "Employee [Address=" + Address + ", BasicSalary=" + BasicSalary + ", Name=" + Name + ", Surname="
                + Surname + "]";
    }
    
}