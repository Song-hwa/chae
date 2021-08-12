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

		// 1. ����̹� ���� �ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2.connection��ü ���� >�����ͺ��̽� ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			// 2. Connection ��ü ���� -> DB����
			conn = DriverManager.getConnection(url, user_id, user_pw);

			if (conn != null) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}

			// 3. ������� id, pw �Է¹ޱ� -> Scanner ���
			System.out.print("���̵� : ");
			String id_01 = sc.next();
			System.out.print("��й�ȣ : ");
			String pw_01 = sc.next();

			// 4. �Էµ� id, pw�� ���� ������� id, pw, name, age �˻�(Select)
			String sql = "select * from members where ID = (?) AND PW = (?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id_01);
			psmt.setString(2, pw_01);

			rs = psmt.executeQuery();

			// ResultSet�� ������� ǥ�� ���� �����̴�.

			// 5. �˻��� ���� console ��� -> ResultSet>rs.next()
//select ����� ���� ����� ������ �𸣹Ƿ� �ݺ����� ����Ѵ�.
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
			System.out.println("���� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql ����");

			// 6. ���� ��ü �ݾ��ֱ� >finally
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
