package Exercise;

public class Exercise_06_05 {
    static double getDistance(int x, int y, int x1, int y1){
        double result = 0.0;
        result = Math.sqrt(Math.pow(x1-x,2)+Math.pow(y1-y,2));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
