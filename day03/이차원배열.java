package day03;

public class 이차원배열 {

	public static void main(String[] args) {
		// 이차원 배열 선언하기
		int[][]arr = new int[5][5];
		//이차원 배열을 돌면서 저장해줄 값 생성
		
		int data =0;
		//값을 저장해주기 위한 작업
		//층수를 반복하기 위한for문 (행)
		for(int i = 0; i<5; i++) {
			//호수를 반복하기 위한 for문(열)
			for(int j =0; j<5; j++) {
				arr[i][j] = data;
				data++;
			}
		}
		//값을 확인해주기 위한 작업
		for(int i =0; i<5; i++) {
			for(int j =4; j>=0; j--) {
				System.out.print(arr[i][j]+"	");
			}
			//층을 나누기 위한 개행작업
			System.out.println();
		}
            //이차원 배열에서의 길이 구하기
		// 층수와 호수에 대한 길이를 따로따로 확인할 수 있다
		//층수와 호수에 대한 크기가 서로 다를 수 있기 때문에
		
		//층수> 배열의 이름.length
		//호수 > 배열의 이름 [층수].length
		
		//일차원 배열 int[]
		//이차원 배열 int[][]>다차원이라고 하기도 함
		//공통점 : 배열의 크기가 지정되어 있다 > 튜플
		
		//가변배열 :배열의 크기가 지정되어 있지 않다.> 리스트
		
	}

}
