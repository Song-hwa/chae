package table;

public class MemberVO {
// 나이, 이름, 성별을 관리할수 있는 VO Class
	
	String name;
	int age;
	String gender;
	
	
	
	// 생성자 메소드 생성
	public MemberVO(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender ;
		
	}
}
