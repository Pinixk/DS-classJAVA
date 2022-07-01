package _13_IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class _05_SeializableEx {
	public static void main(String[] args) {
		try {
			String fileName = "UserInfo.ser";
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream out = new ObjectOutputStream(bos);

			User u1 = new User("lgh", 10);
			User u2 = new User("kia", 10);

			ArrayList<User> list = new ArrayList<>();
			list.add(u1);
			list.add(u2);

			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list);
			out.close();

			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream in = new ObjectInputStream(bis);

			User u11 = (User) in.readObject();
			User u12 = (User) in.readObject();
			ArrayList list2 = (ArrayList) in.readObject();
			System.out.println(u11);
			System.out.println(u12);
			System.out.println(list2);
		} catch (Exception e) {

		}
	}
}

class User implements Serializable {
	String name;
	int age;

	public User() {
		this("Unknown", 0);
	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + "/" + age;
	}
}