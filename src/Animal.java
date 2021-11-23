
public class Animal {
	//멤버변수
	String name;
	int weight;
	int speed;
	
	//디폴트 생성자
	public Animal() {
		name = "동물";
		weight = 30;
		speed = 0;
	}
	
	public Animal(String aname) {
		name = aname;
		weight = 30;
		speed = 0;
    }         
	
	public Animal(String aname, int aweight) {
		name = aname;
		weight = aweight;
		speed = 0;
    }         
	
	//메서드
	public void setName(String aname) {
		name = aname;
	}
	
	public void setSpeed(int aspeed) {
		speed = aspeed;
	}
	
	public void setWeight(int aweight) {
		weight = aweight;
	}
		
	public String getName() {
		return name;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getWeight() {
		return weight;
	}
	
	/*----------------------------------------*/
	
	public void speedUp() {
		speed += 10;    //스피드에 10을 누적
	}
	
	public void speedUp(int aspeed) {
		if (speed + aspeed > 100) {   //현재 속도에 추가될 속도를 덧셈해서 100이 넘는지 확인
			speed = 100;
		} else {
			speed += aspeed;
		}
		
	}
	
	public void speedDown() {
		speed -= 10;    //스피드에 10을 차감
	}
	
	public void speedDown(int aspeed) {
		if (speed - aspeed < 0) {   //현재 속도에 추가될 속도를 덧셈해서 100이 넘는지 확인
			speed = 0;
		} else {
			speed -= 10;
		}
		
	}
	
	
}
