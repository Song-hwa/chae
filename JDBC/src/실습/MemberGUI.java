package �ǽ�;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberGUI window = new MemberGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MemberGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_insert = new JButton("\uD68C\uC6D0 \uAC00\uC785");
		btn_insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//��ư�� ������ ȸ�������� ���� frame���� �̵�
				//1. �̵��ϰ� ���� Ŭ������ ��ü�� ����
				InsertGUI insertgui = new InsertGUI();
				
				//2. �̵��ϰ��� �ϴ� Ŭ������ main()/������ �޼ҵ�() ����
				InsertGUI.main(null);
				
				//3. (�ɼ�) ������ â�� ������ ������ ����
				frame.dispose();
				
				
			}
		});
		btn_insert.setFont(new Font("����", Font.BOLD, 17));
		btn_insert.setBounds(12, 10, 410, 64);
		frame.getContentPane().add(btn_insert);
		
		JButton btn_select = new JButton("\uD68C\uC6D0 \uC870\uD68C");
		btn_select.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            
	            SelectGUI selectgui = new SelectGUI();
	            selectgui.main(null);
	            
	            frame.dispose();
	            
	         }
	      });
		btn_select.setFont(new Font("����", Font.BOLD, 17));
		btn_select.setBounds(12, 84, 410, 43);
		frame.getContentPane().add(btn_select);
		
		JButton btn_update = new JButton("\uD68C\uC6D0 \uC815\uBCF4 \uC218\uC815");
		btn_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateGUI updategui = new UpdateGUI();
				UpdateGUI.main(null);
				frame.dispose();
			}
		});
		btn_update.setFont(new Font("����", Font.BOLD, 16));
		btn_update.setBounds(12, 146, 410, 43);
		frame.getContentPane().add(btn_update);
	}
}
