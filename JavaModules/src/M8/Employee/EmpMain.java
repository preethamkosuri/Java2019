package M8.Employee;

import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        String name=sc.nextLine();
        System.out.println("enter surname:");
        String surname=sc.nextLine();
        System.out.println("enter address:");
        String address=sc.nextLine();
        System.out.println("enter basicsalary:");
        double basicSalary=sc.nextDouble();
        System.out.println("enter 1 for permanent or 2 for temperory:");
        int i=sc.nextInt();
        sc.nextLine();
        if(i==1){
            System.out.println("enter providentfund(in percentage):");
            int n=sc.nextInt();
            sc.nextLine();
            FullEmployee f=new FullEmployee(name, surname, address, basicSalary, n);
            f.netsalary();
        }
        else{
            System.out.println("enter no of days:");
            int n=sc.nextInt();
            sc.nextLine();
            TempEmployee t=new TempEmployee(name, surname, address, basicSalary, n);
            double s=t.netSalary(30);
            System.out.println(s);
        }
    sc.close();
    }
}