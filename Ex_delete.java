import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_delete {

	public static void main(String[] args) {
		//아이디와 비밀번호를 입력하면 해당 테이블로부터 내용 삭제하기
		
		
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		//레퍼런스형의 기본 값은 null이다.
	    PreparedStatement psmt = null;
	
		
		//1. 동적로딩
		 try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	    
		//2. 데이터베이스 연결
	         
	     	String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";
	         
	         
	        conn = DriverManager.getConnection(url, user_id, user_pw);
	        

		
		//3. 사용자로부터 아이디, 비밀번호 입력하기
	         System.out.print("아이디  : ");
	         String id = sc.next();
			 System.out.print("비밀번호: ");
			 String pw = sc.next();
	         
		//4. SQL문작성(3번을 활용)
	         String sql = "delete from members where id = ? and pw = ?";
			 
	         psmt = conn.prepareStatement(sql);  
			 
	         psmt.setString(1, id);
	         psmt.setString(2, pw);
			 
	         int cnt = psmt.executeUpdate();
	         
	         if(cnt>0) {
	        	 System.out.println("삭제 성공!");
	        	 
	         }else {
	        	 System.out.println("삭제 실패");
	         }

       } catch (ClassNotFoundException e) {
        System.out.println("동적 오류");
        e.printStackTrace();
       } catch (SQLException e) {
        System.out.println("sql 오류");
        e.printStackTrace();
       }
		//String sql = "";
		//5. 객체 연결종료
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
