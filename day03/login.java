package day03;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
       
		//�α��� ��� �����
		
		//1. ��ĳ�� �ҷ�����
		Scanner sc = new Scanner(System.in);
		while(true) {
        // 2. ���̵� �Է��ϼ��� ��� �� �Է¹ޱ�
		System.out.print("���̵�:");
		String id = sc.next();
//3, ��й�ȣ�� �Է��ϼ��� ��� �� �Է¹ޱ�
		System.out.print("��й�ȣ �Է�:");
		String pw = sc.next();
		
		//4. ���̵� hello�̸鼭 ��й�ȣ�� 1234�϶�
		if(id.equals("hello") && pw.equals("1234")) {
			//����������
			System.out.println("�α��� ����!");
			break;
		}else {

			
			
			//����������
			//1.�ٽ� �Ͻðڽ��ϱ�?�ٽù����(y/n)
			System.out.print("�ٽ��Ͻðڽ��ϱ�?(Y/N)>>");
			String re = sc.next();
			
			
			if(re.equals("n")||re.equals("N")) {
			   System.out.println("�����մϴ�");
			   break;
			}else if(re.equals("y")||re.equals("Y")) {
				continue;
			}
				//2.��,y �Է�, �ƴϿ� n�Է�
			//3.���࿡ ����ڰ�n�� �Է��Ѵٸ� ���α׷�����
		}
		}
		//�α��� ����!>>���α׷�����
		
		//5. �� �� �ϳ���Ʋ���� ���̵� ��� Ȯ�� ���
		//�ٽ� �ݺ���
	}

}
