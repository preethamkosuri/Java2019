package M9.ListADTVersion2;

abstract class AbstractList implements ListInterface {
    int array[],size;

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
    
   
    public int count(int item){
        int temp=0;
        for(int i=0;i<size;i++){
            if(array[i]==item){
                temp++;
            }
        }
        return temp;

    }

}