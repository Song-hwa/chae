package method;

import java.util.ArrayList;
import java.util.Scanner;

public class _music {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		
		while(true) {
			System.out.println("[1]노래추가[2]노래삭제[3]노래조회[4]종료");
			int num = sc.nextInt();//노래를 담아줄 리스트
			if(num==1) {
				
			
           		
				System.out.println("===========현재재생목록=====");
				   if(arr.size()==0) {
					   //s노래가 없을때
					   System.out.println("재생목록이 없음");
				   }else {
					   //노래가 추가되었을때
					   for(int i = 0; i<arr.size();i++) {
                           System.out.println((i+1)+"."+arr.get(i));
	
                   		
					   }
				System.out.println("=========================");
				System.out.print("[1]마지막 위치에 추가[2]원하는 위치에 추가");
				int inputNum = sc.nextInt();
				if(inputNum==1) {
			        
					
	           		System.out.println("추가할 노래를 입력해주세요>>");
	           		String newSong = sc.next();
	           		arr.add(newSong);
	         
	           		System.out.println("추가완료되었습니다.");
					
			}else if(num==2) {
			
		}else if(num==3) {
			
		}else if(num==4) {
			
		}

	}


}

}

}
}




