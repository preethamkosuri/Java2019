package Ds.CircularLinkedList;
import java.util.Stack;
class QwithStacks{
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    static void enque(int B){
        s1.push(B);
    }
    static int deque(){
        int x=-1;
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        if(!s2.empty()){
            x=s2.pop();
        }
        while(!s2.empty()){
            s1.push(s2.pop());
        }
        return x;
    }
    public static void main(String[] args) {
        enque(2);
        enque(3);
        System.out.println(deque());
        enque(4);
        System.out.println(deque());
    }
}