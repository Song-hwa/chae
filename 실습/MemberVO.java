package 실습;

public class MemberVO {
	// Model : 접근하고자 하는 데이터베이스 테이블의 모든 자료형을 정리하는 곳
	
	//members 테이블 : id, pw, name, age
	
	//필드 지정
	private String id;
	private String pw;
	private String name;
	private int age;
	
	
	//회원가입시 사용하기 위한 생성지 메소드
	public MemberVO(String id, String pw, String name, int age) {
		//필드의 변수와 매개변수 연결하기
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	//각 필드에 따른 get/set메소드 생성


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
