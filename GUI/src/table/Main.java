package table;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		//Scanner를 통해서 이름, 나이, 성별 입력받기
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		MemberVO vo;
		TableView view;
		
		ArrayList<MemberVO> members = new ArrayList();
		
		
		do {
           System.out.print("이름:");
           String name =sc.next();
           
           System.out.print("나이:   ");
           int age = sc.nextInt();
           
           System.out.print("성별:   ");
           String gender = sc.next();
           
           
           vo = new MemberVO(name, age, gender);
           members.add(vo);
           
           view = new TableView(members);
           
           System.out.print("[1]추가[2]종료 ");
           choice = sc.nextInt();
           
	}while(choice !=2);

}
}