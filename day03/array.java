package day03;

public class array {

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
					for(int j =0; j<5; j++) {
						System.out.print(arr[i][j]+"	");
					}
					//층을 나누기 위한 개행작업
					System.out.println();
				}

			}

		}