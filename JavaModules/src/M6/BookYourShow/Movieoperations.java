package M6.BookYourShow;

import java.util.Scanner;

class Movieoperations{
    BookYourShow[] Movielist=new BookYourShow[100];
    int m=0;
    Scanner sc=new Scanner(System.in);
    public void addMovie(BookYourShow a){
        Movielist[m]=a;
        m++;
    }
    public void searchMovie(String name){
        for(int i=0;i<m;i++){
            if(Movielist[i].getMoviename().equals(name)){
                System.out.println(Movielist[i].getMoviename()+Movielist[i].getTheatre()+Movielist[i].getTime());
            }
        }
    }
    public int searchMain(String name, String time) {
        for(int i=0;i<m;i++){
            if(Movielist[i].getMoviename().equals(name) && Movielist[i].getTime().equals(time)){
                int[][] nw = Movielist[i].getSeats();
                for(int u=0;u<nw.length;u++){
                    for(int v=0;v<nw[0].length;v++){
                        System.out.print(nw[u][v]);
                    }
                    System.out.println("");
                }
                return i;
            }
        }
        
    }
    public void Ticketing(i){
        System.out.println("enter no of tickets:");
        int T=sc.nextInt();
        sc.nextLine();
        System.out.println("enter seat numbers according to layout(press enter after you enter every seat number):");
        for(int z=0;z<T;z++){
            int i=sc.nextInt();
            sc.nextLine();
            for(int u=0;u<nw.length;u++){
                for(int v=0;v<nw[0].length;v++){
                    System.out.print(nw[u][v]);
                }
                System.out.println("");
            }
        }
    }
    
}