package Exercise;

public class Exercise_06_03 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름 : " + s.name);
        System.out.println("총점 : " + s.getTotal());
        System.out.println("평균 : " + s.getAverage());
    }
}

class Student1{
   String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

    Student1(){}

	public Student1(String name,
			int ban,
			int no,
			int kor,
			int eng,
			int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
    
    public int getTotal() {return kor+eng+math;}
    public float getAverage() {return (int)(getTotal()/3.0f*10.0f+0.5f)/10.0f;}
}