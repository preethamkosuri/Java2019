package Projects.P2;

import java.util.*;

public class User {
    String username;
	ArrayList<String>connections;
    int count;

    public User() {
    }

    public User(String username, ArrayList<String> connections, int count) {
        this.username = username;
        this.connections = connections;
        this.count = count;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<String> getConnections() {
        return connections;
    }

    public void setConnections(ArrayList<String> connections) {
        this.connections = connections;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "User [connections=" + connections + ", count=" + count + ", username=" + username + "]";
    }
    
    
}