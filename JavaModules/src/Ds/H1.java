package Ds;
import java.util.Scanner;
class H1{
    static boolean check(String s){
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(check(sc.nextLine()));
        sc.close();
    }
}