
public class DeskTop extends Computer {  //��ǻ�� Ŭ������ ��ӹ��� �ž�!
	// �߻�Ŭ������ ��ӹ޾��� ��� �ݵ�� �߻�޼��带 �����ؾ� �Ѵ�.
	@Override // �����Ϸ����� �Ʒ��� �ִ� ������ �� �Ű����! ��� �˷��ִ� ���(���� ��� ������, ��Ÿ �� ������ ã�Ƴ��µ� ����.)
	public void display() {  // ��� �޴� �ʿ����� abstract�����(�߻�)�� ���� �ʴ´�.
		System.out.println("DeskTop display");
	}
	@Override // ������ ���� ������ �Ű澵��!�� �ǹ�? �߸��� ������ ã�Ƴ��µ� ��!
	public void typing() {
		System.out.println("DeskTop typing");
	}
	
}
// �ϴ��� ��ǻ�Ϳ� ����ũž�� ���踸 ��������