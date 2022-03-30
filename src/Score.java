public class Score {
	//멤버변수
	String name;
	int kor;
	int eng;
	int mat;
	
	//디폴트 생성자
//	public Score() {
//		
//	}
	
	public Score() {
		name = "홍길동";
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
		
	
	//메서드
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
	
	
	
	
	public int getTotal() {         //총점
		return kor + eng + mat;
	}
	public double getAvg() {        //평균
		return getTotal() / 3.0;    //이 방법이 좋다. 겟 토탈과 3은 정수인데 더블형(실수형)을 썼기 때문에 3을 3.0으로 바꿔서 나누는게 좋다.
	}                               // 또는 return (double)getTotal() / 3;으로 해도 된다.

	
	
	
	
	
}