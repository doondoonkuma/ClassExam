
public class Ex1119_1 {

	public static void main(String[] args) {
		// Student Ŭ���� �׽�Ʈ
		Student st1 = new Student();  //��ü����     /new Student�� ������
		st1.setStudentName("�е���");   //�޼��� ����
		
		System.out.println(st1.getStudentName());
		
		Student st2 = new Student();
		st2.setStudentName("�����");
		
		System.out.println(st2.getStudentName());
	}

}
