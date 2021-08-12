package day06;

import java.util.ArrayList;
import java.util.Scanner;

public class ex03플레이리스트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>(); // 노래를 담아줄 리스트

		while (true) {
			System.out.print("[1]노래추가 [2]노래삭제 [3]노래조회 [4]종료 >> ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("========현재 재생목록========");
				if (arr.size() == 0) {// 노래가 없을때
					System.out.println("재생 목록이 없습니다.");
				} else {              // 노래가 추가되었을 때
					for (int i = 0; i < arr.size(); i++) {
						System.out.println((i + 1) + "." + arr.get(i));
					}
				}

				System.out.println("=========================");
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
				int num1 = sc.nextInt();

				if (num1 == 1) {//마지막 위치에 노래 추가
					System.out.print("추가할 노래 입력>>");
					String title = sc.next();
					arr.add(title);
					System.out.println("추가가 완료되었습니다.");
					System.out.println();
				}else {         //원하는 위치에 노래 추가
					System.out.print("추가할 노래 입력>>");
					String title = sc.next();
					System.out.print("추가 할 위치 입력 >> ");
					int num2 = sc.nextInt();
					arr.add(num2-1,title);
					System.out.println("추가가 완료되었습니다.");
					System.out.println();
				}
			} else if (num == 2) {//노래 삭제
				System.out.println("========현재 재생목록========");
				if(arr.size()==0) {//재생목록이 없을 시
					System.out.println("재생 목록이 없습니다.");
					System.out.println("=========================");
					System.out.println();
				}else {            //재생 목록이 존재할 시
					for (int i = 0; i < arr.size(); i++) {
						System.out.println((i+1)+"."+arr.get(i));
					}
					System.out.println("=========================");
					System.out.println();
					System.out.print("[1]선택삭제 [2]전체삭제 >>");
					int num3=sc.nextInt();
					if(num3==1) {  //노래 선택 삭제
						System.out.print("삭제할 노래 선택>> ");
						String del=sc.next();
						arr.remove(num3-1);
						System.out.println("노래가 삭제되었습니다.");
					}else {        //전체 노래 삭제
						arr.removeAll(arr);
						System.out.println("전체 노래가 삭제되었습니다.");
						System.out.println();
					}
				}
			} else if (num == 3) {//조회하기
				System.out.println("========현재 재생목록========");
				if(arr.size()==0) {//재생목록이 없을 시
					System.out.println("재생 목록이 없습니다.");
					System.out.println("=========================");
					System.out.println();
				}else {            //재생 목록이 존재할 시
					for (int i = 0; i < arr.size(); i++) {
						System.out.println((i+1)+"."+arr.get(i));
					}
					System.out.println("=========================");
					System.out.println();
				}
			} else if (num == 4) { //프로그램 종료
				System.out.println("프로그램이 종료되었습니다!");
				break;
			}
		}

	}

}
