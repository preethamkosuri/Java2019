package Ds.SymbolTables.A1;

import java.util.Iterator;

public class BinarySearchST<Key extends Comparable<Key>, Value>  implements Iterable{
    Key keys[];
    Value values[];
    int size;

    BinarySearchST(){
        keys=(Key[]) new Comparable[50];
        values=(Value[]) new Comparable[50];
        size=0;
    }
    private class ArrayIterator implements Iterator<Key>{
        int i=0;
        public boolean hasNext(){
            return i<size;
        }
        public Key next(){
            return keys[i++];
        }
    }
    @Override
    public Iterator<Key> iterator(){
        return new ArrayIterator();
    }

    
    void put(Key key,Value value){
        if(contains(key)){
            int index=rank(key);
            values[index]=value;
        }
        else{
            int index=rank(key);
            for(int start=size;start>index;start--){
                keys[start]=keys[start-1];
            }
            for(int start=size;start>index;start--){
                values[start]=values[start-1];
            }
            keys[index]=key;
            values[index]=value;
            size++;
        }
    }

    Value get(Key key){
        int index=rank(key);
        if(size!=0){
            if(index<size && key.compareTo(keys[index])==0)
                return values[index];
        }
        return null;
    }

    boolean contains(Key key){
        return get(key)!=null;
    }

    Key max(){
        if(size==0)
            return null;
        return keys[size-1];
    }

    Key floor(Key key){
        int index=rank(key);
        if(size==0)
            return null;
        return (keys[index].compareTo(key)==0)?keys[index]:keys[index - 1];
    }

    int rank(Key key){
            int low=0, high=size-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                int c=key.compareTo(keys[mid]);
                if (c<0){
                    high=mid-1;
                } else if(c>0){
                    low=mid+1;
                } else return mid;
            }
            return low;
    }

    void deleteMin(){
        if(size!=0) {
            for(int start=0;start<size-1;start++)
                keys[start]=keys[start+1];
            for(int start=0;start<size-1;start++)
                values[start]=values[start+1];
            size--;
        }
    }

    Iterable<Key> keys(){
        return this;
    }

    public String toString(){
        String s="";
        for(Key k:this.keys())
            s+=k+" ";
        return s;
    }
}

