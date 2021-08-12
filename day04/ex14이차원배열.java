package day04;

public class ex14이차원배열 {

	public static void main(String[] args) {
		// 이차원 배열 선언하기
		int[][] arr = new int[5][5];

		// 이차원 배열을 돌면서 저장해줄 값
		int data = 0;

		// 값을 저장해주기 위한 작업
		// 행을 반복하기 위한 for문
		for (int i = 0; i < 5; i++) {
			// 열을 반복하기 위한 for문
			for (int j = 0; j < 5; j++) {
				arr[i][j] = data;
				data++;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >=0; j--) {
				System.out.print(arr[i][j] + "\t");
			}
			// 행을 나누기 위한 개행작업
			System.out.println();
		}
		
		//이차원 배열에서의 길이 구하기
		//행과 열에 대한 길이를 따로따로할 수 있다.
		//왜냐하면 행과 열에 대한 크기가 서로다를 수 있기 때문에.
		
		//행 -> 배열의 이름.length
		//열 -> 배열의 이름[층수].length
		
		//일차원 배열 int[]
		//이차원 배열 int[][]-> 다차원이라고도 함
		//공통점 : 배열의 크기가 지정되어 있다.
		
		
		

		arr[0][0] = 0;
		arr[0][1] = 1;
		arr[0][2] = 2;
		arr[0][3] = 3;
		arr[0][4] = 4;

		arr[1][0] = 5;
		arr[1][1] = 6;
		arr[1][2] = 7;
		arr[1][3] = 8;
		arr[1][4] = 9;
	}

}
