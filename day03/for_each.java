package day03;

public class for_each {

	public static void main(String[] args) {
		// for-eachȦ�� ����ϱ�

		int[] arr = {3,4,9,21,71,100};
		
		for(int i:arr) {
			if (i%2==1) {
				System.out.print(i+"  ");
			}
		}

	}

}
