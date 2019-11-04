package Ds.M1;

import java.util.Arrays;

public class LearningbyDoing{
    static int search(int[] b,int a){
        for(int i=0;i<b.length;i++){
            if(a==b[i]){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a=new int[]{4,2,3,4,2,5,1,4,3,2,2,4,3};
        int[] b=new int[5];
        int count=1;
        int count1=0;
        int k=0;

        for(int i=0;i<a.length;i++){
            if(search(b, a[i])<0){
                count=1;
                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                        count++;
                    }
                }
                b[k]=a[i];
                k++;
                count1=count1+count/2;
            }
            
        }
        System.out.println(count1);
        count1=0;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                count1++;
                i++;
            }
        }
        System.out.println(count1);
    }
}