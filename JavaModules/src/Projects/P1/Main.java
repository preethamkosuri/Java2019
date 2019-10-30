package Projects.P1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public void disp(){
        ArrayList<Product> pro = Productfile.readPrducts();
        for(int i = 0; i < pro.size(); i++) {   
            System.out.println(pro.get(i));
        }  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("**********************");
        System.out.println("Welecome to shopping!");
        System.out.println("**********************");
        Main s=new Main();
        s.disp();
        Cart[] list= new Cart[100];
        ArrayList<Cart> detail=new ArrayList<Cart>();;
        int sum=0;
        int size=0;
        int s1=1;
        ArrayList<Product> pro = Productfile.readPrducts();
        do {
            System.out.println("enter product Id to add cart or 0 to exit:");
            s1=sc.nextInt();
            if(s1>0){
                System.out.println(pro.get(s1-1));
                System.out.println("enter the quantitty below the quantity available:");
                int qty=sc.nextInt();
                int price=pro.get(s1-1).getPrice();
                Cart item = new Cart(s1, qty, price);
                detail.add(item);
                sum=sum+(qty*price);
                list[size]=item;
                size++;
            }

        } while (s1!=0);
        if(size>0){
            System.out.println("to generate bill, press 1, or press 0 to exit the application:");
            int k=sc.nextInt();
            if(k==1){
                System.out.println("Sign in required!");
                System.out.println("enter username:");
                String uname=sc.next();
                for(int j=0;j<size;j++){
                    System.out.println(list[j]);
                }
                System.out.println("you bill amount is:"+sum);
                System.out.println("enter 1 to pay or 2 to exit:");
                int a1=sc.nextInt();
                Admin a=new Admin();
                if(a1==1 && uname!=null){
                    for(int e=0;e<size;e++){
                        int p1=list[e].getPid();
                        int q1=list[e].getQyt();
                        a.update(p1,1,-q1);
                    }
                    System.out.println("uname:"+uname);
                    Log l = new Log(uname, detail);
                    System.out.println("T1");
                    ArrayList<Log> ro = Productfile.readLogs();
                    System.out.println("T2");
                    if (ro == null)
                        ro = new ArrayList<Log>();
                    ro.add(l);
                    Productfile.writeLogs(ro);
                    System.out.println("T3");
                }    
            }
            //Arrays.fill(list, 0);
            }
        
        sc.close();
    }
}