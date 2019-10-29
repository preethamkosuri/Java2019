package Projects.P1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Productfile {
    public static ArrayList<Product> readPrducts(){
         try {
            FileInputStream fis = new FileInputStream("D:\\Java2019\\JavaModules\\product.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Product> pro = (ArrayList<Product>) ois.readObject();
            ois.close();
            fis.close();
            return pro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;

    }

    public static void writeProduts(ArrayList<Product> pro){
        try{ 
            FileOutputStream fos = new FileOutputStream("D:\\Java2019\\JavaModules\\product.txt"); 
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(pro);
            oos.close();
            fos.close();
            System.out.println("Done!!");
         }catch(Exception ioe) {
            System.out.println(ioe);
          }

    }

}