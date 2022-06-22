public class JExercise_04_02 {
    public static void main(String[] args) {

    // int num2 = 0;
    // for (int i = 0; i <= 20; i++) {
    //   if (!(i % 2 == 0 || i % 3 == 0))
    //     num2 += i;
    //   // if(i%2!=0 && i%3!=0){
    //   // total += i;
    //   // }
    // }
    // System.out.println(num2);

    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= i; j++) {
        sum += j;
      }
    }
    System.out.println("총합 : " + sum);

    }
}
