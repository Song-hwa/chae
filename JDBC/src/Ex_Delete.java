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
		// ���̵�� ��й�ȣ�� �Է��ϸ� �ش� ���� ���̺�κ��� �����ϱ�

//1. �����ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

//2. �����ͺ��̽� ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			conn = DriverManager.getConnection(url, user_id, user_pw);

//3. ����ڷκ��� ���̵�, ��й�ȣ �Է¹ޱ�
			System.out.print("id �Է� : ");
			String id_input = sc.next();
			System.out.print("pw �Է� : ");
			String pw_input = sc.next();

//4. sql�� �ۼ�(3���� Ȱ��)
			String sql = "delete from members where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id_input);
			psmt.setString(2, pw_input);

			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("�����ε�����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql ����");
			e.printStackTrace();
		}
//5. ��ü ���� ����
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
