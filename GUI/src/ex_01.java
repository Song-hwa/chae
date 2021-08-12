import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex_01 {

	private JFrame frame;
	private JTextField txt_id;
	private JPasswordField txt_pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex_01 window = new ex_01();
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
	public ex_01() {
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
		
		JLabel lblNewLabel = new JLabel("ID :");
		lblNewLabel.setBounds(12, 25, 93, 32);
		frame.getContentPane().add(lblNewLabel);
		
		txt_id = new JTextField();
		txt_id.setBounds(127, 25, 232, 32);
		frame.getContentPane().add(txt_id);
		txt_id.setColumns(10);
		
		JLabel lblPw = new JLabel("PW :");
		lblPw.setBounds(12, 100, 93, 32);
		frame.getContentPane().add(lblPw);
		
		txt_pw = new JPasswordField();
		txt_pw.setBounds(127, 100, 232, 32);
		frame.getContentPane().add(txt_pw);
		
		JButton btm_login = new JButton("log in");
		btm_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//��ư�� ������ �Ǹ� �Էµ� ������ �������� ���
				//getText()
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				
				System.out.println("���̵� :"+id);
				System.out.println("��й�ȣ:"+pw);
				//������ �����ӿ��� ���ο� ���������� �̵��ϱ�
				//1.���Ӱ� ����ְ� ���� Ŭ������ ��ü �����ϱ�
				//���ο� ȭ�鼼�� �����͸� �����Ҽ� �ֵ��� ������ �޼ҵ�Ȱ��
				
				ex_02 maingui = new ex_02(id);
//				maingui.main(null);
				
				//2.������ ����� �ִ� frame�� �ݾ��ֱ�
				//dispose():frame�� �ݾ��ִ� �Լ�
				frame.dispose();
			}
		});
		btm_login.setBounds(192, 158, 97, 23);
		frame.getContentPane().add(btm_login);
		
		JButton btm_login_1 = new JButton("\uCDE8\uC18C");
		btm_login_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//��ư�� ������ �ۼ��� ���� reset!!
				txt_id.setText(null);
				txt_pw.setText(null);
			}
		});
		btm_login_1.setBounds(192, 208, 97, 23);
		frame.getContentPane().add(btm_login_1);
	}
}
