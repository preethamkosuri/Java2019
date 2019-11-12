package Ds.Linkedlist.P1;
class Node{
    private int info;
    private Node link;

    public Node(int info) {
        this.info = info;
        link = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Node getLink() {
        return link;
    }

	public void setNext(Node next) {
        next.link = link;
        this.link = next;
    }
    
    public void setLink(Node link){
        this.link = link;
    }

    
    
}