package Ds.P1;

import java.util.NoSuchElementException;

class Permutation {
    public static void main(String[] args) {
        RandomwithArray<String> q=new RandomwithArray<String>();
		int o=Integer.parseInt(args[0]);
		int i=0;
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
			if(s!= null && s.length()>0){
				q.enqueue(s);
				i++;
			}
        }
        // end read file
		if(i<o){
			throw new NoSuchElementException("incoming element < need to be print out");
		}
		while(o>0){
			StdOut.println(q.dequeue());
			o--;
		}
    }
    
}