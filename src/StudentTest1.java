
public class StudentTest1 {

	public static void main(String[] args) {
		// Student Ŭ���� �׽�Ʈ (����182p)
		
		System.out.println(Student.getSerialNum());  //��ü������ �����ϴ�.
		
		
		Student st1 = new Student();    //����Ʈ �������̴�. *Ŭ���� �ڷ��� _ �����̸� = new _ ������;  -> new ������ ���� Ŭ�����̴�.
		st1.setStudentName("�е���");
		//System.out.println(st1.studentName);          // public ��������̹Ƿ� ����
		//System.out.println(st1.getStudentName());     // public �޼����̹Ƿ� ����

		
		//st1.serialNum++;    //->st2�� ������ �� 11���ο��� st1�� ���� ���������� �����غ��Ƶ� st2���� �����ϰ� ����ȴ�. ����ƽ�� �����ϱ�!
		                      

//		System.out.println(st1.serialNum);   //static ���� �б�
		System.out.println(st1.getStudentName() + ":" + st1.studentId);  //*��
		Student st2 = new Student();
		st2.setStudentName("���");
		System.out.println(st2.getStudentName() + ":" + st2.studentId);  //*�� ������ �տ��� Id�� ���� ������ �ķδ� �� ��ü���� �����ϰ� �����Ѵ�.
		
		Student st3 = new Student();
		st3.setStudentName("ƼƼ");
		
		Student st4 = new Student();
		
		st3.setStudentName("���");
		
//		System.out.println(st1.getSerialNum);
//		System.out.println(st2.getSerialNum);
//		System.out.println(st3.getSerialNum);
//		System.out.println(st4.getSerialNum);       //�����̺��� ������ �����̰�, �޼��� ������ �ø���ѹ��� �ҷ����� ���̴�.
													//�� ��¹��� �ҷ������� �տ� �޼��忡�� ����ƽ�� ���� ����� �����ϴ�.
		
		System.out.println(Student.getSerialNum());
		System.out.println(Student.getSerialNum());
		System.out.println(Student.getSerialNum());
		System.out.println(Student.getSerialNum()); //*****System.out.println(Student.getSerialNum()); Ŭ���� ���� �ٿ��� ���� �ȵȴ�.
													//�����̺��� ������ �����̰�, �޼��� ������ ����ƽ�� ������ �ø���ѹ��� �ҷ� �ö��� Ŭ���� ���� �ٿ��� ����� �� �ִ�.
													//�� ��¹��� �ҷ������� �տ� �޼��忡�� ����ƽ�� �ο��ؾ� ����� �����ϴ�.
		
//		System.out.println(st1.serialNum);
//		System.out.println(st2.serialNum);          //*****System.out.println(Student.serialNum);Ŭ���� �̸��� �־ �ص� �ȴ�.
//		System.out.println(st3.serialNum);
//		System.out.println(st4.serialNum);          //��ø���ѹ��� ����ƽ�� ���� �߱� ������ ������ ���� �� ��ü���� �ο��ϰ�
		
		
		System.out.println(st1.studentId);
		System.out.println(st2.studentId);
		System.out.println(st3.studentId);
		System.out.println(st4.studentId);          //����̵�� ����ƽ ������ ���� ������ �ø���ѹ��� ++;������ �����ؼ� �� ��ü�� �߰��ɶ����� ������ �ȴ�.
		
		//�� ��¥ ���� �򰥸���. ���ذ� �ƴµ� �д� �ӵ��� ������. �ͼ����������� �����غ���-
		
		
	}

}
