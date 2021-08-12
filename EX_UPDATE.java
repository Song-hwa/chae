import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class EX_UPDATE {

   public static void main(String[] args) {
      
      Connection conn = null;
      PreparedStatement psmt = null;
      ResultSet rs =null;
      
      
      Scanner sc = new Scanner(System.in);
      
      // ����ڿ��� �����ϰ� ���� ���� Ȯ���ϱ�!
      System.out.println("=====ȸ�� ���� ����=====");
      System.out.print("���̵� �Է� : ");
      String id = sc.next();
      
      System.out.print("[1]pw [2]name [3]age >> ");
      int choice = sc.nextInt();
      
      
      int data = 0;
      String data2 = "";
      
      System.out.print("������ ������ �Է� : ");
      if(choice == 3) {
         data = sc.nextInt();
      }else {
         data2 = sc.next();
      }
      
      // ���� �޴��� ���� sql�� �ۼ�
      String sql = "";
      if(choice == 1) {  // pw ����
         sql = "update members set pw = ? where id = ?";
      }else if(choice == 2) {  // name ����
         sql = "update members set name = ? where id = ?";
      }else if(choice == 3) {  // age ����
         sql = "update members set age = ? where id = ?";
      }
      

      // 1. �����ε�
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String user_id = "hr";
         String user_pw = "hr";
         
         // 2. �����ͺ��̽� ����
         conn = DriverManager.getConnection(url, user_id, user_pw);
         
         
         // 3. sql�� �ۼ�
         //    - ��й�ȣ�� �����Ҽ� �ִ� sql�� �ۼ�
//         String sql = "update members set pw ='1225' where id = 'csm'";
         
         psmt = conn.prepareStatement(sql);
         
         // ?�� ���� setting �����ϱ�
         if(choice == 3) {
//            String sql = "update members set age = ? where id = ? ";
            psmt.setInt(1, data);
            psmt.setString(2, id);
         }else {
            psmt.setString(1, data2);
            psmt.setString(2, id);
         }
         
         int cnt = psmt.executeUpdate();
         
         if(cnt > 0) {
            System.out.println("���� �Ϸ�!");
         }else {
             System.out.println("���� ����..");
         }      
         
         //�ش�ID �� ������ ������ �����ִ� SQL�� �ۼ�      
         sql = "select*from members where id = ?";
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, id);
         
         psmt.executeQuery();
         
         rs = psmt.executeQuery();
         
         while(rs.next()) {
        	 String id2 = rs.getString(1);
        	 String pw2 = rs.getString(2);
        	 String name =rs.getString(3);
        	 int age = rs.getInt(4);
        	 
        	 System.out.println(id2+ " "+pw2+"  "+name+age);
        	 
        	 
         }
         
      } catch (ClassNotFoundException e) {
         System.out.println("���� ����");
         e.printStackTrace();
      } catch (SQLException e) {
         System.out.println("sql ����");
         e.printStackTrace();
      }

      // 4. ���� ���� - try - catch ���� ����� �ۼ�
      finally {
            try {
            	if(rs!=null) {
            		rs.close();
            	}
               if(psmt != null) {
                  psmt.close();
               }if(conn != null) {
                  conn.close();
               }
            } catch (SQLException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }

	}
	}

}
