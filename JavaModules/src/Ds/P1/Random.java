package Ds.P1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Random<E> implements Iterable<E> {
    static class Node<E>{
        E item;
        Node<E> link;
    
        public Node(E item) {
            this.item = item;
        }
    
    }
    Node<E> start,last;
    int size;
    // construct an empty randomized queue
    public Random(){
        start=null;
        last=null;
        size=0;
    }

    // is the randomized queue empty?
    public boolean isEmpty(){
        return size==0;

    }

    // return the number of items on the randomized queue
    public int size(){
        return size;

    }

    // add the item
    public void enqueue(E item) throws IllegalArgumentException{
        if(item == null)
            throw new IllegalArgumentException("item is null");
        Node<E> temp=new Node<E>(item);
        if(start==null){
            start = temp;
            last = temp;
        } else {
            last.link=temp;
            last=temp;
        }
        size++;
    }

    // remove and return a random item
    public E dequeue() throws NoSuchElementException{
        if(isEmpty())
            throw new NoSuchElementException("There are no elements to remove.");
        return null;

    }

    // return a random item (but do not remove it)
    public E sample(){
        return null;

    }

    // return an independent iterator over items in random order
    public Iterator<E> iterator(){
        return null;

    }

    // unit testing (required)
    public static void main(String[] args){
        
    }

}