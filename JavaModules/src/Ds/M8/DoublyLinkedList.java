package Ds.M8;
import java.util.Scanner;
public class DoublyLinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;
        public Node(E e, Node<E> p, Node<E> n) {
            this.element=e;
            this.prev=p;
            this.next=n;

        }
        public E getElement() {
            return element;

        }
        public Node<E> getPrev() {
            return prev;
        }
        public Node<E> getNext() {
            return next;
        }
        public void setPrev(Node<E> p) {
            this.prev = p;
        }
        public void setNext(Node<E> n) {
            this.next = n;
        }
    }
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;
    public DoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size==0;
    }
    public E first() {
        return (size>0)?header.next.element:null;
    }
    public E last() {
        return (size>0)?trailer.prev.element:null;
    }
    public E indexOf(int pos) {
        Node<E> temp=getPosNode(pos);
        return (temp!=null)?temp.element:null;
    }
    public void addFirst(E e) {
        add(e, header, header.next);
    }
    public void addLast(E e) {
        add(e, trailer.prev, trailer);
    }
    Node<E> getPosNode(int pos){
        if(pos<=size){
            Node<E> temp=header.next;
            for(int i=1;i<=pos;i++){
                temp=temp.next;
            }
            return temp;
        }
        return null;
    }
    public void addAtPosition(E e, int pos) {
        if (pos == size+1)
            addLast(e);
        else{
            Node<E> temp=getPosNode(pos);
            add(e, temp.prev, temp);
        }
        
    }
    public E removeFirst() {
        return (size>0)?remove(header.next):null;
    }
    public E removeLast() {
        return (size>0)?remove(trailer.prev):null;
    }
    public E removeAtPosition(int pos) {
        return (pos<=size)?remove(getPosNode(pos)):null;
    }
    private void add(E e, Node<E> predecessor, Node<E> successor) {  
        Node<E> nn= new Node<E>(e,predecessor,successor);
        predecessor.next=nn;
        successor.prev=nn;
        size++;
    }
    private E remove(Node<E> node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
        node.prev = null;
        node.next = null;
        size--;
        return node.element;
        
    }
    public String toString(){
        String s="";
        Node<E> temp=header.next;
        for(int i=1;i<=size;i++){
            s+=temp.element+" ";
            temp=temp.next;
        }
        return s;
    }
    public void moveToFront(int pos){
        Node<E> nn = getPosNode(pos);
        remove(nn);
        nn.next = header.next;
        nn.prev = header;
        header.next = nn;
        nn.next.prev = nn;
        size++;

    }
    public void moveToBack(int pos){
        Node<E> nn = getPosNode(pos);
        remove(nn);
        nn.next = trailer;
        nn.prev = trailer.prev;
        trailer.prev = nn;
        nn.prev.next = nn;
        size++;
    }
    public void rotateRight(int n){
        for(int i=0;i<n;i++){
            moveToBack(1);
        }
    }
    public static void main(String arg[]){

        DoublyLinkedList<Integer> o =new DoublyLinkedList<Integer>();
        int c,x;
        
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1:display; \n2:addFirst; \n3:addLast; \n4:add pos; \n5:display fist; \n6:display last; \n7:size; \n8:isempty; \n9:remove first; \n10:remove last; \n11:remove at pos; \n12:move to back \n13:move to front");
            System.out.println("enter choice");
            c=sc.nextInt();
            switch(c){
                case(1):
                    System.out.println(o.toString());
                    break;
                case(2):
                    System.out.println("enter the element:");
                    x=sc.nextInt();
                    o.addFirst(x);
                    break;
                case(3):
                    System.out.println("enter the element:");
                    x=sc.nextInt();
                    o.addLast(x);
                    break;
                case(4):
                    System.out.println(o.toString());
                    o.toString();
                    System.out.println("enter the element:");
                    x=sc.nextInt();
                    System.out.println("enter the position:");
                    int pos=sc.nextInt();
                    o.addAtPosition(x, pos);
                    break;
                case(5):
                    System.out.println(o.first());
                    break;
                case(6):
                    System.out.println(o.last());
                    break;
                case(7):
                    System.out.println(o.size());
                    break;
                case(8):
                    System.out.println(o.isEmpty());
                    break;
                case(9):
                    o.removeFirst();
                    break;
                case(10):
                    o.removeLast();
                    break;
                case(11):
                    System.out.println(o.toString());
                    System.out.println("enter the positon:");
                    x=sc.nextInt();
                    o.removeAtPosition(x);
                    break;
                case(12):
                    System.out.println(o.toString());
                    System.out.println("enter the positon:");
                    o.moveToBack(sc.nextInt());
                    break;
                case(13):
                    System.out.println(o.toString());
                    System.out.println("enter the positon:");
                    o.moveToFront(sc.nextInt());
                    break;
                case(14):
                    break;
            }
        }while(c<14);
        sc.close();
    }
}