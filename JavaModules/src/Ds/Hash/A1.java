package Ds.Hash;
import java.util.*;
class A1{
    public Map<String, Integer> splitter(String ss) {
        Map<String,Integer> mn=new HashMap<String,Integer>();
        Integer n;
        for(String s:ss.split("[^a-zA-Z]+")) {
            n=mn.get(s);
            if(n==null) {
                mn.put(s, 1);
            }
            else {
                mn.put(s,n+1);
            }
        }
        return mn;
    }
    public void check(Map<String, Integer> mmap,Map<String, Integer> nmap){
        boolean c=true;
        for(String s:nmap.keySet()){
            if(!mmap.containsKey(s)||(mmap.get(s)<nmap.get(s))){
                c=false;
                break;
            }
        }
        System.out.println((c)?"Yes":"No");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        A1 o = new A1();
        System.out.println("enter magzine words:");
        Map<String,Integer> mmap=o.splitter(sc.nextLine());
        System.out.println("enter ransom note:");
        Map<String,Integer> nmap=o.splitter(sc.nextLine());
        System.out.println(nmap.toString());
        System.out.println(mmap.toString());
        o.check(mmap, nmap);
        sc.close();
    }
}