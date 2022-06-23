package _03_Object;

public class _06_InitializedBlock {
    // static initialized block
    // main method보다 먼저 올라감
    // 멤버변수 취급한다
    static { 
        System.out.println("static{}");
    }   

    // instance initialized block
    {
        System.out.println("{ }");
    }

    public static void main(String[] args) {
        System.out.println("_06_InitializedBlock i1 생성");
        _06_InitializedBlock i1 = new _06_InitializedBlock();
        
        System.out.println("_06_InitializedBlock i2 생성");
        _06_InitializedBlock i2 = new _06_InitializedBlock();
    }
}