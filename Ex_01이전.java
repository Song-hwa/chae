import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex_01���� {

	public static void main(String[] args) {

		
		
		try {// ������ �ѹ��� ������ ��Ű�� ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. �����ͺ��̽� �����ϱ�> Connection ��ü�� ���Ͽ� ����

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			// Connection import�۾�> java.sql
			Connection conn = DriverManager.getConnection(url, user_id, user_pw);

			// getConnection()�� ���Ͽ� ��ȯ�� ������ ���Ῡ�� Ȯ���ϱ�
			if (conn != null) {
				System.out.println("���� ����!");
			} else {
				System.out.println("���� ����...");
			}
		

            //3. sql�ۼ� > PreparedStATEMENT()
		    String sql =  "select* from employees where last_name = 'king'";
            PreparedStatement psmt = conn.prepareStatement(sql);
            //���� sql���� ������ �� �ִ� ��� ����
            //executeQuery() : ���� ���̺� ������ ���� ���> select
            // executeUpdate() : ���� ���̺� ������ �Ͼ�� �椷��> insert, delete
            
            ResultSet rs = psmt.executeQuery();
            
            while(rs.next()) {
            String id = rs.getString(1);
            System.out.println("employee_id:"+id);
                
            }
            
   
		    
            }catch (ClassNotFoundException e) {// TRY ���� �������� �κе��� ����ó���ϴ� ����
			// jdbc �����ε��� ���� ��ΰ� ���� ���� ��� �߻��ϴ� ����
			System.out.println("�����ε� ����!");
			e.printStackTrace();
			
		    }catch (SQLException e) {
		  	// sql�� �ش��ϴ� ������ ���� ����
			System.out.println("�����ͺ��̽� ����!");
			e.printStackTrace();

		}
		    }
}
