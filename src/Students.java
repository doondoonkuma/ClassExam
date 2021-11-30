import java.util.*;    //util �Ʒ��� ��� ��ο� ���ؼ�~ -�� �ǹ�
public class Students {    //���ݱ��� ��� �͵��� Ȱ���� �� �ִ� ���� (���� ~230p����)
	//�������
	private int studentID;
	private String studentName;
	//int kor;
	//int eng;  // �л����� ������ ��� ���� �ߴ��� �𸣴ϱ� ������ �� �ֵ��� ArrayList�� Ȱ������!
	ArrayList<Subject> subjectList;  //->������ �� ����...�� �𸣰����� import�� ��θ� �����ϸ� �ذ� �ȴ�.

	//������
	public Students() {
		
	}
	//�����ε��� ������
	public Students(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();  //Subject Ŭ������ �ʿ��ϴ�. ���鷯 ����~ �ذ��ߴ�!
	}
	
	//������ ������ �߰��ϴ� �޼���, �л����� ���� ó��
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject); //�������� �߿�, ����Ʈ�� �߰��ؾ� �Ѵ�. SubjectŸ���� ��ü�� �߰�
	}
	public void showStudentInfo() {
		int total = 0;  //���� ���� ��������
		System.out.print(studentName + ":" + studentID);       
		for ( Subject s : subjectList ) {  //����� ���� ����ŭ �ݺ�
			total += s.getScorePoint();    //���� ����
			System.out.print(s.getName() + ":" + s.getScorePoint());
		}
		System.out.println();
		System.out.println("���� : " + total);
		System.out.println("=========================");
	}
	
	
	
	
	
	
	






}
