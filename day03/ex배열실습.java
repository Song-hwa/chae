package day03;

public class ex�迭�ǽ� {

	public static void main(String[] args) {
		int[]arr= {3,7,71,9};
		//2.��ü �迭�˻� ���� ��, ¦���� ���� ���
        System.out.print("arr�� ��� �ִ� Ȧ����");
        int cnt = 0;
        for(int i=0; i<arr.length;i++) {
        	if(arr[i]%2 == 1) {
        		System.out.print(arr[i]+" ");
        		cnt++;
        	}
        	
        }
        System.out.println("�̸�,|n ��"+cnt+"�� �Դϴ�.");
	}
}

