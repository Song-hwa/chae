package day03;

public class ex07for�� {

	public static void main(String[] args) {
		for (int i = 21; i <= 57; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 96; i >= 53; i--) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 21; i <= 57; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		//1~100 3�� ����� ���� �������� ����ϱ�(�ѹ���)
		int a = 0;
		for (int i = 1; i<=100; i++) {
			if (i%3==0) {
				a+=i;
			}
		}System.out.println(a);
	}

}
