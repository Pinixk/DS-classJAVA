public class Exercise_03 {
    public static void main(String[] args) {
        // 2번
        int x = 2;
        int y = 5;
        char c = 'A';
  
        System.out.println(y>=5 || x <0 && x>2);      // ture
        System.out.println(y += 10 - x++);            // 13
        System.out.println(x+= 2);                    // 5
        System.out.println(!('A' <= c && c <= 'Z'));  // false
        System.out.println('C'-c);                    // 2
        System.out.println('5'-'0');                  // 5
        System.out.println(c+1);                      // 66
        System.out.println(++c);                      // B
        System.out.println(c++);                      // B
        System.out.println(c);                        // C
        
        // 3번
        int num1 = 456;
        System.out.println(Math.round(num1%100)*100);
    
        // 4번
        int numOfApples = 123;
        int sizeOfBucket = 10;
        // int numOfBucket = (int)Math.ceil((double)numOfApples / sizeOfBucket);
        int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket == 0 ? 0 : 1);

        System.out.println("필요한 바구니의 수 :"+numOfBucket);

        // 5번
        int num2 = 10;
        System.out.println(num2==0 ? 0 : (num2>0 ? "양수" : "음수"));

        // 6번
        int fahrenheit = 100;
        // float celcius = (float)5/9*(fahrenheit-32);
        float celcius = (int)(5/9*(fahrenheit-32)*100+0.5)/100f;

        System.out.println("Fahernheit:"+fahrenheit);
        System.out.println("celcius:"+celcius);
        // System.out.printf("celcius:%.2f",celcius);
    }
}
