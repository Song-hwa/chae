package day04;

public class ex13for_each {

	public static void main(String[] args) {
		//for each �� ����ϱ�
		//for������ �ٸ��� �迭�� �Բ� Ȱ���Ͽ� ����� �� �ִ� �ݺ���
		
		int[]arr= {1,2,3,4,5,6,7,8,9,10};
		
		for (int i :arr ) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
