import java.util.*;
public class VehicleTest { // ���� 276p �ϴ°ž�!

	public static void main(String[] args) {
		ArrayList<Vehicle> vList = new ArrayList<Vehicle>(); //���� ��ü�� ������ �迭
		Vehicle v1 = new Sedan("k5");
		Vehicle v2 = new Suv("��Ÿ��");
		Vehicle v3 = new Truck("������ ������");
		Vehicle v4 = new Sedan("�ƿ��A6");
		Vehicle v5 = new Truck("Zeep");
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		vList.add(v5);
		// �Ʒ��� ���� ���� �� �߰��ص� ��
		// vList.add(new Sedan());  / 6���� �Ǵ� 9���ΰ� �����ϴ�.(�����ϸ鼭 �߰��� ���̴�.)
		for (Vehicle v : vList) {   //���� for����
			v.move();  // ������ ��ü�� �°� ȣ���(������)
		}
		
	}

}
