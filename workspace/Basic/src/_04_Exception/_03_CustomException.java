package _04_Exception;

public class _03_CustomException {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (Exception e1) {
            e1.printStackTrace();
            try {
                throw new Exception();
            } catch (Exception e2) {
                
            }
        }
    }
}

class MyException extends Exception{
    public MyException(){
        super("KBJ Exception");
    }
}