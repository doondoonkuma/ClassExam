
public class Score_1 {

	public static void main(String[] args) {
		// Score Ŭ���� �׽�Ʈ

		Score st1 = new Score();
		System.out.println(st1.getName() + "�� ����������" + st1.getKor() + "�̰�, ���������� " + st1.getEng() + "�̰�, ���������� " + st1.getMat() + "�̰�, ������ " + st1.getTotal() + "�̰�, ����� " + st1.getAvg() + "�̴�.");
		
		st1.setName("���");
		st1.setKor(93);
		st1.setEng(78);
		st1.setMat(81);
		System.out.println(st1.getName() + "�� ����������" + st1.getKor() + "�̰�, ���������� " + st1.getEng() + "�̰�, ���������� " + st1.getMat() + "�̰�, ������ " + st1.getTotal() + "�̰�, ����� " + st1.getAvg() + "�̴�.");
		
		Score st2 = new Score("�̵���", 84, 91, 79);
		System.out.println(st2.getName() + "�� ����������" + st2.getKor() + "�̰�, ���������� " + st2.getEng() + "�̰�, ���������� " + st2.getMat() + "�̰�, ������ " + st2.getTotal() + "�̰�, ����� " + st2.getAvg() + "�̴�.");
		
		
		
		
		
		
		
		
		
		
		
	}

}
