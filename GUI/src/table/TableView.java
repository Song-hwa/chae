package table;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableView {

	private JFrame frame;
	private JTable table;
	
	 //TableView에서 사용될 ArrayList 생성
	   ArrayList<MemberVO> list = new ArrayList<>();
	   private JTextField text___1;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TableView window = new TableView();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public TableView(ArrayList members) {
		this.list = members;
		initialize();
		
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 50, 410, 201);
		frame.getContentPane().add(scrollPane);
		
		String[] col = {"이름", "나이", "성별"};
		//원본이 되는 테이블 데이터
		Object[][] data = new Object[list.size()][col.length];
		
		for(int i =0; i < list.size(); i++) {
			data[i][0] = list.get(i).name;
			data[i][1] = list.get(i).age;
			data[i][2] = list.get(i).gender;	
		}
		
		
		table = new JTable(data, col);
		scrollPane.setViewportView(table);
		// 송화씨 한번 봐드릴께요네
		text___1 = new JTextField();
		text___1.setBounds(12, 8, 306, 29);
		frame.getContentPane().add(text___1);
		text___1.setColumns(10);
		
		JButton bt___1 = new JButton("New button");
		bt___1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 검색의 기준은 이름!
			String search =text___1.getText();
			
			Object[][]data= new Object[1][3];
			
					
			for(int i =0; i<list.size();i++) {
				if(search.equals(list.get(i).name)) {
					//검색한 이름과 동일한 이름을 가지고 있는 Arraylist의 내용을
					//새로운 data배열에 담는다
					
					
					data[0][0] = list.get(i).name;
					data[0][1] = list.get(i).age;
					data[0][2] = list.get(i).gender;

				}
			}
			//기존에 있는 테이블의 내용을 삭제하기
			table.removeAll();
			table = new JTable(data, col);
			scrollPane.setViewportView(table);
			
			}
		});
		bt___1.setBounds(325, 8, 97, 30);
		frame.getContentPane().add(bt___1);
	}
}
