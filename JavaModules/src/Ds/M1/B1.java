package Ds.M1;

import java.util.Arrays;

public class B1{
    static int search(int[] a,int b){
        int n3=a.length;
        int n1=0;
        int n2=(n1+n3)/2;  
        while(n1<=n3){  
            if(a[n2]<b){  
                n1=n2+1;     
            }else if(a[n2]==b){  
                return n2;
            }else{  
                n3=n2-1;  
            }  
            n2=(n1+n3)/2;  
        } 
        return -1; 

    }
    public static void main(String[] args) {
        int[] a= new int[]{0,2,1,4,6,7,3,9,8};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int s=search(a,3);
        System.out.println(s);
    }
}