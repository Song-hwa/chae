package model;

public class memberDTO {

	private String id;
	private String name;
	private String pw;
	private String tel;
	private String email;
	private String address;
	
	// DTO클래스 정의
		//1. 테이블 컬럼기준으로 필드변수 선언(source-> Generate...)
		//2. 사용자 정의 생성자 구현
	public memberDTO(String id,String name,String pw,String tel,String email,String address) {
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.email = email;
		this.tel = tel;
		this.address = address;
	}
	//3. 겟셋 메소드 구현

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
