package day04;

public class ex14for_each��_�ǽ� {

	public static void main(String[] args) {
		
		int[] arr= {3,4,9,21,71,100};
		
		//for each�� �̿��Ͽ� Ȧ���� ����ϱ�
		
		for(int i : arr) {
			if (i%2==1) {
				System.out.print(i+ " ");
			}
		}
	}

}
