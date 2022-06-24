package Exercise;

public class Exercise_06_02 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);

		String str = s.info();
		System.out.println(str);
	}
}

class Student {
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;

	public Student(String name,
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

	public String info() {
		int total = kor+eng+math;
		float avg = (int)(total/3.0f*10.0f+0.5f)/10.0f;

		return name + ","
				+ ban + ","
				+ no + ","
				+ kor + ","
				+ eng + ","
				+ math + ","
				+ total+","
				+ avg; // 형 변환
	}

}
