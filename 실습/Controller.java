package �ǽ�;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Controller {
	// Controller : �����͸� �����صδ� ���
	// select, insert, delete, update
	int cnt = 0;
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	//MemberVo�� ���� ��ü ����
	MemberVO vo = null;

	public void getConn() {
// 1. ���� �ε��� ���� ���� �޼ҵ�
// Class.forName()
// DriverManager.getConnection()
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

// 2. �����ͺ��̽� ���� getConn()
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			conn = DriverManager.getConnection(url, user_id, user_pw);

		} catch (Exception e) {
			System.out.println("getConn() ����");
			e.printStackTrace();
		}

	}// getConn()

// ��ü�� ������ �����ϴ� �޼ҵ� close()
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
	
//ȸ�������� ���� �޼ҵ� - insert()
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
		
		//������ ���� ���� �ʴ� ������ �����ؼ� ��ü �ݾ��ֱ�
		finally {
			close();
		}
		
		return cnt;
	}//insert()
	
	//ȸ�� ��ü ��ȸ selectAll()
	public ArrayList<MemberVO> selectAll() {
		
		ArrayList<MemberVO> list = new ArrayList<>();
		
		//1. ���� �ε�, db����
		getConn();
		
		//2. ��ü ��ȸ sql�� �ۼ�
		try {
			String sql = "select * from members";
			
			psmt = conn.prepareStatement(sql);
			
		//3. rs��ü�� ���� �� �÷� �� �������� -> rs.get(index��ȣ)	
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
