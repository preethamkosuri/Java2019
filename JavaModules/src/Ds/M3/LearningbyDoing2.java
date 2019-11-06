package Ds.M3;

import java.util.Arrays;

public class LearningbyDoing2{
    static int partition(int[] a,int l,int h){
        int p=a[l];
        int temp,i=l,j=h;
        while(i<j){
            while(i<h && a[i]<p){
               
                i++;
            }
            while(j>-1 && a[j]>p){
                j--;
            }
            if(i<=j){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        /*temp=a[l];
        a[l]=a[j];
        a[j]=temp;*/
       
        return j;
    }
    static void quicksort(int[] a,int l,int h){
        //System.out.println(Arrays.toString(a));
        if(l<h){
            int loc=partition(a, l, h);
            quicksort(a, l, loc-1);
            quicksort(a, loc+1, h);
        }
    }
    public static void main(String[] args) {
        int[] a=new int[]{82, 66, 214, 267, 904, 335, 16, 186, 532, 976, 887, 20, 851, 137, 489, 250, 883, 301, 95, 814, 437, 995, 228, 797};
        quicksort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));

    }
}