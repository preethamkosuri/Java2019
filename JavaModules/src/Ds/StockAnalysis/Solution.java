package Ds.StockAnalysis;

import java.io.File;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.PriorityQueue;
import java.util.Scanner;

class MStock {
    String name;
    Double p;

    public MStock(String name, Double p) {
        this.name = name;
        this.p = p;
    }

    @Override
    public String toString() {
        return name + " " + p;
    }
    
}


public class Solution{
    public static void main(String[] args) {
        try {
            for(int o=0;o<5;o++){
                File myObj=new File("D:\\Java2019\\JavaModules\\src\\Ds\\StockAnalysis\\testcases\\input00"+o+".txt");
                Scanner myReader=new Scanner(myObj);
                int n=Integer.parseInt(myReader.nextLine());
                PriorityQueue<MStock> minPQ[]=new PriorityQueue[6];
                PriorityQueue<MStock> maxPQ[]=new PriorityQueue[6];
                Hashtable<String, Integer> maxhash=new Hashtable<String,Integer>();
                Hashtable<String, Integer> minhash=new Hashtable<String,Integer>();
                
                for(int i=0;i<6;i++){
                    minPQ[i]=new PriorityQueue<MStock>(new Comparator<MStock>(){public int compare(MStock lhs,MStock rhs){return (lhs.p<rhs.p)?1:-1;}});
                    maxPQ[i]=new PriorityQueue<MStock>(new Comparator<MStock>(){public int compare(MStock lhs,MStock rhs){return (rhs.p<lhs.p)?1:-1;}});
                    for(int j=0;j<n;j++){
                        String data=myReader.nextLine();
                        String[] a=data.split(",");
                        minPQ[i].add(new MStock(a[0],Double.parseDouble(a[1])));
                        maxPQ[i].add(new MStock(a[0],Double.parseDouble(a[1])));
                    }
                    for(int k=0;k<5;k++){
                        MStock st=minPQ[i].remove();
                        System.out.println(st);
                        String key=st.name;
                        minhash.put(key,minhash.containsKey(key)?minhash.get(key)+1:1);
                    }
                    System.out.println();
                    for(int k=0;k<5;k++) {
                        MStock st=maxPQ[i].remove();
                        System.out.println(st);
                        String key=st.name;
                        maxhash.put(key,maxhash.containsKey(key)?maxhash.get(key)+1:1);
                    }

                }
                System.out.println();
                for(Enumeration<String> enu=maxhash.keys();enu.hasMoreElements();){
                    String key=enu.nextElement();
                    if(minhash.containsKey(key))
                        System.out.println(key);
                }
                myReader.close();
            }
        } 
        catch(Exception e){
            System.out.println(e);
        }
    }
}

