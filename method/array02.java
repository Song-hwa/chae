package method;

import java.util.ArrayList;

public class array02 {

	public static void main(String[] args) {
		
		//array list
		//�ڹٰ迭�� �Ѱ踦 �غ��ϴ� ���
//�ڹٹ迭�� ����� �����Ǿ�����.
		//3ĭ¥������ ������ 3���� ������ �ִ� �Ѱ�
		//���̽��� ����Ʈ�� ��������
		
		
		//1.�����ϱ�
		String[] arr = new String[3];
		ArrayList<String> arr2 = new ArrayList<String>();
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		//1.��̸���Ʈ �ǵڿ� ������ �ֱ�
		arr2.add("cä��");
		arr2.add("rovbinson");
		arr2.add("����");
		//2.��̸���Ʈ�� �����͸� ������ �ö���.get(index)��� Ȱ��
		//System.out.println(arr2.get(0));
		//System.out.println(arr2.get(1));
		//System.out.println(arr2.get(2));
		
		//3.��ü ������ ���
		//4.�迭�� ���̸� ���ؿö��� length�� �ƴϰ�. size();
		
		for(int i =0; i<arr2.size(); i++) {
			System.out.println(arr2.get(i)+"  ");
		}
		System.out.println("=================");
		//5.���ϴ� ��ġ ������ �ٲٱ�
		arr2.add("���ؼ�");
		for(int i =0; i< arr2.size(); i++) {
			System.out.println(arr2.get(i)+"  ");
		}
		
		
		//6.���ϴ� ��ġ ������ ����
		arr2.removeAll(arr2);
		for(int i =0; i< arr2.size(); i++) {
			System.out.println(arr2.get(i)+"  ");
	}
	
	


	}


}

