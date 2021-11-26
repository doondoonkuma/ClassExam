
public class Student {     //클래스 (교재127p)
	//멤버변수 선언
	private static int serialNum = 1000;  //인스턴스(객체)생성과 무관하다(=객체 생성이 되지 않아도 만들 수 있다), 모든 객체에서 공용으로 사용.
	public int studentId;              //이름 생성시 구분을 위해 대문자를 혼용하거나 띄어쓰고싶을 경우 _를 이용하여 구분해도 된다.
	public String studentName;         // ③ ②에서 건너온 name이 여기에 대입된다.         
	public int grade;                  //대문자로 시작하는 것은 보통 클래스 생성시만 쓴다.
	public String address;
	//생성자
	public Student() {       //*ⓐ
		serialNum++;         //클래스 공통, 생성하면 무조건 증가, ++serialNum;으로 써도 상관 없지만 개발자들은 보통 후위연산을 선호한다.
		studentId = serialNum;   //**** 학생 객체가 새로 추가 될 때마다 시리얼넘은 ++;의 영향으로 1씩 증가 하니까 홍길동(객체1)이 1000으로 시작했으면, 김삿갓(객체2)은 1001을, 성춘향(객체3)은 1002의 값을 갖는다.
	}
	//오버로딩된 생성자
	//메서드
	/*
	public void showStudentInfo() {             //void의 의미는 showStudentInfo에 대해 반환할 것이 없다. -는 의미
		System.out.println(studentName + "===" + address);   //학생의 이름과 주소를 출력하는 메서드를 작성했다.
	}
	*/
	public String getStudentName() {
		return studentName;                     //반환타입이 있으면 읽기
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;                     //반환타입이 없으면 쓰기 / ② ①에서 대입된 이름인데 이게 ③으로 간다.                            //리턴 값은 있던 없던 상관없다.
	}
	
	public static int getSerialNum() {
		int i = 10;                     //지역변수 사용가능, 스태틱으로 선언되어 있지 않은 멤버변수에 대해서는 적용 안됨
		return serialNum;               
	}
	
	/*--------------------------------------*/
	int studentID;
	String name;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println( studentID + "," + name);
	}
	/*--------------------------------------*/
	//오버로딩된 생성자 //선생님이 만든 식
	
	
	//진입점(main)
	/*
	public static void main(String args[]) {  //진입점, 운영체제에서 프로그램 호출, 여기는 static 때문에 Student 클래스의 영역이 아니다.(사실상 관계 없음)
		Student st1 = new Student();          //객체생성, "클래스명 변수명(객체변수) = new 생성자()"문법으로 만든다.
	}	
	*/	
		
//		연습
//		Student studentPark = new Student();  //Student 클래스 생성
//		studentPark.studentName = "둔둔이";
//		
//		System.out.println(studentPark.studentName);
//		System.out.println(studentPark.getStudentName());
//		
//		Student studentPark = new Student();
//		->Student 클래스 자료형으로 studentPark 변수를 선언하고 new Student();로 Student 클래스를 생성하여 studentPark에 대입한다는 뜻.
//		studentPark을 참조변수라고 하고 이 변수가 생선된 인스턴스를 가리킨다.
		

	
}
