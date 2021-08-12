import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex_01 {

	public static void main(String[] args) {
		// JDBC ������� (4�ܰ�)
		// �����۾� : ojdbc.jar ������Ʈ�� �߰��ϱ�
		// 1. JDBC �����ε� - ����̹� ��ġ
		// 2. �����ͺ��̽� ���� - Connection ��ü ���
		// 3. SQL�� ���� - PreParedStatement, ResultSet ��ü
		// 4. ���� ��ü�� ���Ͽ� ������ �ݾ��ִ� �ܰ�

		// 1. JDBC ���� �ε� -> Class.forName()
		// �ڹ��� ����
		// - ������ ���� : �������� ����
		// - ��Ÿ�� ���� : ���������δ� ������ ������ ���� ���۽� ������ �����ϴ� ��
		try { // ������ �� ���� �����Ű�� ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. �����ͺ��̽� �����ϱ� -> Connection ��ü�� ���Ͽ� ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";
			
			//Connection import �۾� : java.sql
			Connection conn = DriverManager.getConnection(url, user_id, user_pw);
			
			//getConnection()�� ���Ͽ� ��ȯ�� ������ ���� ���� Ȯ���ϱ�
			if(conn != null) {
				System.out.println("���� ����");
			}else {
				System.out.println("���� ����");
			}
			
			//3. sql �ۼ� : .prepareStatement()
			String sql = "select * from employees where last_name = 'King'";
			PreparedStatement psmt = conn.prepareStatement(sql);
			//���� sql���� ������ �� �ִ� ��� ����
			//executeQuery() : �������̺� ������ ���� ��� ex) select
			//exequteUpdate() : ���� ���̺� ������ �Ͼ�� ��� ex)insert, delete
			ResultSet rs = psmt.executeQuery();
			
			//����� ���� ������ ������ �����ϱ� ���� �۾�
			while (rs.next()) {
				String id = rs.getString(1);
				String first_name = rs.getString(2);
				String last_name = rs.getString(3);
				
				System.out.println("employee_id : " + id);
				System.out.println("first_name : " + first_name);
				System.out.println("last_name : " + last_name);
				System.out.println();
			}
			
			//4. ���� ����
			//���� ������ ������ ���� �������� ���� ��ü���� �������� �ݾ��ش�
			//rs - psmt - conn
			if(rs != null) {
				rs.close();
			}if(psmt != null) {
				psmt.close();
			}if(conn != null) {
				conn.close();
			}
			
		} catch (ClassNotFoundException e) {// try���� �������� �κе��� ����ó���ϴ� ����
			//JDBC �����ε��� ���� ��ΰ� ���� ���� ��� �߻��ϴ� ����
			System.out.println("���� �ε� ����");
			e.printStackTrace();
			
		} catch (SQLException e) {
			//sql�� �ش��ϴ� ������ ���� ����
			System.out.println("�����ͺ��̽� ����");
			e.printStackTrace();
		}

	}

}
