package M6.BookYourMovie;
import java.util.Scanner;

public class Movie {
    String movieName, language, duration; // you can also add censorRating.

    Movie(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the movie name:");
        this.movieName = sc.nextLine();
        System.out.println("Enter the language of the movie:");
        this.language = sc.nextLine();
        System.out.println("Enter the duration of the movie: [x hrs  y mins]");
        this.duration = sc.nextLine();
        sc.close();
    }
}
