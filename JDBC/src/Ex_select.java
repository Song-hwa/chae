import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_select {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
//1. ����̹� ���� �ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

//2. Connection ��ü ���� -> DB����	
			conn = DriverManager.getConnection(url, user_id, user_pw);

			if (conn != null) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}

//3. ������� id, pw �Է¹ޱ� -> Scanner ���
			System.out.print("id �Է� : ");
			String id_01 = sc.next();
			System.out.print("pw �Է� : ");
			String pw_01 = sc.next();

//4. �Էµ� id, pw�� ���� ������� id, pw, name, age �˻�(Select)
//  - sql�� �ۼ� �� ����/����
			String sql = "select * from members where ID = ? AND PW = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id_01);
			psmt.setString(2, pw_01);

//5. �˻��� ���� console ��� -> ResultSet
			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);

				System.out.println("id : " + id);
				System.out.println("pw : " + pw);
				System.out.println("name : " + name);
				System.out.println("age : " + age);
				System.out.println();
			}

		} catch (ClassNotFoundException e) {
			System.out.println("���� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ����");
			e.printStackTrace();
		}

		// 6. ���� ��ü �ݾ��ֱ�
		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {
				System.out.println();
				e.printStackTrace();
			}
		}
	}

}
