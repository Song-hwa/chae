import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex_01이전 {

	public static void main(String[] args) {

		
		
		try {// 무조건 한번은 실행을 시키는 구문
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 데이터베이스 연결하기> Connection 객체를 통하여 연결

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			// Connection import작업> java.sql
			Connection conn = DriverManager.getConnection(url, user_id, user_pw);

			// getConnection()을 통하여 반환된 값으로 연결여부 확인하기
			if (conn != null) {
				System.out.println("연결 성공!");
			} else {
				System.out.println("연결 실패...");
			}
		

            //3. sql작성 > PreparedStATEMENT()
		    String sql =  "select* from employees where last_name = 'king'";
            PreparedStatement psmt = conn.prepareStatement(sql);
            //실제 sql문을 실행할 수 있는 명령 진행
            //executeQuery() : 원본 테이블에 변동이 없는 경우> select
            // executeUpdate() : 원본 테이블에 수정이 일어나는 경ㅇ우> insert, delete
            
            ResultSet rs = psmt.executeQuery();
            
            while(rs.next()) {
            String id = rs.getString(1);
            System.out.println("employee_id:"+id);
                
            }
            
   
		    
            }catch (ClassNotFoundException e) {// TRY 에서 오류나는 부분들을 예외처리하는 영역
			// jdbc 동적로딩을 위한 경로가 맞지 않을 경우 발생하는 오류
			System.out.println("동적로딩 오류!");
			e.printStackTrace();
			
		    }catch (SQLException e) {
		  	// sql에 해당하는 영역에 대한 오류
			System.out.println("데이터베이스 오류!");
			e.printStackTrace();

		}
		    }
}
