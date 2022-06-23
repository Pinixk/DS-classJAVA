package _03_Object;

public class _02_Method_Arguements {
    public static void main(String[] args) {
        Data d = new Data();
        System.out.println(d);    // 인스턴스의 주소값 7d6f77cc
        d.x = 100;
        System.out.println(d.x);  // 100, 

        change(d.x);    // 1000, 
        // d.x=100이란 값이 일반형 change의 매개변수로
        // call by value
        // block scope, 값이 일시적으로 변한다

        // 1) Data 
        change(d);               // 10000, 
        System.out.println(d);   // 인스턴스 d와 주소값이 같다.
        // 인스턴스 d의 x값이 참조형 change의 매개변수로
        // 매개변수의 타입이 같아야 한다
        // call by reference
        // 값이 지속적으로 변한다.

        // 2) Data
        // change(d);
        // 매개변수 type이 다름으로 작동 불가
        
        // 3) Data
        d = change(d);
        System.out.println(d.x);  // 10000
        // 같은 주소값의 x를 바꾸었으니 바뀐 값이 계속된다

        System.out.println(d);    // 바뀐 tmp의 주소값이 나온다

    }

    static void change(int x){    // 일반형 매개변수
        x = 1000;
        System.out.println("change() : x = "+x);
    }

    // 1) Data
    // static void change(Data d){    // 참조형 매개변수
    //     System.out.println(d);     // 위의 주소값과 같다
    //     d.x = 10000;
    //     System.out.println("change() : d.x = "+d.x);
    // }

    // 2) Data
    // static void change(Box d){    // 매개변수 타입이 다르다
    //     System.out.println(d);    
    //     d.x = 10000;
    //     System.out.println(d.x);
    // }

    // 3) Data
    static Data change(Data d){     // 참조형 매개변수이며 참조형 리턴
        Data tmp = new Data();      // 새로운 주소 값을 배정 받는다
        System.out.println(d);     
        System.out.println(tmp);    // d의 주소값과 다른다
        tmp.x = 10000;
        return tmp;                 // d의 주소값을 tmp의 주소값으로 바꾼다
    }
}

class Data{
    int x;
}

class Box{
    int x;
}