package day04;

public class ex02����for�� {

	public static void main(String[] args) {
		
		//����� Ǯ�� 1
		//�ݺ����� �̿��� �����
		//i�� ��, j�� ��, j�� i���� ũ�� j�� ���� 5������ �ϳ� �� �����Ѵ�.
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}//
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		//����� Ǯ�� 2
		//i�� ��, j�� ��, j�� i���� ũ�� j�� ���� 5������ �ϳ� �� �����Ѵ�.
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (j>i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
//
			System.out.println();
		}
	}
}
