package OOP;

public class Main {

	public static void main(String[] args) {
		//��/ü�� �����ϴ� ����
		//���赵������� ��ü�� �޸𸮿� �Ҵ��ϴ� ����>Ŭ������ �ν��Ͻ�ȭ
		People hyung = new People();
	    // new>>���۷�������(����������)�� �����Ҷ� ���� Ű����
		
		
		System.out.println(hyung);
		System.out.println(hyung.age);
		System.out.println(hyung.name);
		
		hyung.name="����";
		hyung.age = 20;
		hyung.height=185.9;
		hyung.organs = new String[3];
		hyung.organs[0]="����";
		hyung.organs[1]="��";
		hyung.organs[2]="��";
							
		
		System.out.println(hyung.name);
		System.out.println(hyung.height);
		System.out.println(hyung.organs[1]);
		System.out.println(hyung.age);
		
		hyung.eat();
		hyung.sleep();
		
		

		
		
		

	}

}
