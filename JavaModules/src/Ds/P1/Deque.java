package Ds.P1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<E> implements Iterable<E> {
    static class Node<E>{
        E item;
        Node<E> link;
    
        public Node(E item) {
            this.item = item;
        }
    
    }
    Node<E> start,last;
    int size;
    // construct an empty deque
    public Deque(){
        start=null;
        last=null;
        size=0;
    }

    // is the deque empty?
    public boolean isEmpty(){
        return start==null;

    }

    // return the number of items on the deque
    public int size(){
        return size;

    }

    // add the item to the front
    public void addFirst(E item) throws IllegalArgumentException{
        if(item == null)
                throw new IllegalArgumentException("item is null");
        Node<E> temp=new Node<E>(item);
        if(start==null){
            start = temp;
            last = temp;
        } else {
            temp.link=start;
            start = temp;
        }
        size++;
    }

    // add the item to the back
    public void addLast(E item) throws IllegalArgumentException{
        if(item==null)
                throw new IllegalArgumentException("item is null");
        Node<E> temp=new Node<E>(item);
        if(start==null){
            start = temp;
            last = temp;
        } else {
            last.link=temp;
            last = temp;
        }
        size++;
    }

    // remove and return the item from the front
    public E removeFirst() throws NoSuchElementException{
        if(isEmpty())
                throw new NoSuchElementException("No element to remove");
        else{
            E n=start.item;
            start=start.link;
            size--;
            return n;
        }
    }

    // remove and return the item from the back
    public E removeLast() throws NoSuchElementException{
        if(isEmpty())
                throw new NoSuchElementException("No element to remove");
        else{
            Node<E> temp=start;
            while(temp.link!=last){
                temp=temp.link;
            }
            E n=last.item;
            last=temp;
            size--;
            return n;
        }
    }

    // return an iterator over items in order from front to back
    @Override
    public Iterator<E> iterator(){
        class D implements Iterator<E>{
            Node<E> temp = start;
            @Override
            public boolean hasNext(){
                return temp != null;
            }
            @Override
            public E next(){
                if(!hasNext())
                    throw new NoSuchElementException("no elements");
                E e = temp.item;
                temp = temp.link;
                return e;
            }
            @Override
            public void remove() throws UnsupportedOperationException{
                throw new UnsupportedOperationException();
            }
        }
        return new D();
    }
    
    // unit testing (required)
    public static void main(String[] args){
        try {
            Deque<Integer> d=new Deque<>();
            System.out.println(d.isEmpty());
            d.addFirst(0);
            d.addLast(5);
            d.addLast(10);
            //d.removeFirst();
            //d.removeLast();
            System.out.println(d.size());
            Iterator<Integer> itr=d.iterator();
            while(itr.hasNext())
                System.out.println(itr.next());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}