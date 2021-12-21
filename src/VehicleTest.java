import java.util.*;
public class VehicleTest { // 교재 276p 하는거야!

	public static void main(String[] args) {
		ArrayList<Vehicle> vList = new ArrayList<Vehicle>(); //각종 객체를 저장할 배열
		Vehicle v1 = new Sedan("k5");
		Vehicle v2 = new Suv("산타페");
		Vehicle v3 = new Truck("렉스턴 스포츠");
		Vehicle v4 = new Sedan("아우디A6");
		Vehicle v5 = new Truck("Zeep");
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		vList.add(v5);
		// 아래와 같이 생성 후 추가해도 됨
		// vList.add(new Sedan());  / 6라인 또는 9라인과 동일하다.(생성하면서 추가한 것이다.)
		for (Vehicle v : vList) {   //향상된 for구문
			v.move();  // 각각의 객체에 맞게 호출됨(다형성)
		}
		
	}

}
