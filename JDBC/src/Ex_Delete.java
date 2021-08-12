import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_Delete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		// 아이디와 비밀번호를 입력하면 해당 내용 테이블로부터 삭제하기

//1. 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

//2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			conn = DriverManager.getConnection(url, user_id, user_pw);

//3. 사용자로부터 아이디, 비밀번호 입력받기
			System.out.print("id 입력 : ");
			String id_input = sc.next();
			System.out.print("pw 입력 : ");
			String pw_input = sc.next();

//4. sql문 작성(3번을 활용)
			String sql = "delete from members where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id_input);
			psmt.setString(2, pw_input);

			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("수정 성공");
			} else {
				System.out.println("수정 실패");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("동적로딩오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql 오류");
			e.printStackTrace();
		}
//5. 객체 연결 종료
		finally {

			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
