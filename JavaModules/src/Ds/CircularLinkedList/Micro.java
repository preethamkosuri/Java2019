package Ds.CircularLinkedList;
import java.util.*;

class Micro{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of nodes:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter E to Enqueue or D to Dequeue:");
            char c=sc.next().charAt(0);
            if(c=='E'){
                System.out.println("enter a number:");
                int a=sc.nextInt();
                q.add(a);
                System.out.println(q.size());
            }
            else if(c=='D'){
                if(q.size()==0){
                    System.out.println(-1+" "+q.size());
                }
                else{
                    System.out.println(q.remove()+" ");
                }
            }
        }
        sc.close();
    }
}