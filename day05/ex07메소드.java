package day05;

public class ex07�޼ҵ� {

	public static void main(String[] args) {
//		getDivisor(10) : �Լ��� �ԷµǴ� ���� ����� �����ִ� �޼ҵ�
		// 10�� ��� : 1 2 5 10
		getDivisor(10);
	}

	public static void getDivisor(int num) {
		System.out.print(num+"�� ��� : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
