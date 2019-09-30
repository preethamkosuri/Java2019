package M5.ToDoList;
import java.util.Scanner;
class Listmain {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.println("enter date(dd/mm/yyyy)");
        String date=s1.nextLine();
        System.out.println("enter taskname");
        String taskname=s1.nextLine();
        System.out.println("enter task description");
        String taskdes=s1.nextLine();
        System.out.println("enter its status");
        String status=s1.nextLine();
        System.out.println("enter lastdate(dd/mm/yyyy)");
        String lastDate=s1.nextLine();
        ToDoList b=new ToDoList(date, taskname, taskdes, status, lastDate);
        MyList m=new MyList();
        m.addTask(b);
        int l=0;
        do {
            System.out.println("enter case:");
            l=s1.nextInt();
            switch(l){
                case 1:
                System.out.println("enter date(dd/mm/yyyy)");
                String d=s1.nextLine();
                System.out.println("enter taskname");
                String t1=s1.nextLine();
                System.out.println("enter task description");
                String t2=s1.nextLine();
                System.out.println("enter its status");
                String ss=s1.nextLine();
                System.out.println("enter lastdate(dd/mm/yyyy)");
                String l1=s1.nextLine();
                ToDoList o=new ToDoList(d, t1, t2, ss, l1);
                m.addTask(o);
                break;
                case 2:
                System.out.println("enter taskname");
                String name=s1.nextLine();
                System.out.println(m.deleteTask(name));
                break;
                case 3:
                System.out.println("enter taskname");
                String nn=s1.nextLine();
                System.out.println("enter the new status(completed/incomplete):");
                String sss=s1.nextLine();
                m.updateStatus(nn,sss);
                System.out.println("Done!");
                break;
                case 4:
                m.displayPending();
                break;
                case 5:
                System.out.println("enter lastdate(dd/mm/yyyy)");
                String ll=s1.nextLine();
                m.displayLastDate(ll);
                break;
                case 6:
                System.out.println("enter taskname");
                String nnn=s1.nextLine();
                System.out.println(m.searchTask(nnn));
                break;
                case 7:
                System.out.println("enter day(dd)");
                int dd=s1.nextInt();
                m.displayOverDue(dd);
                break;
                case 8:
                m.displayAll();
                break;
            }
        } while (l<9);
    s1.close();
    }
}