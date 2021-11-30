
public class Ex1130_1 {

	public static void main(String[] args) {
		// 배열복사
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1,2,3,4,5};
		
		
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");    //""공백 역시 가독성을 위해 입력한 것일 뿐
		}
		System.out.println();          //보기 편하게 하기 위해 줄 바꿈용으로 출력
		//기본 타입의 복사는 독립적(int, double, float, char, ...)
		System.arraycopy(array1, 0, array2, 1, 4);
		//원본과 대상은 각각 유지된다.
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();  
		
		array1[2] = 300;  //배열1 수정
		//배열1 확인(수정됨)
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println(); 
		
		//배열2 리스트 하면 변화 없음     ->위에서는 300이 나타났고, 여기서는 초기화 했기때문에? 나타나지 않는거 같다.
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		//-----------------------------------------
		//객체배열 처리
		Book[] bookArr1 = new Book[3];   //Book 객체를 저장할 배열변수 bookArr1을 선언, 1번
		Book[] bookArr2 = new Book[3];   //Book 객체를 저장할 배열변수 bookArr1을 선언
		
		//생성단계
		Book aaa;   //북 선언     1번 =같은 개념
		aaa = new Book("aaa","bbb");  //이게 북 객체 생성, 2번
		
		bookArr1[0] = new Book("태백산맥","조정래");    //2번 =같은 개념
		bookArr1[1] = new Book("데미안","헤르만헤세");
		bookArr1[2] = new Book("어떻게살것인가","유시민");
		
		System.out.println("======원본======");
		for (int i = 0; i < bookArr1.length; i++) {  //원본
			bookArr1[i].showBookInfo();     //Book클래스에 출력문이 있어서 따로 출력문을 안 붙여도 된다.
		}
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);  //얕은복사
		
		System.out.println("======사본======");
		for (int i = 0; i < bookArr2.length; i++) {  //사본
			bookArr2[i].showBookInfo();     //Book클래스에 출력문이 있어서 따로 출력문을 안 붙여도 된다.
		}
		
		//원본 수정
		bookArr1[0].setBookName("나목");
		bookArr1[0].setAuthor("박완서");
		System.out.println("======원본======");
		for (int i = 0; i < bookArr1.length; i++) {  //원본
			bookArr1[i].showBookInfo();     //Book클래스에 출력문이 있어서 따로 출력문을 안 붙여도 된다.
		}
		
		System.out.println("======사본======");
		for (int i = 0; i < bookArr2.length; i++) {  //사본
			bookArr2[i].showBookInfo();     //Book클래스에 출력문이 있어서 따로 출력문을 안 붙여도 된다.
		}
		
		
		
		
		
		
		
	}

}
