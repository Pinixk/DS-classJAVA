package _03_Object;

public class _06_InitializedBlock {
    // static initialized block
    
    // main method보다 먼저 올라감
    // 멤버변수 취급한다
    static { 
        System.out.println("static{}");
    }   

    // 초기화 블럭, instance initialized block
    // new 로 초기화 될 때 실행
    {
        System.out.println("{ }");
    }

    // 생성자
    public _06_InitializedBlock(){
        System.out.println("생성자");
    }

    // 기본값 -> 명시적 블럭 -> 초기화 블럭 -> 생성자

    public static void main(String[] args) {
        System.out.println("_06_InitializedBlock i1 생성");
        _06_InitializedBlock i1 = new _06_InitializedBlock();
        
        System.out.println("_06_InitializedBlock i2 생성");
        _06_InitializedBlock i2 = new _06_InitializedBlock();
    }
}