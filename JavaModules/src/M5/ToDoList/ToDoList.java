package M5.ToDoList;
public class ToDoList{
    String Date;
    String Taskname;
    String Taskdes;
    String Status;
    String LastDate;
    public ToDoList(String date, String taskname, String taskdes, String status, String lastDate) {
        Date = date;
        Taskname = taskname;
        Taskdes = taskdes;
        Status = status;
        LastDate = lastDate;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTaskname() {
        return Taskname;
    }

    public void setTaskname(String taskname) {
        Taskname = taskname;
    }

    public String getTaskdes() {
        return Taskdes;
    }

    public void setTaskdes(String taskdes) {
        Taskdes = taskdes;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
    public String getLastDate() {
        return LastDate;
    }

    public void setLastDate(String lastDate) {
        LastDate = lastDate;
    }
    
    @Override
    public String toString() {
        return "ToDoList [Date=" + Date + ", Taskname=" + Taskname + ", Taskdes=" + Taskdes + ", Status=" + Status + ", LastDate=" + LastDate + "]";
    }  
}