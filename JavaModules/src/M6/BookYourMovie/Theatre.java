package M6.BookYourMovie;
import java.util.Scanner;
import java.util.Arrays;

public class Theatre {
    Movie movie;
    String theatreName, city, location, showTimes[];
    short capacity, ticketPrice;
    char seats[][][];
    Scanner sc = new Scanner(System.in);

    Theatre(){
        System.out.println("Enter the theatre name:");
        this.theatreName = sc.nextLine();
        System.out.println("Enter the city of the theatre:");
        this.city = sc.nextLine();
        System.out.println("Enter the location of the theatre in "+city+": ");
        this.location = sc.nextLine();
        this.movie = new Movie();
        System.out.println("Enter the capacity of the theatre: (should be less than 260 and let the unit's place be in 0's)");
        this.capacity = sc.nextShort();
        System.out.println("Enter the ticket price:");
        this.ticketPrice = sc.nextShort();
        System.out.println("Enter the number of shows:");
        byte shows = sc.nextByte();
        sc.nextLine();
        this.showTimes = new String[shows];
        this.seats = new char[shows][this.capacity/10][10];
        for (int dim =0; dim < shows; dim++)
            for (int row = 0; row < seats[dim].length; row++)
                Arrays.fill(this.seats[dim][row], 'X');
        while (shows > 0) {
            System.out.println("Enter show "+ (this.showTimes.length - shows + 1) +" time: [hh:mm]am/pm");
            this.showTimes[showTimes.length-shows] = sc.nextLine();
            shows--;
        }
    }

    void displayTheatreDetails(){
        System.out.println(this.theatreName+ " "+ this.city+ " "+ this.location);
        System.out.println(this.movie.movieName+ " " + this.movie.language+ " "+ this.movie.duration);
        for (String show:this.showTimes){
            System.out.print(show+" ");
        }
        System.out.print("\n");
    }

    private void displaySeats(int showIndex){
        char alpha = 'A';
        System.out.println("X-available   O-booked");
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for (char[] values:seats[showIndex]){
            System.out.print(alpha+" ");
            for (char c:values)
                System.out.print(c+" ");
            System.out.print("\n");
            alpha++;
        }
    }

    private short availableTickets(int showTimeIndex){
        short count = 0;
        for (char[] values:seats[showTimeIndex])
            for (char c:values)
                if (c == 'X')
                    count++;
        return count;
    }

    void bookShow(byte numberOfTickets){
        System.out.println("Enter the show time:");
        String time = sc.nextLine();
        for (int index = 0; index < showTimes.length; index++){
            if (showTimes[index].equalsIgnoreCase(time)){
                displaySeats(index);
                if (numberOfTickets <= this.availableTickets(index)){
                    System.out.println("select the row: [capital alphabet letters]");
                    char row = sc.next().charAt(0);
                    sc.nextLine();
                    int rowIndex = row - 'A';
                    System.out.println("select the seat numbers: [numbers from 1- 10]");
                    for (int i=1; i <= numberOfTickets;){
                        System.out.println("Enter the seat number for person"+i);
                        byte seatNo = sc.nextByte();
                        if (seats[index][rowIndex][seatNo-1] =='X'){
                            seats[index][rowIndex][seatNo-1] = 'O';
                            i++;
                        }
                        else{
                            System.out.println("Seat is booked try another seat");
                        }
                    }
                    System.out.println(numberOfTickets+" Seats are booked for "+movie.movieName+" amount paid is:"+ calculatePrice(numberOfTickets));
                    displaySeats(index);
                    return;
                }
                else{
                    System.out.println("Requested number of tickets are not available");
                    return;
                }
            }
        }
    }

    float calculatePrice (byte numberOfTickets){
        int ticketFare = numberOfTickets * this.ticketPrice, internetHandlingFee = 5 * numberOfTickets;
        float tax = ticketFare*0.05F, totalAmount = ticketFare+internetHandlingFee+tax;
        return totalAmount;
    }
}
