
public class Student {     //Ŭ���� (����127p)
	//������� ����
	int studentId;              //�̸� ������ ������ ���� �빮�ڸ� ȥ���ϰų� ������� ��� _�� �̿��Ͽ� �����ص� �ȴ�.
	String studentName;         // �� �迡�� �ǳʿ� name�� ���⿡ ���Եȴ�.         
	int grade;                  //�빮�ڷ� �����ϴ� ���� ���� Ŭ���� �����ø� ����.
	String address;
	//������
	//�����ε��� ������
	//�޼���
	public void showStudentInfo() {             //void�� �ǹ̴� showStudentInfo�� ���� ��ȯ�� ���� ����. -�� �ǹ�
		System.out.println(studentName + "===" + address);   //�л��� �̸��� �ּҸ� ����ϴ� �޼��带 �ۼ��ߴ�.
	}
	public String getStudentName() {
		return studentName;                     //��ȯŸ���� ������ �б�
	}
	public void setStudentName(String name) {
		studentName = name;                     //��ȯŸ���� ������ ���� / �� �翡�� ���Ե� �̸��ε� �̰� ������ ����.
		return;                                 //���� ���� �ִ� ���� �������.
	}
	//�����ε��� ������
	//������(main)
	public static void main(String args[]) {  //������, �ü������ ���α׷� ȣ��, ����� static ������ Student Ŭ������ ������ �ƴϴ�.(��ǻ� ���� ����)
		Student st1 = new Student();          //��ü����, "Ŭ������ ������(��ü����) = new ������()"�������� �����.
		st1.setStudentName("������");           //���⼭�� ������ �̸��� ���̰� ���� name�� ���Եȴ�.
		
		System.out.println(st1.studentName);        //������� ���� ���
		System.out.println(st1.getStudentName());   //�޼��带 Ȱ���ؼ� ���
		
		
	}
	
}
