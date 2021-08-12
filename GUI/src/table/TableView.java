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
	
	 //TableView���� ���� ArrayList ����
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
		
		String[] col = {"�̸�", "����", "����"};
		//������ �Ǵ� ���̺� ������
		Object[][] data = new Object[list.size()][col.length];
		
		for(int i =0; i < list.size(); i++) {
			data[i][0] = list.get(i).name;
			data[i][1] = list.get(i).age;
			data[i][2] = list.get(i).gender;	
		}
		
		
		table = new JTable(data, col);
		scrollPane.setViewportView(table);
		// ��ȭ�� �ѹ� ���帱�����
		text___1 = new JTextField();
		text___1.setBounds(12, 8, 306, 29);
		frame.getContentPane().add(text___1);
		text___1.setColumns(10);
		
		JButton bt___1 = new JButton("New button");
		bt___1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �˻��� ������ �̸�!
			String search =text___1.getText();
			
			Object[][]data= new Object[1][3];
			
					
			for(int i =0; i<list.size();i++) {
				if(search.equals(list.get(i).name)) {
					//�˻��� �̸��� ������ �̸��� ������ �ִ� Arraylist�� ������
					//���ο� data�迭�� ��´�
					
					
					data[0][0] = list.get(i).name;
					data[0][1] = list.get(i).age;
					data[0][2] = list.get(i).gender;

				}
			}
			//������ �ִ� ���̺��� ������ �����ϱ�
			table.removeAll();
			table = new JTable(data, col);
			scrollPane.setViewportView(table);
			
			}
		});
		bt___1.setBounds(325, 8, 97, 30);
		frame.getContentPane().add(bt___1);
	}
}
