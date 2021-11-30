
public class StudentsTest {

	public static void main(String[] args) {
		// 학생, 과목 클래스 테스트(가변 과목)
		Students st1 = new Students(1001, "둔둔이");  //st1학생에 대해 학번과 이름만 부여
		st1.addSubject("국어", 90);
		st1.addSubject("영어", 85);
		Students st2 = new Students(1002, "루랑이");
		st2.addSubject("국어", 70);
		st2.addSubject("영어", 93);
		st2.addSubject("수학", 81);
		
		st1.showStudentInfo();
		st2.showStudentInfo();    //학생1과 학생2의 과목이 동일하지 않아도 배열하고 ArrayList를 이용해 출력했다! 정말 어렵다..
		
	}

}
