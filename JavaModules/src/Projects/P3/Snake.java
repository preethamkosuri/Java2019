package Projects.P3;

import java.util.ArrayList;
import java.util.Scanner;

class Snake {
    public int dice() {
        double n=Math.random();
        n=(n*6)+1;
        return (int)n;
    }
    public int ladder(int l){
        int[] ladstart = new int[]{2,4,9,33,52,80}; 
        int[] ladend = new int[]{38,14,31,85,88,99};
        int ll;
        for(int i=0;i<ladstart.length;i++){
            if(l==ladstart[i]){
                ll=ladend[i];
                return ll;
            }
        }
        return -1;
    }
    public int snakes(int s){
        int[] snakestart = new int[]{51,56,62,92,98}; 
        int[] snakeend = new int[]{11,15,57,53,8};
        int ll;
        for(int i=0;i<snakestart.length;i++){
            if(s==snakestart[i]){
                ll=snakeend[i];
                return ll;
            }
        }
        return -1;
    }
    public int[] ref(int n){
        int[] ans=new int[2];
        int m=100,j=0,k=0;
	    int[][] ss=new int[10][10];
	    while(m!=0){
	        k=0;
	        if(m%2==0){
	            for(int i=0;i<10;i++){
	                ss[j][k]=m;
	                k++;
	                m--;
	            }
	            m++;
	        }
	        else{
	            m=m-10;
	            for(int i=0;i<10;i++){
	                ss[j][k]=m;
	                k++;
	                m++;
	            }
	            m=m-11;
	        }
	        j++;
        }
        for(int u=0;u<10;u++){
	        for(int v=0;v<10;v++){
                if(ss[u][v]==n){
                    ans[0]=u;
                    ans[1]=v;
                    
                }
	        }
        }
        return ans;

    }
    public void disp(int[] a){
        int m=100,j=0,k=0;
	    String[][] ss=new String[10][10];
	    while(m!=0){
	        k=0;
	        if(m%2==0){
	            for(int i=0;i<10;i++){
	                String num = String.format("% 4d", m);
	                ss[j][k]=num;
	                k++;
	                m--;
	            }
	            m++;
	        }
	        else{
	            m=m-10;
	            for(int i=0;i<10;i++){
	                String num = String.format("% 4d", m);
	                ss[j][k]=num;
	                k++;
	                m++;
	            }
	            m=m-11;
	        }
	        j++;
        }
        ArrayList<int[]> li = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            li.add(ref(a[i]));
        }
        for(int i=0;i<li.size();i++){
            int[] b=li.get(i);
            if(i==0){
                String nn="\033[31;1m   A\033[0m";
                ss[b[0]][b[1]]=nn;
            }
            else if(i==1){
                String nn="\033[32;1m   B\033[0m";
                ss[b[0]][b[1]]=nn;
            }
            else if(i==2){
                String nn="\033[33;1m   C\033[0m";
                ss[b[0]][b[1]]=nn;
            }
            else{
                String nn="\033[34;1m   D\033[0m";
                ss[b[0]][b[1]]=nn;
            }
            
        }
        for(int u=0;u<10;u++){
	        for(int v=0;v<10;v++){
	            System.out.print(ss[u][v]);
	        }
	        System.out.println();
	    }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Snake sn=new Snake();
        System.out.println("WELCOME TO SNAKE AND LADDER'S");
        System.out.println("enter number of players:");
        int n=sc.nextInt();
        if(n>0 && n<=4){
            String[] names= new String[n];
            for(int i=0;i<n;i++){
                System.out.println("enter "+(i+1)+" players name:");
                String name=sc.next();
                names[i]=name;
            }
            int[] g=new int[n];
            int stop=0;
            int l,s,d=0;
            System.out.println("there can only be one winner!");
            while(stop==0){
                for(int i=0;i<n;i++){
                        System.out.println(names[i]+", please press enter to roll dice:");
                        sc.nextLine();
                        d=sn.dice();
                        g[i]=g[i]+d;
                        System.out.println(names[i]+" you have rolled: "+d);
                        if(d==6){
                            System.out.println("Wow! "+names[i]+" you have rolled a SIX!");
                            System.out.println("press enter again: ");
                            sc.nextLine();
                            d=sn.dice();
                            g[i]=g[i]+d;
                            System.out.println(names[i]+" you have rolled: "+d+" in next chance");
                        }
                        l=sn.ladder(g[i]);
                        if(l>0){
                            System.out.println("Wow! "+names[i]+",you have found a ladder in your way.");
                            g[i]=l;
                        }
                        s=sn.snakes(g[i]);
                        if(s>0){
                            System.out.println("Sorry! "+names[i]+",you were bitten by snake in your way.");
                            g[i]=s;
                        }
                        for(int x=0;x<g.length;x++){
                            System.out.println(names[x]+" position is "+g[x]);
                        }
                        sn.disp(g);
                    if(g[i]>=100){
                        stop=1;

                        System.out.println("Congratulations! "+names[i]+",for winning the game.");
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}