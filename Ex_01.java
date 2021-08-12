import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex_01 {

   public static void main(String[] args) {
      // JDBC연결 순서
      
      // 0. 선행작업 : ojdbc.jar를 프젝에 추가
      // 1. JDBC에 연결된 동적로딩 <- 드라이버를 설치해준다는 의미
      // 2. 데이터베이스에 연결 <- Connection객체 사용
      // 3. SQL문 전송 <- preparedStatment, resultSet 객체
      // 4. 사용된 객체에 대하여 연결을 닫아주는 단계
      
      //1. JDBC의 동적 로딩! Class.forName()
       // 자바의 오류
       //   - 컴파일 오류:
       //   - 런타임 오류:
      
      try {//무조건 한번은 실행시키는 구문
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         
         //데이터 베이스 연결하기 > connection객체 통하여 연결
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String user_id = "hr";
         String user_pw = "hr";
         
         //import 단축키 Ctrl + Shift + "o"
         //import java.sql.Connection;
         Connection conn = DriverManager.getConnection(url, user_id, user_pw);
         
         // getConnection()을 통해 반환된 값으로 연결 여부 확인
         if(conn !=null) {
            System.out.println("연결 성공");
         }else {
            System.out.println("연결 실패");
         }
         
         // 3. sql작성 -> preparedStatement()
         String sql = "select * from employees where last_name = 'King'";
         PreparedStatement psmt = conn.prepareStatement(sql);
         //실제 sql문을 실행할 수 있는 명령 진행!
         //excuteQuety() : 원본 테이블에 변동이 없는 경우에 사용 > select
         //excuteUpdate() : 원본 테이블의 수정이 일어나는 경우 > insert, delete
         ResultSet rs = psmt.executeQuery();
         
         //결과에 대한 내용을 변수에 저장하기 위한 작업

         while (rs.next()) {
            String id =rs.getString(1);
            String first_name = rs.getString(2);
            String last_name = rs.getString(3);
            
           System.out.println("employee_id : "+id);
           System.out.println(" - first_name : "+first_name);
           System.out.println(" - last_name : "+last_name);
           System.out.println();
         }
//4. 연결종료
           //연결종료의 순서는 가장 마지막에 열린 객체 부터 역순으로 닫는다
           //rs- psmt -conn
           if(rs != null) {
        	   rs.close();
        	   
           }if (psmt!= null) {
        	   psmt.close();
        	   
           }if(conn!= null) {
        	   conn.close();
           }
           
           
         
         
         
         
      } catch (ClassNotFoundException e) {// try에서 오류나는 부분을 예외처리 해주는 영역
         // jdbc 동적 로딩을 위한 경로가 맞지 않을 경우
         e.printStackTrace();
         System.out.println("동적 로딩 오류");
      } catch (SQLException e) {
         // sql에 해당하는 열역에 대한 오류
         e.printStackTrace();
         System.out.println("데이터베이스 오류");
      }   
   }
}

      
      
   

