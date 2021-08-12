package day03;

public class ex배열실습 {

	public static void main(String[] args) {
		int[]arr= {3,7,71,9};
		//2.전체 배열검사 진행 후, 짝수인 값만 출력
        System.out.print("arr에 들어 있는 홀수는");
        int cnt = 0;
        for(int i=0; i<arr.length;i++) {
        	if(arr[i]%2 == 1) {
        		System.out.print(arr[i]+" ");
        		cnt++;
        	}
        	
        }
        System.out.println("이며,|n 총"+cnt+"개 입니다.");
	}
}

