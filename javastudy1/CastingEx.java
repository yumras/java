package javastudy1;


//person 클래스
class Person{
	String name;
	String id;
	//name 매개변수만 있는 생성자
	public Person(String name) {
		this.name = name;
	}
}

//student 클래스(하위)
class Student extends Person{
	String grade;
	String department;
	//생성자 자동 완성이 안됨 ==> 별도로 추가
	public Student(String name) {
		super(name); // 상위 클래스의 생성자 호출
	}
	public String toString() {
		return "이름은 " + name + ", id는 " + id +
		", 등급은 " + grade + ", 학과는 " + department;
	}
}

public class CastingEx {
	public static void main(String[] args) {
		Person p = new Student("이한민");
		//p=s와 동일한 표현(업 캐스팅)
		//하위를 상위에 대입
		//상위 = 하위(업캐스팅)
		//상위는 하위에 접근 오류
		//형변환이 필요
		Student s = (Student) p;
		
		s.id="1234";
		s.grade="A등급";
		s.department = "스마트금융학과";
		//결과출력하기
		System.out.println("id는 " + s.id + ", 등급은 "+s.grade);
		//클래스 안에 toString()메소드를 만들어서 출력하기
		System.out.println(s);
		
	}

}
