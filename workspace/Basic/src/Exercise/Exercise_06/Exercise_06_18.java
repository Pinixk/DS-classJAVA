package Exercise.Exercise_06;

public class Exercise_06_18 {
    static boolean isNumber(String str){
        if(str==null || str.equals("")) return false;
        
        for (int i = 0; i < str.length(); i++) {
            char cha = str.charAt(i);

            if(cha<'0' || cha >'9') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까?"+isNumber(str));

        str = "1234o";
        System.out.println(str+"는 숫자입니까?"+isNumber(str));
    }
}
