package _13_IO;

import java.io.*;
import java.util.ArrayList;

public class SerializableEx {
  public static void main(String[] args) {
    
    User u1 = new User("KBJ", 1);
    User u2 = new User("AAA", 0);

    ArrayList<User> list = new ArrayList<>();
    list.add(u1);
    list.add(u2);

    String exportFile = "UserInfo.ser";
    // Serializable Object Encoding
    try { 
      FileOutputStream fos = new FileOutputStream(exportFile);
      BufferedOutputStream bos = new BufferedOutputStream(fos);
      ObjectOutputStream out = new ObjectOutputStream(bos);

      out.writeObject(u1);
      out.writeObject(u2);
      out.writeObject(list);
      out.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

    // Serializable Object Decoding
    try {
      FileInputStream fis = new FileInputStream(exportFile);
      BufferedInputStream bis = new BufferedInputStream(fis);
      ObjectInputStream in = new ObjectInputStream(bis);

      
      User get1 = (User) in.readObject();
      User get2 = (User) in.readObject();
      ArrayList result = (ArrayList) in.readObject();

      System.out.println(get1);
      System.out.println(get2);
      System.out.println(result);

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}

class User implements Serializable{

  String name;
  int gender;

  public User(){ this("Unknown",0);}
  public User(String name, int gender){
    this.name = name;
    this.gender = gender;
  }

  public String toString(){return name+"/"+gender;}

}