package day03;

import java.util.Scanner;

public class ex02���̾�Ʈ {

	public static void main(String[] args) {
		//1. ��ĳ�� �ҷ�����
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		
		//2. ��������� ��� �� �Է¹ޱ�
		System.err.print("���� ������ : ");
		int now = sc.nextInt();
		
		//3. ��ǥ������ ��� �� �Է¹ޱ�
		System.err.print("��ǥ ������ : ");
		int goal = sc.nextInt();
		
		//4. ������ ���� ������ ��� �� �Է¹ޱ�
		do {
			//�ѹ��� ������ �����ؾ��ϴ� �κ�
			//�ݺ��۾��� ������ �κ�
			System.out.println(cnt+"���� ���� ������ : ");
			int minus = sc.nextInt();
			now -= minus;
			cnt++;
		}while(now>goal);
		System.out.println(now+"kg �޼�!! �����մϴ�");
		//5. ��ǥġ�� �޼����� �� ���� �޼��� �����ϱ�
	}

}
