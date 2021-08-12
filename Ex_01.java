import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex_01 {

   public static void main(String[] args) {
      // JDBC���� ����
      
      // 0. �����۾� : ojdbc.jar�� ������ �߰�
      // 1. JDBC�� ����� �����ε� <- ����̹��� ��ġ���شٴ� �ǹ�
      // 2. �����ͺ��̽��� ���� <- Connection��ü ���
      // 3. SQL�� ���� <- preparedStatment, resultSet ��ü
      // 4. ���� ��ü�� ���Ͽ� ������ �ݾ��ִ� �ܰ�
      
      //1. JDBC�� ���� �ε�! Class.forName()
       // �ڹ��� ����
       //   - ������ ����:
       //   - ��Ÿ�� ����:
      
      try {//������ �ѹ��� �����Ű�� ����
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         
         //������ ���̽� �����ϱ� > connection��ü ���Ͽ� ����
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String user_id = "hr";
         String user_pw = "hr";
         
         //import ����Ű Ctrl + Shift + "o"
         //import java.sql.Connection;
         Connection conn = DriverManager.getConnection(url, user_id, user_pw);
         
         // getConnection()�� ���� ��ȯ�� ������ ���� ���� Ȯ��
         if(conn !=null) {
            System.out.println("���� ����");
         }else {
            System.out.println("���� ����");
         }
         
         // 3. sql�ۼ� -> preparedStatement()
         String sql = "select * from employees where last_name = 'King'";
         PreparedStatement psmt = conn.prepareStatement(sql);
         //���� sql���� ������ �� �ִ� ��� ����!
         //excuteQuety() : ���� ���̺� ������ ���� ��쿡 ��� > select
         //excuteUpdate() : ���� ���̺��� ������ �Ͼ�� ��� > insert, delete
         ResultSet rs = psmt.executeQuery();
         
         //����� ���� ������ ������ �����ϱ� ���� �۾�

         while (rs.next()) {
            String id =rs.getString(1);
            String first_name = rs.getString(2);
            String last_name = rs.getString(3);
            
           System.out.println("employee_id : "+id);
           System.out.println(" - first_name : "+first_name);
           System.out.println(" - last_name : "+last_name);
           System.out.println();
         }
//4. ��������
           //���������� ������ ���� �������� ���� ��ü ���� �������� �ݴ´�
           //rs- psmt -conn
           if(rs != null) {
        	   rs.close();
        	   
           }if (psmt!= null) {
        	   psmt.close();
        	   
           }if(conn!= null) {
        	   conn.close();
           }
           
           
         
         
         
         
      } catch (ClassNotFoundException e) {// try���� �������� �κ��� ����ó�� ���ִ� ����
         // jdbc ���� �ε��� ���� ��ΰ� ���� ���� ���
         e.printStackTrace();
         System.out.println("���� �ε� ����");
      } catch (SQLException e) {
         // sql�� �ش��ϴ� ������ ���� ����
         e.printStackTrace();
         System.out.println("�����ͺ��̽� ����");
      }   
   }
}

      
      
   

