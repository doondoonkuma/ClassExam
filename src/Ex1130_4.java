
public class Ex1130_4 {

	public static void main(String[] args) {
		// ������ �迭(���� 219p)
		//int[][] arr = new int[2][3];           //2�� 3��, ������ �� ��
		int[][] arr = {{1, 2, 3},{4, 5, 6}};     //2�� 3��, �ʱ�ȭ�� �̿��ؼ� ������ ��
		for (int i = 0; i < arr.length; i++) {         //��
			for(int j = 0; j < arr[i].length; j++) {   //��
				System.out.println(arr[i][j]);   //������ �� ���
			}
			System.out.println();
		}
	
		//������ ���...?
		int[][] arr1 = {{1, 2, 3},{4, 5, 6}};     //2�� 3��, �ʱ�ȭ�� �̿��ؼ� ������ ��
		for (int i = 0; i < arr1.length; i++) {         //��
			for(int j = 0; j < arr1[i].length; j++) {   //��
				System.out.print(arr1[i][j] + " ");
				System.out.println(); //������ �� ���
			}
		
		}
			
	}

}
