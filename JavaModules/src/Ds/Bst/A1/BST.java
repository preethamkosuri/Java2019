package Ds.Bst.A1;


class Node{
    Node left;
    Book book;
    int value;
    Node right;

    public Node(Book book,int value) {
        this.left = null;
        this.book = book;
        this.value =value;
        this.right = null;
    }
}
class BST<Book ,Integer>{
    private Node root;

    public BST() {
        this.root = null;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void put(Book book,int x){
        root = put(root,book,x);
    }

    public Node put(Node p,Book book,int x){
        if(p==null){
            p=new Node(p.book,x);
        }
        else if(x<p.value){
            p.left=put(p.left, book, x);
        }
        else if(x>p.value){
            p.right=put(p.right, book, x);
        }
        else{
            System.out.println("already exist!");
        }
        return p;
    }
    public int get(Book book){
        Node temp=get(root, book);
        return (temp!=null)?temp.value:0;
    }
    public Node get(Node p,Book book){
        if(p == null){
            return null;
        }
        if(p.book.toString().compareTo(book.toString())==0){
            return p;
        }
        get(p.left,book);
        get(p.right,book);
        return null;
    }

    public Book min(){
        if(isEmpty()){
            throw new NullPointerException("tree is empty!");
        }
        Node p=root;
        while(p.left!=null){
            p=p.left;
        }
        return (Book) p.book;
    }

    public Book max(){
        if(isEmpty()){
            throw new NullPointerException("tree is empty!");
        }
        Node p=root;
        while(p.right!=null){
            p=p.right;
        }
        return (Book) p.book;
    }

    public Book floor(Book book){
        Node temp = floor(root,book);
        return (temp!=null)?(Book) temp.book:null;
    }

    private Node floor(Node root, Book book){
        if (root == null)
            return null;
        int c = ((Ds.Bst.A1.Book) book).compareTo(root.book);
        if (c == 0) 
            return root;
        if (c < 0)  
            return floor(root.left, book);
        Node t = floor(root.right, book);
        if (t != null) 
            return t;
        else           
            return root;
    }
    public void deleteMax(){
        Node p=root,parent=null;
        while(p.right!=null){
            parent=p;
            p=p.right;
        }
        parent.right=null;
    }
    public void deleteMin(){
        Node p=root,parent=null;
        while(p.left!=null){
            parent=p;
            p=p.left;
        }
        parent.left=null;
    }
    

    


    
}
