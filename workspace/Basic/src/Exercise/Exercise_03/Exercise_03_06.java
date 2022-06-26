package Exercise.Exercise_03;

public class Exercise_03_06 {
    public static void main(String[] args) {
        
        // 6번
        int fahrenheit = 100;
        // float celcius = (float)5/9*(fahrenheit-32);
        float celcius = (int)(5/9*(fahrenheit-32)*100+0.5)/100f;

        System.out.println("Fahernheit:"+fahrenheit);
        System.out.println("celcius:"+celcius);
        // System.out.printf("celcius:%.2f",celcius);
    }
}
