package 실습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Controller {
	// Controller : 데이터를 데어해두는 기능
	// select, insert, delete, update
	int cnt = 0;
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	//MemberVo에 대한 객체 생성
	MemberVO vo = null;

	public void getConn() {
// 1. 동적 로딩을 위한 연결 메소드
// Class.forName()
// DriverManager.getConnection()
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

// 2. 데이터베이스 연결 getConn()
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			conn = DriverManager.getConnection(url, user_id, user_pw);

		} catch (Exception e) {
			System.out.println("getConn() 오류");
			e.printStackTrace();
		}

	}// getConn()

// 객체의 연결을 종료하는 메소드 close()
	public void close() {

		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}//close()
	
//회원가입을 위한 메소드 - insert()
	public int insert(String id, String pw, String name, int age) {
		
		getConn();
		
		
		try {
			String sql = "insert into members values(?, ?, ?, ?)";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);
			
			cnt = psmt.executeUpdate();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		//에러가 나던 나지 않던 무조건 실행해서 객체 닫아주기
		finally {
			close();
		}
		
		return cnt;
	}//insert()
	
	//회원 전체 조회 selectAll()
	public ArrayList<MemberVO> selectAll() {
		
		ArrayList<MemberVO> list = new ArrayList<>();
		
		//1. 동적 로딩, db연결
		getConn();
		
		//2. 전체 조회 sql문 작성
		try {
			String sql = "select * from members";
			
			psmt = conn.prepareStatement(sql);
			
		//3. rs객체를 통해 각 컬럼 값 가져오기 -> rs.get(index번호)	
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				
				vo = new MemberVO(id, pw, name, age);
				
				list.add(vo);
			}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			close();
		}
		
		return list;
	}//selectAll()
	
	public int update(String id, String data) {
		
		getConn();
		
		
		try {
			String sql = "update members set pw =? where id = ?";
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, data);
			psmt.setString(2, id);
			
			cnt = psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return cnt;
	}

}// class
