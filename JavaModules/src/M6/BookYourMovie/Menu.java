package M6.BookYourMovie;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args){
        Theatre theatre1 =  new Theatre();
        menu(theatre1);
    }

    static void menu(Theatre theatre){
        Scanner sc =new Scanner(System.in);
        byte tickets;
        System.out.println("---MENU---");
        do{
            System.out.println( "\n1.display theatre details\n" +
                                "2.book show\n" +
                                "3.Price Estimator\n" +
                                "4.exit");
            System.out.println("Select your option:");
            byte choice = sc.nextByte();
            sc.nextLine();
            switch(choice){
                case 1:
                    theatre.displayTheatreDetails();
                    break;
                case 2:
                    System.out.println("Enter the number of tickets:");
                    tickets = sc.nextByte();
                    sc.nextLine();
                    theatre.bookShow(tickets);
                    break;
                case 3:
                    System.out.println("Enter the number of tickets:");
                    tickets = sc.nextByte();
                    sc.nextLine();
                    System.out.println("Estimated price for "+tickets+" is "+theatre.calculatePrice(tickets));
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}
