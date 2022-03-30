import java.util.*;

/*-----------부모 클래스-----------*/
class Animals {		//다형성 (교재259p)
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

/*-----------자식 클래스 + 상속 -----------*/
class Human extends Animals {  //사람클래스 생성 및 위에 애니멀 클래스를 상속 받는다.
	public void move() {  //메서드 오버라이딩(Overriding)
		System.out.println("사람이 움직입니다.");
	}
	public void readBook() {
		System.out.println("책을 읽는다.");  //리드북 새로 생성
	}
	public void movingCar() {
		System.out.println("k5가 질주한다.");
	}
	
}

class Tiger extends Animals {  //호랑이클래스 생성 및 위에 애니멀 클래스를 상속 받는다.
	public void move() {  //메서드 오버라이딩(Overriding)
		System.out.println("호랑이가 움직입니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 한다.");
	}
}

class Eagle extends Animals {  //독수리클래스 생성 및 위에 애니멀 클래스를 상속 받는다.
	public void move() {  //메서드 오버라이딩(Overriding)
		System.out.println("독수리가 움직입니다.");
	}
	public void flying() {
		System.out.println("독수리가 날아간다.");
	}
}

public class AnimalsTest {  //파일명과 동일한 클래스는 public 필요(단, 1개)
	public static void main(String[] args) {
		AnimalsTest aTest = new AnimalsTest();
		
		Animals[] animalArr = new Animals[10];  //애니멀즈 객체에 대해 배열을 만들어 보겠다!, 배열객체 생성
		for (int i = 0; i < 3; i++) {  //사람 셋
			animalArr[i] = new Human();
		}
		for (int i = 3; i < 5; i++) {  //호랑 둘
			animalArr[i] = new Tiger();
		}
		for (int i = 5; i < 10; i++) {   //수리 다섯
			animalArr[i] = new Eagle();
		}
		
		for (int i = 0; i < 10; i++) {   //배열 출력해!
			aTest.moveAnimal(animalArr[i]);
		} 
		
		System.out.println("-------------");
		//move 메서드 호출
		for (int i = 0; i < animalArr.length; i++) {
//			animalArr[i].move();
		}
		
		
//		Human a1 = new Human();
//		Tiger a2 = new Tiger();
//		Eagle a3 = new Eagle();  -> 이렇게 만들면 메서드도 통일성이 없고, 배열을 만들 수도 없어서(타입이 다르니까) 불편하다.
		                           //그래서, 아래와 같이 타입을 같이 묶어놓고 배열도 만들고 메서드도 공유하여 불러오고 하는거지!
		
//		Animals a1 = new Human();   // 이 객체 자체가 휴먼이고
//		Animals a2 = new Tiger();
//		Animals a3 = new Eagle();   //-> 타입이 같아지니까 애니멀로 통일하면 얼마나 편해!!
//		
//		aTest.moveAnimal(a1);
//		aTest.moveAnimal(a2);
//		aTest.moveAnimal(a3);
//	}
	//------------------------(교재 276p)-----------------------------------
	ArrayList<Animals> aniList = new ArrayList<Animals>();
	aniList.add(new Human());  //객체 생성하면서 배열에 추가
	aniList.add(new Tiger());
	aniList.add(new Eagle());
	for ( Animals item : aniList ) {
		item.move();  //다형성에 의해 각각의 메서드 호출
	}
	for (int i = 0; i < aniList.size(); i++) {
		Animals item = aniList.get(i);
		if (item instanceof Human) {
			Human h = (Human)item; //다운캐스팅
			h.readBook();  //다운캐스팅 되었으므로 독립된 메서드 사용 가능
		} else if (item instanceof Tiger) {
			Tiger t = (Tiger)item;
			t.hunting();
		} else if (item instanceof Eagle) {
			Eagle e = (Eagle)item;
			e.flying();
		} else {
			System.out.println("알 수 없는 오류입니다.");
		}
	}		
	
	//------------------------------------------------
	//end main
}	
	public void moveAnimal(Animals animal) {
		animal.move();  //다형성, 실제로 다른 일을 실행한다. 각각의 move를 똑같은 메서드로 호출하는 셈이다.
	}
	
	
}