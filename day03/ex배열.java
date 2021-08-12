package day03;

public class ex배열 {

	public static void main(String[] args) {
		//개발자는 아티스트다
		
		//1.임의의 배열 생성
		int[]arr= {1,2,3,4,5,6,7,8};
		//2.전체 배열검사 진행 후, 짝수인 값만 출력
        System.out.print("arr에 들어 있는 짝수는");
        for(int i=0; i<arr.length;i++) {
        	if(arr[i]%2 == 0) {
        		System.out.print(arr[i]+" ");
        	}
        	
        }
        System.out.print("입니다.");
	}

}
