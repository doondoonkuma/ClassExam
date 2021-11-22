
public class Student {     //클래스 (교재127p)
	//멤버변수 선언
	int studentId;              //이름 생성시 구분을 위해 대문자를 혼용하거나 띄어쓰고싶을 경우 _를 이용하여 구분해도 된다.
	String studentName;         // ③ ②에서 건너온 name이 여기에 대입된다.         
	int grade;                  //대문자로 시작하는 것은 보통 클래스 생성시만 쓴다.
	String address;
	//생성자
	//오버로딩된 생성자
	//메서드
	public void showStudentInfo() {             //void의 의미는 showStudentInfo에 대해 반환할 것이 없다. -는 의미
		System.out.println(studentName + "===" + address);   //학생의 이름과 주소를 출력하는 메서드를 작성했다.
	}
	public String getStudentName() {
		return studentName;                     //반환타입이 있으면 읽기
	}
	public void setStudentName(String name) {
		studentName = name;                     //반환타입이 없으면 쓰기 / ② ①에서 대입된 이름인데 이게 ③으로 간다.
		return;                                 //리턴 값은 있던 없던 상관없다.
	}
	//오버로딩된 생성자
	//진입점(main)
	public static void main(String args[]) {  //진입점, 운영체제에서 프로그램 호출, 여기는 static 때문에 Student 클래스의 영역이 아니다.(사실상 관계 없음)
		Student st1 = new Student();          //객체생성, "클래스명 변수명(객체변수) = new 생성자()"문법으로 만든다.
		st1.setStudentName("박종수");           //여기서의 박종수 이름이 ①이고 ②의 name에 대입된다.
		
		System.out.println(st1.studentName);        //멤버변수 직접 출력
		System.out.println(st1.getStudentName());   //메서드를 활용해서 출력
		
		
	}
	
}
