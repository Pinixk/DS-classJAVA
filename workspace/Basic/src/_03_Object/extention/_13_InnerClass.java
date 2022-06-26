package _03_Object.extention;

public class _13_InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.InstanceInner oi = outer.new InstanceInner();
        System.out.println(oi.iv);  // 100

        Outer.StaticInner os = new Outer.StaticInner();
        System.out.println(os.iv);  // 200
        System.out.println(os.sv);  // 300

        outer.myMethod();   // 400
    }
}

class Outer{
    class InstanceInner{
        int iv = 100;
    }

    static class StaticInner{
        int iv = 200;
        static int sv = 300;
    }

    void myMethod(){
        class localInner{
            int iv = 400;
        }
        System.out.println(new localInner().iv);
    }
}