package method;

import java.util.ArrayList;
import java.util.Scanner;

public class _music {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		
		while(true) {
			System.out.println("[1]�뷡�߰�[2]�뷡����[3]�뷡��ȸ[4]����");
			int num = sc.nextInt();//�뷡�� ����� ����Ʈ
			if(num==1) {
				
			
           		
				System.out.println("===========����������=====");
				   if(arr.size()==0) {
					   //s�뷡�� ������
					   System.out.println("�������� ����");
				   }else {
					   //�뷡�� �߰��Ǿ�����
					   for(int i = 0; i<arr.size();i++) {
                           System.out.println((i+1)+"."+arr.get(i));
	
                   		
					   }
				System.out.println("=========================");
				System.out.print("[1]������ ��ġ�� �߰�[2]���ϴ� ��ġ�� �߰�");
				int inputNum = sc.nextInt();
				if(inputNum==1) {
			        
					
	           		System.out.println("�߰��� �뷡�� �Է����ּ���>>");
	           		String newSong = sc.next();
	           		arr.add(newSong);
	         
	           		System.out.println("�߰��Ϸ�Ǿ����ϴ�.");
					
			}else if(num==2) {
			
		}else if(num==3) {
			
		}else if(num==4) {
			
		}

	}


}

}

}
}




