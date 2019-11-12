package Ds.Linkedlist.P1;
class Main{
    public static void main(String[] args) {
        Operations o=new Operations();
        o.create();
        o.display();
        o.insertEnd(55);
        o.display();
        o.inserAfter(56,4);
        o.display();
        o.inserBefore(50, 4);
        o.removeElement(5);
        o.display();
        o.removeIndex(3);
        o.display();
        o.reverse();
        o.display();
        int i=o.popBack();
        System.out.println(i);
        o.display();
        //o.delete();
        //o.display();
    }
}