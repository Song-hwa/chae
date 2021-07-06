package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class memberDAO {

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	public void connDB() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pass = "hr";
			conn = DriverManager.getConnection(url, user, pass);
			if (conn != null) {
				System.out.println("conn success");
			} else {
				System.out.println("conn fail");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("jar확인 driver경로확인");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연결 실패");
			e.printStackTrace();
		}

	}

	public void closeDB() {
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
			e.printStackTrace();

		}
	}

	
	
	
	// {로그인,조인 메소드 생성!}
	// 1. 동적로딩~익스큐트까지 하나의 메소드로 만들고 결과를 리턴값으로 저장
	// 2. 컨트롤러클래스에서는 기능에 맞는 메소드를 호출하고 그에 따른 리턴값을 기준으로 어느페이지로 갈지 정한다.
	// (로그인은 null or not null, 조인은 cnt = 0 or 1)

	// 로그인메소드
	public memberDTO logincheck(String id, String pw) {
		memberDTO member = null;
		// 로그인 캐치문
		try {
			connDB();
			String sql1 = "select * from member_table where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql1);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			System.out.println(sql1);

			if (rs.next()) {
				
				String getId = rs.getString(1);
				String getName = rs.getString(2);
				String getPw = rs.getString(3);
				String getTel = rs.getString(4);
				String getEmail = rs.getString(5);
				String getAddress = rs.getString(6);
				member = new memberDTO(getId, getName, getPw, getTel,getEmail,getAddress);
				System.out.println("/rs.if문도달");
			}
		} catch (SQLException e) {
			System.out.println("커넥오류");
			e.printStackTrace();
		} finally {
			closeDB();
		} // 로그인캐치문end
		return member;
	}// 로그인메소드ed

	// 조인메소드
	public int join(memberDTO member) {
		int cnt = 0;

		// 조인캐치문
		try {
			connDB();
			String sql1 = "insert into member_table values (?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql1);
			psmt.setString(1, member.getId());
			psmt.setString(2, member.getName());
			psmt.setString(3, member.getPw());
			psmt.setString(4, member.getTel());
			psmt.setString(5, member.getEmail());
			psmt.setString(6, member.getAddress());
			
			System.out.println("커넥성공");
			cnt = psmt.executeUpdate();
			System.out.println("daocnt : "+cnt);
		} catch (SQLException e) {
			// 커넥오류else
			System.out.println("커넥오류");
			e.printStackTrace();

		} finally {
			closeDB();
		} // 조인캐치문ed
		return cnt;
	}// 조인메소드ed

	// 업데이트 메소드
	public int update(memberDTO member) {
		int cnt = 0;
		// 업데이트 캐치문
		try {
			connDB();

			String sql1 = "update member_table set name = ?, pw = ?, tel = ?, email = ?, adress = ? where id = ?";
			psmt = conn.prepareStatement(sql1);
			psmt.setString(1, member.getName());
			psmt.setString(2, member.getPw());
			psmt.setString(3, member.getTel());
			psmt.setString(4, member.getEmail());
			psmt.setString(5, member.getId());
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("커넥오류");
			e.printStackTrace();
		} finally {
			closeDB();
		} // 로그인캐치문end
		return cnt;
	}// 업데이트메소드ed

	// 셀렉트 메소드
	public ArrayList<memberDTO> select() {
		// 셀렉트 캐치문
		memberDTO member = null;
		ArrayList<memberDTO> list = new ArrayList<memberDTO>();
		
		try {
			connDB();
			String sql1 = "select * from member_table";
			psmt = conn.prepareStatement(sql1);
			rs = psmt.executeQuery();
			System.out.println(sql1);
			
			
				while(rs.next()) {
					String getId = rs.getString(1);
					String getName = rs.getString(2);
					String getPw = rs.getString(3);
					String getTel = rs.getString(4);
					String getEmail = rs.getString(5);
					String getAddress = rs.getString(6);
					member = new memberDTO(getId, getName, getPw, getTel,getEmail,getAddress);
					list.add(member);
				}	
			
			
		} catch (SQLException e) {
			System.out.println("커넥오류");
			e.printStackTrace();
		} finally {
			closeDB();
		} // 셀렉트캐치문end
			
			
	return (ArrayList<memberDTO>) list;
	}


	// 딜리트 메소드
	public int delete(String id) {
			int cnt = 0;
			// 딜리트 캐치문
			try {
				connDB();

				String sql1 = "delete from member_table where id = ?";
				psmt = conn.prepareStatement(sql1);
				psmt.setString(1, id);
				
				cnt = psmt.executeUpdate();

			} catch (SQLException e) {
				System.out.println("커넥오류");
				e.printStackTrace();
			} finally {
				closeDB();
			} // 로그인캐치문end
			return cnt;
		}// 로그인메소드ed

	//아이디 중복체크 메소드	
	public boolean idCheck(String id) {
			// 중복 캐치문
		boolean check = false;
			try {
				connDB();
				String sql1 = "select * from member_table where id = ?";
				psmt = conn.prepareStatement(sql1);
				psmt.setString(1, id);
				
				rs = psmt.executeQuery();
				
				System.out.println(sql1);

				if (rs.next()) {
					check = true;
				}else{
					check = false;
				}
			} catch (SQLException e) {
				System.out.println("커넥오류");
				e.printStackTrace();
			} finally {
				closeDB();
			} // 중복캐치문end
			return check;
		}// 중복메소드ed	


}// 클래스ed
