package day4;

public class method {

	public static void main(String[] args) {
		//메소드 호출하기
		int result = addNumber(2,3);
		System.out.println(result);
		
		//변수 사용하지 않고 메소드 결과값 확인하기
		System.out.println(addNumber(1,9));}
	

		
		
		//
		//메소드 정의하기
		//다른 메소드와 겹치면 안된다 메인메소드 아래에서 새롭게 지정
		//메소드의 구조1.접근제한자(접근지정자)-public클래스의 내/외부에서 접근가능
	//2.리턴타입:메소드가 호출되고 난 이후 결과값에 대한 타입
		//-int,string,char>메소드 내에 return 키워드 사용
		//타입이 없는 경우>void
		//3. 메소드의 이름
		//4. 메소드 내에서 사용될 변수>메소드에 들어올 입력값(x값)>매개변수
		public static int addNumber(int num1, int num2) {
		   int result = num1+num2;
		   
			return result;
		}


}
