package M9.ListADTVersion2;

abstract class AbstractList implements ListInterface {
    private int[] array;
    private int size;

    public AbstractList() {
        array = new int[100];
        size = 0;
    }
 
    @Override
    public void add(int item) {
        array[size] = item;
        size++;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int get(int index) {
        if (index >-1 && index < size) {
            return array[index];
        }
        return -1;
    }

    @Override
    public int indexOf(int item) {
        for (int i = 0; i < size; i++) {
            if (array[i] == item) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(int item) {
        for (int i = 0; i < size; i++) {
            if (array[i] == item) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void remove(int index) {
        if (index < size) {
            for (int f = index; f < size - 1; f++) {
                array[f] = array[f + 1];
            }
            size--;

        }
    }

   
    // abstract public int search(int item);

    @Override
    public String toString() {
        if(size == 0)
            return "";
        String str = "[";
        int i = 0;
        for(i = 0; i < size-1; i++) {
            str = str + array[i] + ",";
        }
        str = str  + array[i]+"]";
        return str;
    }
    
    public void addAll(int[] all){
        for (int i = 0; i < all.length; i++) {
            add(all[i]);
         }
    }
    public void addInsert(int item,int index){
        size++;
        for (int f = size; f >=index; f--) {
            array[f] = array[f-1];
        }
        array[index]=item;

    }
    public int lastIndexOf(int item){
        int temp=-1;
        for(int i=0;i<size;i++){
            if(array[i]==item){
                temp=i;
            }
        }
        return temp;

    }
    public int count(int item){
        int temp=0;
        for(int i=0;i<size;i++){
            if(array[i]==item){
                temp++;
            }
        }
        return temp;

    }
    public void set(int index, int item){
        if(size>index){
            array[index]=item;
        }

    }
    public List subList(int fromIndex, int toIndex) {
        int f=toIndex-fromIndex;
        /*n=new int[f];
        for(int i=fromIndex;i<=toIndex;i++){
            n[0]=array[i];
        }*/
        return null;
    }

}