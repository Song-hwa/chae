package day03;

public class exfor {

	public static void main(String[] args) {
		// for문 이용 21~57까지 출력
		System.out.print("for문 첫번째:");
		for(int i =21; i<=57; i++) {
			System.out.println(i);
		}
//for문을 사용하여 96~53까지 출력
		
		System.out.println("for문 두번째:");
		for(int i =96; i>=53; i--) {
			System.out.println(i);
		}
		
		//for문을 사용하여 21~57까지의 수중 홀수만 출력
		System.out.println("for문 세번째");
		for(int i=21; i<=57; i+=2) {
			System.out.println(i);
	    int hap = 0;
		//1~100 3의 배수에 대한 누적합 출력
        for(int i =1; i<=100; i+=2) {
        	hap+=i;
        }
		System.out.print(hap+" ");
		}
	}

}
