
public class Score {
	//�������
	String name;
	int kor;
	int eng;
	int mat;
	
	//����Ʈ ������
//	public Score() {
//		
//	}
	
	public Score() {
		name = "ȫ�浿";
		kor = 70;
		eng = 70;
		mat = 70;
	}
	
	public Score(String sname, int skor, int seng, int smat) {
		name = sname;
		kor = 70;
		eng = 70;
		mat = 70;
	}
		
	
	//�޼���
	public void setName(String sname) {
		name = sname;
	}
	public void setKor(int skor) {
		kor = skor;
	}
	public void setEng(int seng) {
		eng = seng;
	}
	public void setMat(int smat) {
		mat = smat;
	}
	
	
	
	public static int add(int kor, int eng, int mat) {
		int result = kor + eng + mat;
		return result;
	}
		
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	
	
	
	
	public int getTotal() {         //����
		return kor + eng + mat;
	}
	public double getAvg() {        //���
		return getTotal() / 3.0;    //�� ����� ����. �� ��Ż�� 3�� �����ε� ������(�Ǽ���)�� ��� ������ 3�� 3.0���� �ٲ㼭 �����°� ����.
	}                               // �Ǵ� return (double)getTotal() / 3;���� �ص� �ȴ�.

	
	
	
	
	
}
