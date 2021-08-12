import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ex_select {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		// 1. 드라이버 동적 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2.connection객체 생성 >데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			// 2. Connection 객체 생성 -> DB연결
			conn = DriverManager.getConnection(url, user_id, user_pw);

			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}

			// 3. 사용자의 id, pw 입력받기 -> Scanner 사용
			System.out.print("아이디 : ");
			String id_01 = sc.next();
			System.out.print("비밀번호 : ");
			String pw_01 = sc.next();

			// 4. 입력된 id, pw와 같은 사용자의 id, pw, name, age 검색(Select)
			String sql = "select * from members where ID = (?) AND PW = (?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id_01);
			psmt.setString(2, pw_01);

			rs = psmt.executeQuery();

			// ResultSet은 결과값이 표와 같은 형태이다.

			// 5. 검색된 내용 console 출력 -> ResultSet>rs.next()
//select 결과의 행이 몇가지가 나올지 모르므로 반복문을 사용한다.
			while (rs.next()) {
				String id2 = rs.getString(1);
				String pw2 = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);

				System.out.println(id2 + "\t" + pw2 + "\t" + name + "\t" + age);

				System.out.println("id2 : " + id_01);
				System.out.println("pw2 : " + pw_01);
				System.out.println("name : " + name);
				System.out.println("age : " + age);
				System.out.println();
			}

		} catch (ClassNotFoundException e) {
			System.out.println("동적 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql 오류");

			// 6. 사용된 객체 닫아주기 >finally
		} finally {
			try {

				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
	}// main
}// class
