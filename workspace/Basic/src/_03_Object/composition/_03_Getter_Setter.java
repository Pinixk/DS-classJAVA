package _03_Object.composition;

public class _03_Getter_Setter {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(-60); 
        // 값을 뒤에서 초기화
        // System.out.println(p.setAge(););
        System.out.println(p.getAge());
    }
}

class Person { 
    // getter/setter
    // 멤버 변수를 초기화
    // class의 개념을 온전하게 가져가려할 때
    
    
    private String name;
    private String mobile;
    private String gender;
    private int age;
    // private, 객체 개념을 보호하기 위함

    public String getName() {return this.name;} // 값에 맞춰서 return type을 맞춰줌
    public void setName(String name) {this.name = name;}

    public String getMobile() {return this.mobile;}
    public void setMobile(String mobile) {this.mobile = mobile;}

    public String getGender() {return this.gender;}
    public void setGender(String gender) {this.gender = gender;}

    public void setAge(int age) {
        if(age>0)
        this.age = age; // this 자신이 속한 class
    }

    public int getAge() { // return type을 age와 같게 해준다
        return age;
    }

}