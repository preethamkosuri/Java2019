package Ds.StacksandQueues.A4;
public class Solution{
	Node start,last;
        class Node{
            int data;
            Node link;
        }
        public void insert(int data){
            Node temp=new Node();
            temp.data=data;
            if(start==null){
               start=temp;
               last=temp;
            }
            else{
                last.link=temp;
                last=temp;
            }
           last.link=start;
        }
        public int length(){
            int count = 0;
            if(start!=null){
                Node temp=start;
                count=1;
                while(temp.link!=start){
                    temp = temp.link;
                    count++;
                }
            }
            return count;
        }
	public static String Josephus(int a, int b){
        Solution list=new Solution();
        String s="";
        for(int i=0;i<a;i++){
            list.insert(i);
        }
        Node current=list.start;
        while(list.length()>1){
            
            int position=b;
            while(position>1){
                current=current.link;
                position--;
            }
            if(current==list.start){
                Node temp=list.start;
                s+=current.data+" ";
                list.start=list.start.link;
                temp.link=null;
                current=list.start;
                list.last.link=list.start;
            }
            else{
                Node temp=list.start;
                while(temp.link!=current)
                    temp=temp.link;
                if(current==list.last){
                    s+=current.data+" ";
                    temp.link=list.start;
                    list.last=temp;
                    current=list.start;
                }
                else{
                    s+=current.data+" ";
                    temp.link=current.link;
                    current.link=null;
                    current=temp.link;
                }
            }
        }
        s+=current.data;
        return s;
    }
}