package M5.ToDoList;

class MyList{
    ToDoList[] list= new ToDoList[500];
    int n=0;
    public  void addTask(ToDoList b) {
        list[n]=b;
        n++;
    }
    public ToDoList searchTask(String name) {
        for(int i=0; i < n; i++){
            if(list[i].Taskname.equals(name)){
                return list[i];
            }
        }
        return null;
    }
    public boolean deleteTask(String name) {
        ToDoList c= searchTask(name);
        if(c!=null){
            c.setTaskname(null);
            c.setLastDate(null);
            c.setStatus(null);
            return true;
            }
        return false;
    }
    public ToDoList updateStatus(String name,String status) {
        ToDoList c= searchTask(name);
        if(c!=null){
            c.setStatus(status);
        }
        return c;
    }
    public ToDoList displayPending() {
        for(int i=0; i < n; i++){
            if(list[i].Status.equals("incomplete")){
                System.out.println(list[i]);
            }
        }
        return null;
    }
    public ToDoList displayLastDate(String lastdate) {
        for(int i=0; i < n; i++){
            if(list[i].LastDate.equals(lastdate)){
                System.out.println(list[i]);
            }
        }
        return null;
    }
    public ToDoList displayAll() {
        for(int i=0; i < n; i++){
            System.out.println(list[i]);
        }
        return null;
    }
    public ToDoList displayOverDue(int d) {
        for(int i=0;i<n;i++){
            String k=list[i].LastDate;
            int m = Integer.parseInt(k.substring(0,2));
            if(m==d){
                System.out.println(list[i]);
            }
        }
        return null;
    }
}