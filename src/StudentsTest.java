
public class StudentsTest {

	public static void main(String[] args) {
		// �л�, ���� Ŭ���� �׽�Ʈ(���� ����)
		Students st1 = new Students(1001, "�е���");  //st1�л��� ���� �й��� �̸��� �ο�
		st1.addSubject("����", 90);
		st1.addSubject("����", 85);
		Students st2 = new Students(1002, "�����");
		st2.addSubject("����", 70);
		st2.addSubject("����", 93);
		st2.addSubject("����", 81);
		
		st1.showStudentInfo();
		st2.showStudentInfo();    //�л�1�� �л�2�� ������ �������� �ʾƵ� �迭�ϰ� ArrayList�� �̿��� ����ߴ�! ���� ��ƴ�..
		
	}

}
