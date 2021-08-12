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
      
      // 사용자에게 수정하고 싶은 내용 확인하기!
      System.out.println("=====회원 정보 수정=====");
      System.out.print("아이디 입력 : ");
      String id = sc.next();
      
      System.out.print("[1]pw [2]name [3]age >> ");
      int choice = sc.nextInt();
      
      
      int data = 0;
      String data2 = "";
      
      System.out.print("수정될 데이터 입력 : ");
      if(choice == 3) {
         data = sc.nextInt();
      }else {
         data2 = sc.next();
      }
      
      // 선택 메뉴에 따른 sql문 작성
      String sql = "";
      if(choice == 1) {  // pw 수정
         sql = "update members set pw = ? where id = ?";
      }else if(choice == 2) {  // name 수정
         sql = "update members set name = ? where id = ?";
      }else if(choice == 3) {  // age 수정
         sql = "update members set age = ? where id = ?";
      }
      

      // 1. 동적로딩
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String user_id = "hr";
         String user_pw = "hr";
         
         // 2. 데이터베이스 연결
         conn = DriverManager.getConnection(url, user_id, user_pw);
         
         
         // 3. sql문 작성
         //    - 비밀번호를 수정할수 있는 sql문 작성
//         String sql = "update members set pw ='1225' where id = 'csm'";
         
         psmt = conn.prepareStatement(sql);
         
         // ?에 대한 setting 진행하기
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
            System.out.println("수정 완료!");
         }else {
             System.out.println("수정 실패..");
         }      
         
         //해당ID 의 수정된 내용을 보여주는 SQL문 작성      
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
         System.out.println("동적 오류");
         e.printStackTrace();
      } catch (SQLException e) {
         System.out.println("sql 오류");
         e.printStackTrace();
      }

      // 4. 연결 종료 - try - catch 구문 벗어나서 작성
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
