package Ds.M2;

import java.util.Arrays;

public class P1{
    public static void main(String[] args) {
        char[] c=new char[]{'E','A','S','Y','Q','U','E','S','T','I','O','N'};
        for(int i=0;i<c.length-1;i++){
            for(int j=i+1;j<c.length;j++){
                if (c[j]<c[i]){
                    char t=c[i];
                    c[i]=c[j];
                    c[j]=t;
                }
            }
        }
        System.out.println(Arrays.toString(c));
    }
}