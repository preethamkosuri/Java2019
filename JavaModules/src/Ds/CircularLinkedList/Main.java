package Ds.CircularLinkedList;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int c,x;
        Scanner sc=new Scanner(System.in);
        Operations o=new Operations();
        o.create();
        do{
            System.out.println("1:display; 2:add beginning; 3:add end; 4:delete element; 5:search; 6:QUIT");
            System.out.println("enter choice");
            c=sc.nextInt();
            switch(c){
                case(1):
                    o.dispay();
                    break;
                case(2):
                    System.out.println("enete the element:");
                    x=sc.nextInt();
                    o.addAtFront(x);
                    break;
                case(3):
                    System.out.println("enete the element:");
                    x=sc.nextInt();
                    o.addAtEnd(x);
                    break;
                case(4):
                    o.dispay();
                    System.out.println("enete the element:");
                    x=sc.nextInt();
                    o.deleteNode(x);
                    break;
                case(5):
                    System.out.println("enete the element:");
                    x=sc.nextInt();
                    o.search(x);
                    break;
                case(6):
                    break;

            }
        }while(c<5);
        sc.close();
    }
}