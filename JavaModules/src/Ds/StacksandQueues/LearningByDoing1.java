package Ds.StacksandQueues;

public class LearningByDoing1{
    String stack[];
    int size;

    LearningByDoing1(){
        stack = new String[1];
        size = 0;
    }

    boolean isEmpty(){
        return size == 0;
    }

    boolean isFull(){
        return size==stack.length;
    }

    void resize(int capacity){
        String copy[] = new String[capacity];
        for (int i=0;i<size;i++){
            copy[i]=stack[i];
        }
        stack=copy;
    }

    void push(String data){
        if(isFull()){
            resize(2 * size);
        }
        stack[size++] = data;
    }

    public String pop(){
        if(size==(stack.length/4)){
            resize(stack.length/2);
        }
        if(!isEmpty()){
            String temp=stack[--size];
            stack[size]=null;
            return temp;
        }
        return "";
    }

    public void display(){
        for(int i=size-1;i>-1;i--){
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args){
        LearningByDoing1 obj = new LearningByDoing1();
        String[] words = "it was - the best - of times - - - it was - the - -".split(" ");
        for(String word:words){
            if (word.equals("-")){
                System.out.println(obj.pop());
            }
            else{
                obj.push(word);
            }
        }
        System.out.println("Elements still in the stack:");
        obj.display();
    }
}
