package M6.BookYourShow;
import java.util.Scanner;
class Bysmain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter theatre:");
        String theatre=s.nextLine();
        System.out.println("enter number of rows:");
        int rows=s.nextInt();
        s.nextLine();
        System.out.println("enter number of columns:");
        int columns=s.nextInt();
        s.nextLine();
        System.out.println("enter movie name:");
        String moviename=s.nextLine();
        String time[]={"11 AM","2 PM","6 PM","10 PM"};
        System.out.println("enter price:");
        int price=s.nextInt();
        s.nextLine();
        int seats[][]=new int[rows][columns]; 
        int num=1;
        for(int i=0; i<rows;i++)
         {            
            for(int j=0; j<columns;j++)
            {
                seats[i][j]=num;
                num++;
            }
         }
        Movieoperations c=new Movieoperations();
        for(int j=0;j<4;j++){
            BookYourShow cc=new BookYourShow(theatre, moviename, time[j], price, seats);
            c.addMovie(cc);
        }
        
        int k;
        do{
            System.out.println("enter 1 to add movie, 2 to book a ticket:");
            k=s.nextInt();
            s.nextLine();
            switch(k){
                case 1:
                    System.out.println("enter theatre:");
                    String theatr=s.nextLine();
                    System.out.println("enter number of rows:");
                    int ro=s.nextInt();
                    s.nextLine();
                    System.out.println("enter number of columns:");
                    int colum=s.nextInt();
                    s.nextLine();
                    System.out.println("enter movie name:");
                    String movienam=s.nextLine();
                    System.out.println("enter timings:");
                    System.out.println("enter price:");
                    int pric=s.nextInt();
                    s.nextLine();
                    int seat[][]=new int[ro][colum]; 
                    int num1=1;
                    for(int i=0; i<ro;i++){            
                        for(int j=0; j<colum;j++){
                            seat[i][j]=num1;
                            num1++;
                        }
                    }
                    for(int j=0;j<4;j++){
                        BookYourShow ccc=new BookYourShow(theatr, movienam, time[j], pric, seat);
                        c.addMovie(ccc);
                    }
                    
                case 2:
                    System.out.println("enter the movie name:");
                    String searchname=s.nextLine(); 
                    c.searchMovie(searchname);
                    System.out.println("do you want to book tickets(y/n):");
                    String ch = s.nextLine();
                    if(ch.equals("y")){
                        System.out.println("select show: 1 for"+time[0]+"2 for:"+time[1]+"3 for:"+time[2]+"4 for:"+time[3]);
                        int o=s.nextInt();
                        s.nextLine();
                        c.searchMain(searchname,time[o-1]);
                    }
                    else{
                        System.out.println("Thank you!");
                    }

            }

        }while(k!=0);
        s.close();
    }
}