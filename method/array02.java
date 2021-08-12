package method;

import java.util.ArrayList;

public class array02 {

	public static void main(String[] args) {
		
		//array list
		//자바계열의 한계를 극복하는 방법
//자바배열은 사이즈가 고정되어있음.
		//3칸짜리에는 데이터 3개만 넣을수 있는 한계
		//파이썬의 리스트와 개념유사
		
		
		//1.생성하기
		String[] arr = new String[3];
		ArrayList<String> arr2 = new ArrayList<String>();
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		//1.어레이리스트 맨뒤에 데이터 넣기
		arr2.add("c채송");
		arr2.add("rovbinson");
		arr2.add("은희");
		//2.어레이리스트속 데이터를 가지고 올때는.get(index)기능 활용
		//System.out.println(arr2.get(0));
		//System.out.println(arr2.get(1));
		//System.out.println(arr2.get(2));
		
		//3.전체 데이터 출력
		//4.배열의 길이를 구해올때는 length가 아니고. size();
		
		for(int i =0; i<arr2.size(); i++) {
			System.out.println(arr2.get(i)+"  ");
		}
		System.out.println("=================");
		//5.원하는 위치 데이터 바꾸기
		arr2.add("차준섭");
		for(int i =0; i< arr2.size(); i++) {
			System.out.println(arr2.get(i)+"  ");
		}
		
		
		//6.원하는 위치 데이터 삭제
		arr2.removeAll(arr2);
		for(int i =0; i< arr2.size(); i++) {
			System.out.println(arr2.get(i)+"  ");
	}
	
	


	}


}

