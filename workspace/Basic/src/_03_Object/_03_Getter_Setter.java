package _03_Object;

public class _03_Getter_Setter {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(-100);
        // System.out.println(p.setAge(););
        System.out.println(p.getAge());
    }
}

class Person { 
    // getter/setter
    // 멤버 변수를 초기화
    // class의 개념을 온전하게 가져가려할 때
    // 값을 뒤에서 초기화
    
    private String name;
    private String mobile;
    private String gender;
    private int age;
    // private, 객체 개념을 보호하기 위함

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public String getMobile() {return this.mobile;}
    public void setMobile(String mobile) {this.mobile = mobile;}

    public String getGender() {return this.gender;}
    public void setGender(String gender) {this.gender = gender;}

    public void setAge(int age) {
        if (age > 0)
            age = this.age; // this 자신이 속한 class
    }

    public int getAge() { // return type을 age와 같게 해준다
        return age;
    }

}