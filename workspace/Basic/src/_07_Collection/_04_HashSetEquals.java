package _07_Collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class _04_HashSetEquals {
   public static void main(String[] args) {
      Set set = new HashSet();
      set.add(new Person("Hulk", "male"));
      set.add(new Person("Hulk", "male"));

      set.add(10);
      set.add(10);
      set.add("hello");
      set.add("hello");

      System.out.println(set);
   }
}

class Person {
   String name;
   String gender;

   public Person(String name, String gender) {
      this.name = name;
      this.gender = gender;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj instanceof Person) {
         Person tmp = (Person) obj;
         return tmp.name.equals(name) && tmp.gender.equals(gender);
      }
      return false;
   }
   @Override
   public int hashCode() {
      return Objects.hash(name,gender);
   }
   @Override
   public String toString() {
      return name+"("+gender+")";
   }
}