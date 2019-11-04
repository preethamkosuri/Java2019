package Ds.M1;

import java.util.Arrays;

public class A2{
    static int search(int[] b,int a){
        for(int i=0;i<b.length;i++){
            if(a==b[i]){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n=0;
        int[] a=new int[]{1,2,3,3,4};
        int[] b=new int[]{4,5,6,3,7,1,9};
        int[] o=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            if(search(b,a[i])>0 && (search(o, a[i]))<0){
                o[n]=a[i];
                n++;
            }
        }
        Arrays.sort(o);
        System.out.println(Arrays.toString(o));
    }
}