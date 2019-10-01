package M4.CardCatalog;
import java.util.Scanner;
class Cardmain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter title:");
        String title=s.nextLine();
        System.out.println("enter author name:");
        String author=s.nextLine();
        System.out.println("enter task subject:");
        String subject=s.nextLine();
        CardCatalog c=new CardCatalog();
        Card cc=new Card(title, author, subject);
        c.addACard(cc);
        int k;
        do{
            System.out.println("1:add a card;2:get a title;3:get an author;4:get subject;5:remove a title;6:print;0: to EXIT");
            System.out.println("enter case:");
            k=s.nextInt();
            s.nextLine();
            switch(k){
                case 1:
                    System.out.println("enter title:");
                    String titl=s.nextLine();
                    System.out.println("enter author name:");
                    String autho=s.nextLine();
                    System.out.println("enter task subject:");
                    String subjec=s.nextLine();
                    Card ccc=new Card(titl,autho,subjec);
                    c.addACard(ccc);
                    break;
                case 2:
                    System.out.println("enter title:");
                    String t=s.nextLine();
                    System.out.println("Card"+c.getATitle(t));
                    break;
                case 3:
                    System.out.println("enter Author name:");
                    String t1=s.nextLine();
                    System.out.println("Card"+c.getAnAuthor(t1));
                    break;
                case 4:
                    System.out.println("enter subject:");
                    String t2=s.nextLine();
                    System.out.println("Card"+c.getSubject(t2));
                    break;
                case 5:
                    System.out.println("enter title:");
                    String t3=s.nextLine();
                    c.removeATitle(t3);
                    break;
                case 6:
                    System.out.println("enter the type(title/author/subject):");
                    String t4=s.nextLine();
                    c.printTheCatalog(t4);
                    break;
            }
        }while(k!=0);
    s.close();
    }
}