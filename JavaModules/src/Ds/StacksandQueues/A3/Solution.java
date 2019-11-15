package Ds.StacksandQueues.A3;
public class Solution{
	char stack[];
    int size;

    Solution(){
        stack=new char[1];
        size=0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==stack.length;
    }

    public void resize(int capacity){
       char copy[]=new char[capacity];
        for (int i=0;i<size;i++){
            copy[i]=stack[i];
        }
        stack=copy;
    }

    public void push(char data){
        if(isFull()){
            resize(2 * size);
        }
        stack[size++] = data;
    }

    public char pop(){
        if(size==(stack.length/4)){
            resize(stack.length/2);
        }
        if(!isEmpty()){
            char temp=stack[--size];
            stack[size]=' ';
            return temp;
        }
        return ' ';
    }
	char peek(){
		if(!isEmpty())
			return stack[size - 1];
		return ' ';
	}
    public void display(){
        for(int i=size-1;i>-1;i--){
            System.out.println(stack[i]);
        }
    }
	public static String isMatching(String str){
		// fill you code Here
		int l=str.length();
		Solution obj = new Solution();
		for(int i=0;i<l;i++){
			char temp = str.charAt(i);
			if(temp=='{' || temp=='[' || temp=='('){
				obj.push(temp);
			}
			else{
				char top=obj.peek();
				if((top=='{' && temp=='}') || (top=='(' && temp==')') ||(top=='[' && temp==']'))
					obj.pop();
				else
					return "NO";
			}
		}
		if(obj.isEmpty()){
			return "YES";
		}
		else{
			return "NO";
		}
	}
}