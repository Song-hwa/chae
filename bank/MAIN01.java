package bank;

public class MAIN01 {

	public static void main(String[] args) {
		//��ü�� �����ϴ� ����
	
		BANK bank1 = new BANK();
	
		
		//1. money�� 50000�� �ֱ�

		bank1.deposit(50000);
		//.2money���� 30000������
		bank1.withdraw(30000);
		//3. �� �ܾ��� �����ֱ�
		System.out.println(bank1.showmoney());
		
	}

}
