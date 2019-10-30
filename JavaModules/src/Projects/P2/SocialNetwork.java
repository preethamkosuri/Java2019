package Projects.P2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * This class implements all the methods of the SocialNetrorkInterface 
 * You are free to add your own behaviours to this class.
 * 
 * @author Siva Sankar
 */

import java.util.Scanner;

public class SocialNetwork {

    /**
     * users indicates the actual users in the network
     */
    User[] users;

    /**
     * The size indicates the numebr of users in the network
     */
    int size;

    /**
     * Initializes the default values of the social network.
     */
    public SocialNetwork() {
        // TODO
        // Your code goes here
        users=new User[100];
    	size=0;
    }

    /**
     * This method takes the string as a parameter which is used
     * to create a network. do nothing if the string is empty.
     * 
     * @param str to be used to create a network.
     */
    public void createDataStructure() {
        // TODO
        // Your code goes here
        Scanner scan=null;
		try {
			scan = new Scanner(new File("C:\\textfiles\\Network.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        while(scan.hasNext()) {
	        	String st=scan.nextLine();
	        	st = st.replaceAll(" is connected to ", ",");
	        	String[] s= st.split(",");
	        	ArrayList<String> al = new ArrayList<String>();
	        	String uName = s[0];
	        	for(int i=1; i<s.length;i++)
	        		al.add(s[i]);
	        	System.out.println(al);
                users[size++]= new User(uName,al,al.size());
            }
        
    }

    private int searchUser(User user) {
        for (int i = 0; i < size; i++) {
            if (user.equals(users[i])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Please don't modify the follwoing code.
     * This method returns the User based on the userName.
     * 
     * @param userName the string to be used to search for the user.
     * @return the User object based on the userName. 
     * Returns null otherwise
     */
    public User getUser(String userName) {
        for (int i = 0; i < size; i++) {
            if (userName.equals(users[i].getUsername())) {
                return users[i];
            }
        }
        return null;
    }

    /**
     * This method adds a new User (object) that is passed as 
     * argument to the social network if the user is not currently 
     * on the social network.
     * @param userA to be added to the social network.
     */
    public void addUser(User userA) {
        // TODO
        // Your code goes here
        if(searchUser(userA)==-1) {
            users[size]=userA;
            size++;
        }
    }

    /**
     * This method takes two users (objects) as arguments and 
     * connects them on the network. userA and userB are 
     * the users that are passed as parameters to this function, 
     * then add userB to userA’s connections
     * 
     * Note: Both userA and userB should be there on the network.
     * if anyone of them are not on the network, then do nothing.
     * 
     * @param userA the userB is to be added to userA connections
     * @param userB to be added to userA connections
     */
    public void addConnection(User userA, User userB) {
        // TODO
        // Your code goes here
        int idx = searchUser(userA);
	    if(idx>-1) {
	    	users[idx].connections.add(userB.username);
	    }
    }

    /**
     * This method takes a user object as an argument that returns the 
     * connections of this user. Return null if the user is not in 
     * the network.
     * 
     * @param userA the user object used to return the 
     * connections of this user.
     * 
     * @return the list of connections of userA. otherwise return null
     */
    public ArrayList<String> getConnections(User userA) {
        // TODO
        // Your code goes here
        int idx = searchUser(userA);
	    if(idx>-1) {
	    	return users[idx].connections;
	    }
	    	
	    	
	        return null;
    }

    /**
     * This method returns the common connections of userA and userB.
     * Note: both userA and userB should be on the network. if anyone 
     * of them is not in the network, then return null
     * 
     * @param userA the first user
     * @param userB the second user
     * 
     * @return the common connections of both userA and userB if they 
     * both are in the network, otherwise return null
     */
    public void getCommonConnections(User userA, User userB) {
        // TODO
        // Your code goes here
        int idx = searchUser(userA);
	    int idx2= searchUser(userB);
	    if(idx>-1&&idx2>-1) {
	    	ArrayList<String> us=users[idx].connections;
	    	ArrayList<String> us1=users[idx2].connections;
	    	us.retainAll(us1);
	    	System.out.println("------------------------");
	    	System.out.println(userA.connections);
	    	System.out.println(userB.connections);
	    	System.out.println("------------------------");
	    	System.out.println("Common users");
	    	System.out.println(us);
	    	System.out.println("=========================");
	    		
	    }
    }

    /**
     * This reutrns the String version of the social network.
     * 
     * @return the String version of the network, return an empty string
     * if there are no users in the network.
     */
    public String toString() {
        if (this.size == 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        int i = 0;
        for (i = 0; i < size-1; i++) {
            sb.append(users[i] + "\n");
        }
        sb.append(users[i]);
        return sb.toString();
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		SocialNetwork sn=new SocialNetwork();
		sn.createDataStructure();
		sn.getCommonConnections(sn.users[0], sn.users[3]);
		
	}
	
}