package Ds.M2;

import java.util.Arrays;

public class P2 {
    public static void main(String[] args) {
        char[] c1=new char[]{'E','A','S','Y','Q','U','E','S','T','I','O','N'};
        for(int i=1;i<c1.length;i++){
            for(int j=i-1;j>=0;j--){
                if (c1[j]>c1[j+1]){
                    char t=c1[j+1];
                    c1[j+1]=c1[j];
                    c1[j]=t;
                }
            }
        }
        System.out.println(Arrays.toString(c1));
    }
}