import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_delete {

	public static void main(String[] args) {
		//���̵�� ��й�ȣ�� �Է��ϸ� �ش� ���̺�κ��� ���� �����ϱ�
		
		
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		//���۷������� �⺻ ���� null�̴�.
	    PreparedStatement psmt = null;
	
		
		//1. �����ε�
		 try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	    
		//2. �����ͺ��̽� ����
	         
	     	String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";
	         
	         
	        conn = DriverManager.getConnection(url, user_id, user_pw);
	        

		
		//3. ����ڷκ��� ���̵�, ��й�ȣ �Է��ϱ�
	         System.out.print("���̵�  : ");
	         String id = sc.next();
			 System.out.print("��й�ȣ: ");
			 String pw = sc.next();
	         
		//4. SQL���ۼ�(3���� Ȱ��)
	         String sql = "delete from members where id = ? and pw = ?";
			 
	         psmt = conn.prepareStatement(sql);  
			 
	         psmt.setString(1, id);
	         psmt.setString(2, pw);
			 
	         int cnt = psmt.executeUpdate();
	         
	         if(cnt>0) {
	        	 System.out.println("���� ����!");
	        	 
	         }else {
	        	 System.out.println("���� ����");
	         }

       } catch (ClassNotFoundException e) {
        System.out.println("���� ����");
        e.printStackTrace();
       } catch (SQLException e) {
        System.out.println("sql ����");
        e.printStackTrace();
       }
		//String sql = "";
		//5. ��ü ��������
			    finally {
		            try {
		            	if(psmt!=null) {
		            		psmt.close();
		            	}if(conn!=null) {
		            		conn.close();
		            	}
		            } catch (SQLException e) {
		               // TODO Auto-generated catch block
		               e.printStackTrace();
		            }
		            
	}
}

}
