import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_insert {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//���۷������� �⺻ ���� null�̴�.
		
		PreparedStatement psmt = null;
		Connection conn = null;
		
		
		//1. JDBC�����ϱ�
		//1. ���� �ε�(����̹� �ε�)\
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";
			//2.Ŀ�ؼ� ����ܰ� ~,.~
			//connection�� ����Ʈ ���۾� �ǳ� �ϴµ�?!^,^
		     conn = DriverManager.getConnection(url, user_id, user_pw);
		
		    
		    //��ü�� �⺻���� null���̴�.
		    if(conn != null) {
		    	System.out.println("���� ����!");
		    }else {
		    	System.out.println("���� ����!");
		    }
		    
		    //����ڿ��� �Է³��� ���޹ޱ�
		    System.out.print("���̵�: ");
		    String id = sc.next();
		    System.out.print("��й�ȣ: ");
		    String pw = sc.next();
		    System.out.print("�̸�: ");
		    String name= sc.next();
		    System.out.print("���� :");
		    int age = sc.nextInt();
		    
		    
		    
		    
		    
		//����ڿ��� �Է³��� ���޹ޱ�
		    
		    
		    //3. sql�� ���۴ܰ�
		 //   String sql = "insert into members values('test', '0117', '������', 0)";
		    String sql = "insert into members values(?, ?, ?, ?)"; 
		    
		    psmt = conn.prepareStatement(sql);
		    
		    //sql���� ���� ? �� �����ϱ�
		    //setString/setInt >(��ġ, ���� ��)
		    // ������ 1���� �����Ѵ�
		    psmt.setString(1, id);
		    psmt.setString(2, pw);
		    psmt.setString(3, name);
		    psmt.setInt(4, age);
		    
		    //PreparedStatement�� ����Լ�
		    //1. executeUpdate() : ����, ����, ���� (���� ���� ���̺��� ���� �ٲ�� ��)
		    //2. executeQuery() : ��ȸ/�˻�(���� �� �Ŀ� ���̺� ���� ��ȭ�� ���� ��)
		    
		    int cnt = psmt.executeUpdate();
		    
		    if(cnt>0) {
		    	System.out.println("�����߰� ����!");
		    }else {
		    	System.out.println("�����߰� ����!");
		    }
		    
		    
	
		} catch (ClassNotFoundException e) {
		     System.out.println("���� �ε� ����!");
		     e.printStackTrace();
		} catch (SQLException e) {
		     System.out.println("sql ����!");
			e.printStackTrace();
			
		}
		//catch���� ���� ���� ���Ṯ�� �ۼ����ֱ�
		//������ ���� ���� �ʴ� ������ �����ϱ� ���� finally ���
		finally {
			//psmt, conn
			try {
			if(psmt != null) {//��ü�� ������ �ʾҴµ� ������� �� �� �����Ƿ� ���ǹ� ���
				psmt.close();
			}if(conn != null) {
				conn.close();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
}
