package day4;

public class method06 {

	public static void main(String[] args) {
		// �Լ��� �ԷµǴ� ���� ����� �����ִ� �żҵ�
//getDivisor(10)
		//10�� ��� :1 2 5 10
		
		getDivisor(10);
	}
private static void getDivisor(int num1) {
	System.out.print(num1+"�� ���:");
	
	for (int i = 1; i<= num1; i++) {
		if(num1 %i ==0) {
			System.out.print(i+" ");
		}
	}
}
}
