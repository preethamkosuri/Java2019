package Ds.CircularLinkedList;

import java.util.Scanner;

class Operations {
  
    Node last;
    //declaring the functions
    Operations() {
        last = null;
    }
    void dispay(){
        Node p;
        if(last==null){
            System.out.println("empty list");
            return;
        }
        p=last.link;
        do{
            System.out.print(p.info+" ");
            p=p.link;
        }while(p!=last.link);
        System.out.println();
    }
    void create(){
        int i,n,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of nodes:");
        n=sc.nextInt();
        if(n==0){
            sc.close();
            return;
        }
        System.out.println("enter the element:");
        d=sc.nextInt();
        addInEmpty(d);
        for(i=2;i<=n;i++){
            System.out.println("enter the element:");
            d=sc.nextInt();
            addAtEnd(d);
        }
        sc.close();
    }
    //function to add Node at front
    int addAtFront(int data){ 
        Node n= new Node(data); 
        n.link=last.link;
        last.link=n;
        return last.link.info;
    }
    void addInEmpty(int data){
        Node n= new Node(data);
        last=n;
        last.link=last;
    }
    //function to check whether Linked list is empty
    boolean isEmpty(){
        return last==null;
    }
    //function to add Node at the End of list
    int addAtEnd(int data){
        Node n= new Node(data);
        n.link=last.link;
        last.link=n;
        last=n;
        return last.info;
    }
    //function to search a value
    Node search(int k){
        if(last==null){
            return null;
        }
        Node p=last.link;
        do{
            if(p.info==k){
                return p;
            }
            p=p.link;
        }while(p!=last.link);
        System.out.println("not found");
        return null;
    }
    //function to delete any Node
    Node deleteNode(int x){
        if(last==null){
            return null;
        }
        Node p=last.link;
        do{
            if(p.link.info==x){
                Node temp=p.link;
                p.link=p.link.link;
                return temp;
            }
            p=p.link;
        }while(p!=last.link);
        return null;
    }
    
    
}
  