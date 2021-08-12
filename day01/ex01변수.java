package day01;

public class ex01변수 {

	public static void main(String[] args) {
//변수 생성하기
	int age = 10;
	String name = '가나다';
    char nam2 = '가';
    
    age = 20;
    //형변환
    int age2 = 10;
    String age3 = String.valueof(age2);
    String age3 = Integer.parseInt(age2);
    
    //문자를 숫자로 형변환
    String name2 = "50";
    int name3 = Integer.parseInt(name2);
    
    
    //int 형 데이터 float형 데이터 형변환 정수>
    int number = 3;
    float number2 = 3.0f;
    float number3 = (float)3.5;
    int number4 = (int)number2;
    
    
 
    }

}
