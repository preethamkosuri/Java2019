package Ds.P1;

import java.util.Iterator;
import java.util.NoSuchElementException;

class RandomwithArray<E> implements Iterable<E> {
    E[] earray=(E[]) new Object[2];
    int size=0;

    public RandomwithArray(){

    } 

    // construct an empty randomized queue
    public boolean isEmpty(){
        return size==0;
    } 

    // is the queue empty?
    public int size(){
        return size;
    } 

    // return the number of items on the queue
    public void enqueue(E item){
        if(item==null){
            throw new NullPointerException("Can't enqueue null item");
        }
        this.earray[size++]=item;
        if(size==this.earray.length){
            resize(2*this.earray.length);
        }
        swapItem();
    } 

    // add the item
    public E dequeue(){
        if(size==0){
            throw new NoSuchElementException("Can't dequeue, queue is empty");
        }
        E item=this.earray[--size];
        if(size>0 && size==this.earray.length/4) {
            resize(this.earray.length/2);
        }
        this.earray[size]=null;
        return item;
    } 

    // remove and return a random item
    public E sample(){
        if(size==0){
            throw new NoSuchElementException("Can't dequeue, queue is empty");
        }
        int i=StdRandom.uniform(size);
        return this.earray[i];
    } 

    // return (but do not remove) a random item
    public Iterator<E> iterator(){
        return new ListIterator();
    }

    private class ListIterator implements Iterator<E> {
        private int i;

        public boolean hasNext() {
            return earray[i] != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public E next(){
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            E item=earray[i++];
            return item;
        }
    }

    private void resize(int capacity){
        E[] copy=(E[]) new Object[capacity];
        for (int i=0;i<size;i++)
            copy[i]=earray[i];
        earray=copy;
    }

    private void swapItem(){
        int i=StdRandom.uniform(size);
        E temp=earray[i];
        earray[i]=earray[size-1];
        earray[size-1]=temp;
    }

    public static void main(String[] args) {
        RandomwithArray<String> r = new RandomwithArray<>();
        System.out.println(r.isEmpty());
        r.enqueue("hi");
        r.enqueue("hello");
        r.enqueue("bye");
        System.out.println(r.dequeue());
        System.out.println(r.size);
    } // unit testing (optional)
}