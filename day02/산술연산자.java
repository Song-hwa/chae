package day02;

import java.util.Scanner;

public class ��������� {

	public static void main(String[] args) {
	//1.��ĳ�� ��� �ҷ�����
		Scanner sc = new Scanner(System.in);
	//2. ���Է��̶�� ��¹� �ۼ�
		System.out.print("���Է�>>");
	//3. �������� �Է��ϱ�
		int totalSecond = sc.nextInt();
	//4. ��� ��� �������� ����ϱ�	
        int hour = totalSecond/3600;
        int min = (totalSecond%3600)/60;
        int sec = (totalSecond%3600)%60;
        
        System.out.println(hour+"��"+min+"��"+sec+"��");
        		
	}

}
