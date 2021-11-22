
public class Ex1119_1 {

	public static void main(String[] args) {
		// Student 클래스 테스트
		Student st1 = new Student();  //객체생성     /new Student는 생성자
		st1.setStudentName("둔둔이");   //메서드 실행
		
		System.out.println(st1.getStudentName());
		
		Student st2 = new Student();
		st2.setStudentName("루랑이");
		
		System.out.println(st2.getStudentName());
	}

}
