public class Ex1130_4 {

	public static void main(String[] args) {
		// 다차원 배열(교재 219p)
		//int[][] arr = new int[2][3];           //2행 3열, 생성만 한 것
		int[][] arr = {{1, 2, 3},{4, 5, 6}};     //2행 3열, 초기화를 이용해서 생성한 것
		for (int i = 0; i < arr.length; i++) {         //행
			for(int j = 0; j < arr[i].length; j++) {   //열
				System.out.println(arr[i][j]);   //원소의 값 출력
			}
			System.out.println();
		}
	
		//옆으로 출력...?
		int[][] arr1 = {{1, 2, 3},{4, 5, 6}};     //2행 3열, 초기화를 이용해서 생성한 것
		for (int i = 0; i < arr1.length; i++) {         //행
			for(int j = 0; j < arr1[i].length; j++) {   //열
				System.out.print(arr1[i][j] + " ");
				System.out.println(); //원소의 값 출력
			}
		
		}
			
	}

}