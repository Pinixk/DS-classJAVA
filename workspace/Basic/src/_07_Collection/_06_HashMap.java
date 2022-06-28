package _07_Collection;

import java.util.*;

public class _06_HashMap {
   public static void main(String[] args) {

      Map map = new HashMap();
      map.put("admin","1234");

      map.put("user","1111"); 
      map.put("user","1234"); // 가장 마지막 값으로 덮어쓰기
      System.out.println(map);
      System.out.println();

      // key, value 모두 호출
      Iterator it = map.entrySet().iterator();
      while(it.hasNext()){
         Map.Entry entry = (Map.Entry) it.next();
         System.out.println(entry.getKey()+" : "+ entry.getValue());
      }
      System.out.println();

      // key만 호출
      it = map.keySet().iterator();
      while(it.hasNext()){
         String id  = (String) it.next();
         System.out.println(id+" : "+ map.get(id));
      }
      System.out.println();

      // value만 호출
      it = map.values().iterator();
      while(it.hasNext()){
         String value = (String) it.next();
         System.out.println(value);
      }

   }
}
