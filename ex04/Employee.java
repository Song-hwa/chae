package ex04;

public abstract class Employee {
//��� ������ Ŭ�����κ��� ����Ǵ� �ʵ�, �޼ҵ带 ���ϰ� �ִ�
	//protected : ����� �ްų� ���� ��Ű�� �ȿ� �ִٸ� �ܺο����� ������ �����ϴ�
	protected String empno;
	protected String name;
	protected int pay;
	
	//�������� �߻�޼ҵ� �����>abstract
	// �߻� �޼ҵ��� Ư¡> ��ü�� ������ ���� �ʴ´�
	//                >�߻� �޼ҵ�� �߻� Ŭ������ ���ԵǾ�� �Ѵ�
	public abstract int getMoneyPay(); 
		
	//�Ϲ����� �޼ҵ嵵 ���� �� �ִ�
	public String print() {
		return empno + ":"+name+":"+pay;
	}		
	}
