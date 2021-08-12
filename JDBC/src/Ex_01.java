import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex_01 {

	public static void main(String[] args) {
		// JDBC 연결순서 (4단계)
		// 선행작업 : ojdbc.jar 프로젝트에 추가하기
		// 1. JDBC 동적로딩 - 드라이버 설치
		// 2. 데이터베이스 연결 - Connection 객체 사용
		// 3. SQL문 전송 - PreParedStatement, ResultSet 객체
		// 4. 사용된 객체에 대하여 연결을 닫아주는 단계

		// 1. JDBC 동적 로딩 -> Class.forName()
		// 자바의 오류
		// - 컴파일 오류 : 문법적인 오류
		// - 런타임 오류 : 문법상으로는 문제가 없지만 실제 동작시 오류를 포함하는 것
		try { // 무조건 한 번은 실행시키는 구문
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 데이터베이스 연결하기 -> Connection 객체를 통하여 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";
			
			//Connection import 작업 : java.sql
			Connection conn = DriverManager.getConnection(url, user_id, user_pw);
			
			//getConnection()을 통하여 반환된 값으로 연결 여부 확인하기
			if(conn != null) {
				System.out.println("연결 성공");
			}else {
				System.out.println("연결 실패");
			}
			
			//3. sql 작성 : .prepareStatement()
			String sql = "select * from employees where last_name = 'King'";
			PreparedStatement psmt = conn.prepareStatement(sql);
			//실제 sql문을 실행할 수 있는 명령 진행
			//executeQuery() : 원본테이블에 변동이 없는 경우 ex) select
			//exequteUpdate() : 원본 테이블에 수정이 일어나는 경우 ex)insert, delete
			ResultSet rs = psmt.executeQuery();
			
			//결과에 대한 내용을 변수에 저장하기 위한 작업
			while (rs.next()) {
				String id = rs.getString(1);
				String first_name = rs.getString(2);
				String last_name = rs.getString(3);
				
				System.out.println("employee_id : " + id);
				System.out.println("first_name : " + first_name);
				System.out.println("last_name : " + last_name);
				System.out.println();
			}
			
			//4. 연결 종료
			//연결 종료의 순서는 가장 마지막에 열린 객체부터 역순으로 닫아준다
			//rs - psmt - conn
			if(rs != null) {
				rs.close();
			}if(psmt != null) {
				psmt.close();
			}if(conn != null) {
				conn.close();
			}
			
		} catch (ClassNotFoundException e) {// try에서 오류나는 부분들을 예외처리하는 영역
			//JDBC 동적로딩을 위한 경로가 맞지 않을 경우 발생하는 오류
			System.out.println("동적 로딩 오류");
			e.printStackTrace();
			
		} catch (SQLException e) {
			//sql에 해당하는 영역에 대한 오류
			System.out.println("데이터베이스 오류");
			e.printStackTrace();
		}

	}

}
