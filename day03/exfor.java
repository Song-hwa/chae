package day03;

public class exfor {

	public static void main(String[] args) {
		// for�� �̿� 21~57���� ���
		System.out.print("for�� ù��°:");
		for(int i =21; i<=57; i++) {
			System.out.println(i);
		}
//for���� ����Ͽ� 96~53���� ���
		
		System.out.println("for�� �ι�°:");
		for(int i =96; i>=53; i--) {
			System.out.println(i);
		}
		
		//for���� ����Ͽ� 21~57������ ���� Ȧ���� ���
		System.out.println("for�� ����°");
		for(int i=21; i<=57; i+=2) {
			System.out.println(i);
	    int hap = 0;
		//1~100 3�� ����� ���� ������ ���
        for(int i =1; i<=100; i+=2) {
        	hap+=i;
        }
		System.out.print(hap+" ");
		}
	}

}
