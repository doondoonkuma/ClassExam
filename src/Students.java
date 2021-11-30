import java.util.*;    //util 아래의 모든 경로에 대해서~ -의 의미
public class Students {    //지금까지 배운 것들을 활용할 수 있는 연습 (교재 ~230p까지)
	//멤버변수
	private int studentID;
	private String studentName;
	//int kor;
	//int eng;  // 학생마다 과목을 몇개씩 수강 했는지 모르니까 가변할 수 있도록 ArrayList를 활용하자!
	ArrayList<Subject> subjectList;  //->에러가 난 이유...는 모르겠지만 import와 경로를 적용하면 해결 된다.

	//생성자
	public Students() {
		
	}
	//오버로딩된 생성자
	public Students(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();  //Subject 클래스가 필요하다. 만들러 가자~ 해결했다!
	}
	
	//과목명과 점수를 추가하는 메서드, 학생마다 각각 처리
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject); //이제부터 중요, 리스트에 추가해야 한다. Subject타입의 객체를 추가
	}
	public void showStudentInfo() {
		int total = 0;  //총점 계산용 지역변수
		System.out.print(studentName + ":" + studentID);       
		for ( Subject s : subjectList ) {  //저장된 원소 수만큼 반복
			total += s.getScorePoint();    //총점 누적
			System.out.print(s.getName() + ":" + s.getScorePoint());
		}
		System.out.println();
		System.out.println("총점 : " + total);
		System.out.println("=========================");
	}
	
	
	
	
	
	
	






}
