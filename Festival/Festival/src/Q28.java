public class Q28 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int data = 1;

		System.out.println("원본");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = data;
				data++;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("90도 회전");

		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
	}

}
