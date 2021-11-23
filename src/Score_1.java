
public class Score_1 {

	public static void main(String[] args) {
		// Score 클래스 테스트

		Score st1 = new Score();
		System.out.println(st1.getName() + "의 국어점수는" + st1.getKor() + "이고, 영어점수는 " + st1.getEng() + "이고, 수학점수는 " + st1.getMat() + "이고, 총점은 " + st1.getTotal() + "이고, 평균은 " + st1.getAvg() + "이다.");
		
		st1.setName("김삿갓");
		st1.setKor(93);
		st1.setEng(78);
		st1.setMat(81);
		System.out.println(st1.getName() + "의 국어점수는" + st1.getKor() + "이고, 영어점수는 " + st1.getEng() + "이고, 수학점수는 " + st1.getMat() + "이고, 총점은 " + st1.getTotal() + "이고, 평균은 " + st1.getAvg() + "이다.");
		
		Score st2 = new Score("이도령", 84, 91, 79);
		System.out.println(st2.getName() + "의 국어점수는" + st2.getKor() + "이고, 영어점수는 " + st2.getEng() + "이고, 수학점수는 " + st2.getMat() + "이고, 총점은 " + st2.getTotal() + "이고, 평균은 " + st2.getAvg() + "이다.");
		
		
		
		
		
		
		
		
		
		
		
	}

}
