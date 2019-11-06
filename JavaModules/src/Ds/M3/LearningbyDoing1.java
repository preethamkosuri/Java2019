package Ds.M3;

import java.util.Arrays;

public class LearningbyDoing1{
    void merge(int a[],int l,int m,int h){
        int n1=m-l+1; 
        int n2=h-m;
        int b1[]=new int[n1]; 
        int b2[]=new int[n2];
        for(int i=0;i<n1;i++){
            b1[i]=a[l+i];
        }
        for(int j=0; j<n2;j++){
            b2[j]=a[m+1+j];
        }
        int i=0,j=0,k=l; 
        while (i<n1 && j<n2){ 
            if (b1[i]<=b2[j]){ 
                a[k]=b1[i]; 
                i++; 
            } 
            else{ 
                a[k]=b2[j]; 
                j++; 
            } 
            k++; 
        }
        while (i<n1){ 
            a[k]=b1[i]; 
            i++; 
            k++; 
        }
        while(j<n2){ 
            a[k]=b2[j]; 
            j++; 
            k++;
        } 
    }
    void sort(int a[],int l,int h){ 
        if(l<h){
            int m=(l+h)/2;
            sort(a,l,m); 
            sort(a,m+1,h);
            merge(a,l,m,h); 
        } 
    }
    public static void main(String args[]){ 
        int a[]={2,7,1,6,5,4,3};
        LearningbyDoing1 o=new LearningbyDoing1(); 
        o.sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    } 
}