package Ds.CircularLinkedList;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Methods {
    Node last;
    void addInEmpty(int data) {
        Node n = new Node(data);
        last = n;
        last.link = last;
    }

    boolean isEmpty() {
        return last == null;
    }

    void push(int data) {
        if(!isEmpty()){
            Node n = new Node(data);
            n.link = last.link;
            last.link = n;
            last = n;
        }
        else{
            addInEmpty(data);
        }
    }
    void pop(){
        if(last==null){
            System.out.println("No Food");
            return;
        }
        else if(last.link==last){
            System.out.println(last.info);
            last=null;
            return;
        }
        else{
            System.out.println(last.info);
            Node p=last.link;
            while(p.link!=last){
                p=p.link;
            }
            p.link=last.link;
            last=p;
        }
    }
}

class Monk {
    public static void main(String[] args) throws FileNotFoundException {
        //String s="D:\\Java2019\\JavaModules\\src\\Ds\\CircularLinkedList\\input.txt";
        System.out.println("enter no of nodes");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        Methods m=new Methods();
        for(int i = 0; i < n; i++){
            System.out.println("enter 1 for Customer Query or 2 for Chef Query:");
            int j=sc.nextInt();
            if(j==1){
                m.pop();
            }
            else if(j==2){
                System.out.println("enter cost:");
                int k=sc.nextInt();
                m.push(k);
                
            }
            /*try{
                int input = Integer.parseInt(sc.nextLine());
                //System.out.println("inut"+input);
                if(input==1){
                    m.pop();
                }
            }
            catch(Exception e){
                String[] input=sc.nextLine().split("-");
                System.out.println(Arrays.toString(input));
                if(input[0].equals("2")){
                    int j=Integer.parseInt(input[1]);
                    //System.out.println("j"+j);
                    m.push(j);
                }
            }*/
        }
        sc.close();
    }
}