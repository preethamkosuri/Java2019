package Ds.Linkedlist.P1;

import java.util.Scanner;

public class Operations{
    private Node start;
    private Node last;
    int size;
    public Operations() {
        start = null;
        last = null;
        size=0;
    }
    public void display(){
        Node p=start;
        while(p!=null){
            System.out.print(p.getInfo()+",");
            p=p.getLink();
        }
        System.out.println();
    }

    public void insertBegin(int data){
        Node temp=new Node(data);
        if(start==null){
            start = temp;
            last = temp;
        } else {
            temp.setLink(start);
            start = temp;
        }
        size++;
    }

    public void insertEnd(int data){
        Node temp=new Node(data);
        if(start==null){
            start = temp;
            last = temp;
        } else {
            last.setNext(temp);
            last = temp;
        }
    }
    
    public void create(){
        int i,n,data;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of node:");
        n=sc.nextInt();
        if(n==0){
            sc.close();
            return;
        }
        for(i=0;i<n;i++){
            System.out.println("enter the data:");
            data=sc.nextInt();
            insertEnd(data);
            size++;
        }
        sc.close();
    }

    public Node getPrevious(int x){
        if (start == null)
            return null;
        if (start.getInfo() == x)
            return start;
        Node p=start;
        while(p.getLink()!=null){
            if(p.getLink().getInfo()==x){
                return p;
            }
            p=p.getLink();
        }
        return null;
    }
    public Node getIndex(int i){
       /*if (start == null)
            return null;
        else if (size==1)
            return start;
        else if(size==i)
            return last;*/
        Node p=start;
        for(int j=0; i<size && j<i;j++,p=p.getLink());
        return p;
    }
    public Node getPrev(int i){
        if (start == null)
            return null;
        else{
            Node p=start;
            int j=0;
            while(j<i){
                p=p.getLink();
                j++;
            }
            return p;
        }
    }
    public void inserAfter(int data,int x){
        Node p = getPrevious(x);
        if(start==null || p == null){
            System.out.println("Insertion is not Possible because of given data not found ..");
            return;
        }
        if (p!=start){
            p = p.getLink();
        }
        p.setNext(new Node(data));
    }

    public void inserBefore(int data,int x){
        Node p = getPrevious(x);
        if(start==null || p == null){
            System.out.println("Insertion is not Possible because of given data not found ..");
            return;
        }
        if (p == start){
            insertBegin(data);
            return;
        }
        p.setNext(new Node(data));
    }

    public void removeElement(int x){
        if(start.getInfo()==x){
            start=null;
            last=null;
            size=0;
            return;
        }
        
        Node p=getPrevious(x);
        p.setLink(p.getLink().getLink());
        size--;
    }

    public void removeIndex(int i){
        if(size==1 && i==1){
            start=null;
            last=null;
            size=0;
            return;
        }
        Node p=getIndex(i-1);
        p.setLink(p.getLink().getLink());
        size--;
    }
    public int popBack(){
        System.out.println("Size = "+size);
        int x;
        if(size>1){
            x=last.getInfo();
            Node p=getIndex(size-1);
            p.setLink(null);
            last=p;
            return x;
        }
        else if(size==1){
            x=start.getInfo();
            start=null;
            last=null;
            size--;
            return x;
        }
        return -1;
    }
    public int popFront(){
        int x;
        if(size>1){
            x=start.getInfo();
            start=start.getLink();
            size--;
            return x;
        }
        else if(size==1){
            x=start.getInfo();
            start=null;
            size--;
            return x;
        }
        return -1;
    }
    public void reverse(){ 
        Node temp1=null,temp2=null; 
        while(start!=null){ 
            temp2=start.getLink(); 
            start.setLink(temp1);
            temp1=start; 
            start=temp2; 
        } 
        start=temp1;

    } 
    public void delete(){
        start=null;
        last=null;
        size=0;
    }
    

    
}