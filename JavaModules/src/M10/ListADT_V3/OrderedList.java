package M10.ListADT_V3;

public class OrderedList extends AbstractList {
    /*
     * The add method does what the name suggests.
     * Add an int item to the list.
     * The assumption is to store the item at the end of the list
     * What is the end of the list?
     * Is it the same as the end of the array?
     * Think about how you can use the size variable to add item
     * to the list.
     *
     * The method returns void (nothing)
     */
    public void add(int item){
        if(size!=list.length){
            sort();
            int index=0;
            for(;index<size;index++){
                if(list[index]>item){
                    break;
                }
            }
            if(index==size){
                list[index]=item;
                size++;
                return;
            }
            else{
                int temp=list[index];
                list[index]=item;
                index++;
                size++;
                while(index<size) {
                    int value=list[index];
                    list[index]=temp;
                    temp=value;
                    index++;
                }
            }
        }
    }

    private void sort(){
        for(int index=0;index<size;index++){
            for(int next_index=index+1;next_index<size; next_index++){
                if(list[index]>=list[next_index]){
                    int temp=list[index];
                    list[index]=list[next_index];
                    list[next_index]=temp;
                }
            }
        }
    }

    public int rank(int item){
        int lo=0,hi=size-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(item<list[hi]){
                hi=mid-1;
            }
            else if(item>list[lo]){
                lo=mid+1;
            }
            else{
                return mid;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        AbstractList lst = new OrderedList();
        lst.add(20);
        lst.add(1);
        lst.add(30);
        lst.add(2, 1);
        lst.add(3, 3);
        System.out.println(lst);

    }

}