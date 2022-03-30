public class StudentTest1 {

	public static void main(String[] args) {
		// Student 클래스 테스트 (교재182p)
		
		System.out.println(Student.getSerialNum());  //객체생성과 무관하다.
		
		
		Student st1 = new Student();    //디폴트 생성자이다. *클래스 자료형 _ 변수이름 = new _ 생성자;  -> new 예약어로 만든 클래스이다.
		st1.setStudentName("둔둔이");
		//System.out.println(st1.studentName);          // public 멤버변수이므로 가능
		//System.out.println(st1.getStudentName());     // public 메서드이므로 가능

		
		//st1.serialNum++;    //->st2를 생성한 후 11라인에서 st1에 대한 후위연산을 대입해보아도 st2에도 동일하게 적용된다. 스태틱이 있으니까!
		                      

//		System.out.println(st1.serialNum);   //static 변수 읽기
		System.out.println(st1.getStudentName() + ":" + st1.studentId);  //*ⓐ
		Student st2 = new Student();
		st2.setStudentName("루루");
		System.out.println(st2.getStudentName() + ":" + st2.studentId);  //*ⓐ 하지만 앞에서 Id를 만들어서 적용한 후로는 각 객체마다 동일하게 적용한다.
		
		Student st3 = new Student();
		st3.setStudentName("티티");
		
		Student st4 = new Student();
		
		st3.setStudentName("라라");
		
//		System.out.println(st1.getSerialNum);
//		System.out.println(st2.getSerialNum);
//		System.out.println(st3.getSerialNum);
//		System.out.println(st4.getSerialNum);       //프라이빗을 적용한 상태이고, 메서드 내에서 시리얼넘버를 불러오는 것이다.
													//이 출력문을 불러오려면 앞에 메서드에서 스태틱을 빼면 출력이 가능하다.
		
		System.out.println(Student.getSerialNum());
		System.out.println(Student.getSerialNum());
		System.out.println(Student.getSerialNum());
		System.out.println(Student.getSerialNum()); //*****System.out.println(Student.getSerialNum()); 클래스 명을 붙여서 쓰면 안된다.
													//프라이빗을 적용한 상태이고, 메서드 내에서 스태틱을 적용한 시리얼넘버를 불러 올때는 클래스 명을 붙여서 출력할 수 있다.
													//이 출력문을 불러오려면 앞에 메서드에서 스태틱을 부여해야 출력이 가능하다.
		
//		System.out.println(st1.serialNum);
//		System.out.println(st2.serialNum);          //*****System.out.println(Student.serialNum);클래스 이름을 넣어서 해도 된다.
//		System.out.println(st3.serialNum);
//		System.out.println(st4.serialNum);          //①시리얼넘버는 스태틱을 적용 했기 때문에 동일한 값을 각 객체에게 부여하고
		
		
		System.out.println(st1.studentId);
		System.out.println(st2.studentId);
		System.out.println(st3.studentId);
		System.out.println(st4.studentId);          //②아이디는 스태틱 적용이 없기 때문에 시리얼넘버는 ++;연산을 적용해서 각 객체가 추가될때마다 누적이 된다.
		
		//와 진짜 레알 헷갈린다. 이해가 됐는데 읽는 속도가 느리다. 익숙해질때까지 연습해보자-
		
		
	}

}