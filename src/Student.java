
public class Student {     //Ŭ���� (����127p)
	//������� ����
	private static int serialNum = 1000;  //�ν��Ͻ�(��ü)������ �����ϴ�(=��ü ������ ���� �ʾƵ� ���� �� �ִ�), ��� ��ü���� �������� ���.
	public int studentId;              //�̸� ������ ������ ���� �빮�ڸ� ȥ���ϰų� ������� ��� _�� �̿��Ͽ� �����ص� �ȴ�.
	public String studentName;         // �� �迡�� �ǳʿ� name�� ���⿡ ���Եȴ�.         
	public int grade;                  //�빮�ڷ� �����ϴ� ���� ���� Ŭ���� �����ø� ����.
	public String address;
	//������
	public Student() {       //*��
		serialNum++;         //Ŭ���� ����, �����ϸ� ������ ����, ++serialNum;���� �ᵵ ��� ������ �����ڵ��� ���� ���������� ��ȣ�Ѵ�.
		studentId = serialNum;   //**** �л� ��ü�� ���� �߰� �� ������ �ø������ ++;�� �������� 1�� ���� �ϴϱ� ȫ�浿(��ü1)�� 1000���� ����������, ���(��ü2)�� 1001��, ������(��ü3)�� 1002�� ���� ���´�.
	}
	//�����ε��� ������
	//�޼���
	/*
	public void showStudentInfo() {             //void�� �ǹ̴� showStudentInfo�� ���� ��ȯ�� ���� ����. -�� �ǹ�
		System.out.println(studentName + "===" + address);   //�л��� �̸��� �ּҸ� ����ϴ� �޼��带 �ۼ��ߴ�.
	}
	*/
	public String getStudentName() {
		return studentName;                     //��ȯŸ���� ������ �б�
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;                     //��ȯŸ���� ������ ���� / �� �翡�� ���Ե� �̸��ε� �̰� ������ ����.                            //���� ���� �ִ� ���� �������.
	}
	
	public static int getSerialNum() {
		int i = 10;                     //�������� ��밡��, ����ƽ���� ����Ǿ� ���� ���� ��������� ���ؼ��� ���� �ȵ�
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
	//�����ε��� ������ //�������� ���� ��
	
	
	//������(main)
	/*
	public static void main(String args[]) {  //������, �ü������ ���α׷� ȣ��, ����� static ������ Student Ŭ������ ������ �ƴϴ�.(��ǻ� ���� ����)
		Student st1 = new Student();          //��ü����, "Ŭ������ ������(��ü����) = new ������()"�������� �����.
	}	
	*/	
		
//		����
//		Student studentPark = new Student();  //Student Ŭ���� ����
//		studentPark.studentName = "�е���";
//		
//		System.out.println(studentPark.studentName);
//		System.out.println(studentPark.getStudentName());
//		
//		Student studentPark = new Student();
//		->Student Ŭ���� �ڷ������� studentPark ������ �����ϰ� new Student();�� Student Ŭ������ �����Ͽ� studentPark�� �����Ѵٴ� ��.
//		studentPark�� ����������� �ϰ� �� ������ ������ �ν��Ͻ��� ����Ų��.
		

	
}
