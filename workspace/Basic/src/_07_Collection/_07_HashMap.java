package _07_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _07_HashMap {
   static HashMap<Object,Object> phoneBooks = new HashMap<>();

   public static void main(String[] args) {
      addPhoneNo("친구", "김길동", "010-1111-1111");
      addPhoneNo("친구", "이길동", "010-1111-1112");
      addPhoneNo("회사", "박길동", "010-1111-1113");
      addPhoneNo("회사", "최길동", "010-1111-1114");
      addPhoneNo("회사", "홍길동", "010-1111-1115");
      addPhoneNo("세탁","051-121-1111");

      printList();
   }

   private static void printList(){

      Iterator it = phoneBooks.entrySet().iterator();
      while(it.hasNext()){
         Map.Entry e = (Map.Entry) it.next();
         Set subSet = ((HashMap)e.getValue()).entrySet();
         Iterator subIt = subSet.iterator();
         System.out.println(" * "+e.getKey()+"["+subSet.size()+"]");
         while(subIt.hasNext()){
            Map.Entry subE = (Map.Entry) subIt.next();
            String telNo = (String) subE.getKey();
            String name = (String) subE.getValue();
            System.out.println(name+" "+telNo);
         }
         System.out.println();

      }
   }

   static void addPhoneNo(String groupName, String name, String tel) {
      addGroup(groupName);
      HashMap<Object,Object> group = (HashMap) phoneBooks.get(groupName);
      group.put(tel, name);
   }

   static void addGroup(String groupName) {
      if (!phoneBooks.containsKey(groupName))
         phoneBooks.put(groupName, new HashMap<>());
   }

   static void addPhoneNo(String name, String tel){
      addPhoneNo("기타", name, tel);
   }
}

class Member {
   String id;
   String pw;
   String name;

   public Member(String id, String pw, String name) {
      this.id = id;
      this.pw = pw;
      this.name = name;
   }
}