package Ex03;

public class Main {

	public static void main(String[] args) {
		// �߻�ȭ?
		//���� ��ü���� ���������� ���Ǵ� ��ɵ���
		//�̾Ƴ��� ���� �߻�ȭ
		
		Sonata so = new Sonata();
		so.color = "silver";
		System.out.println(so.getTire());
		so.runner();
		so.wet();
		
		Volvo vol = new Volvo();
		vol.runner();
		vol.pilot();
		
		// �߻� Ŭ������ ��üȭ �� �� ����
		//����� ���Ͽ� ���� ����� �� ��üȭ �Ͽ� �����ؾ��Ҷ�
		//�߻�ȭ�� ����Ѵ�
		
		//Car c = new Car();
		
		
	}

}
