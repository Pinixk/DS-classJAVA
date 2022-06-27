package _05_JavaLang;

public class _03_StringBuffer {
  public static void main(String[] args) {

    String str = "Hello";
    System.out.println(str.hashCode());               // 69609650
    System.out.println(System.identityHashCode(str)); // 758529971

    str = str+" World";
    System.out.println(str.hashCode());               // -862545276
    System.out.println(System.identityHashCode(str)); // 2104457164

    System.out.println("===========");

    StringBuffer sb = new StringBuffer("Hello");
    // Buffer = 임시 저장공간
    // 변형이 자주 일어나는 문자열에 사용
    
    System.out.println(sb.capacity());                // 21
    System.out.println(sb.hashCode());                // 1940030785
    System.out.println(System.identityHashCode(sb));  // 1940030785

    sb.append(" World~! I am your world~!");
    System.out.println(sb.capacity());                // 44
    System.out.println(sb.hashCode());                // 1940030785
    System.out.println(System.identityHashCode(sb));  // 1940030785

    System.out.println(sb.toString());          // Hello World~! I am your world~!

    // 내용물이 바로 바뀜
    System.out.println(sb.delete(0, 5));        //  World~! I am your world~!
    System.out.println(sb.delete(0, 1));        // World~! I am your world~!
    System.out.println(sb.deleteCharAt(5));     // World! I am your world~!

    System.out.println(sb.insert(0,"Hello "));  // Hello World! I am your world~!
    // System.out.println(sb.reverse());           // !~dlrow ruoy ma I !dlroW olleH

    sb.setLength(12);
    System.out.println(sb);     // Hello World!

  }
}
