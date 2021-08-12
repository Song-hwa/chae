package ½Ç½À;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InsertGUI {

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_pw;
	private JTextField txt_name;
	private JTextField txt_age;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertGUI window = new InsertGUI();
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
	public InsertGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 735);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uAC00\uC785\u2665");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 410, 83);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("id");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(12, 110, 98, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		txt_id = new JTextField();
		txt_id.setBounds(122, 103, 280, 48);
		frame.getContentPane().add(txt_id);
		txt_id.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("password");
		lblNewLabel_1_1.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(12, 191, 98, 32);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("name");
		lblNewLabel_1_2.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setBounds(12, 270, 98, 32);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("age");
		lblNewLabel_1_3.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setBounds(12, 364, 98, 32);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		txt_pw = new JTextField();
		txt_pw.setColumns(10);
		txt_pw.setBounds(122, 184, 280, 48);
		frame.getContentPane().add(txt_pw);
		
		txt_name = new JTextField();
		txt_name.setColumns(10);
		txt_name.setBounds(122, 264, 280, 48);
		frame.getContentPane().add(txt_name);
		
		txt_age = new JTextField();
		txt_age.setColumns(10);
		txt_age.setBounds(122, 352, 280, 48);
		frame.getContentPane().add(txt_age);
		
		JButton btn_insert = new JButton("\uB0B4 \uB3D9\uB8CC\uAC00 \uB418\uC5B4\uB77C");
		btn_insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				String name = txt_name.getText();
				int age = Integer.parseInt(txt_age.getText());
				
				Controller controll = new Controller();
				int cnt = controll.insert(id, pw, name, age);
				
				if(cnt > 0) {
					System.out.println("°¡ÀÔ ¼º°ø");
				}else {
					System.out.println("°¡ÀÔ ½ÇÆÐ");
				}
			}
		});
		btn_insert.setFont(new Font("±Ã¼­Ã¼", Font.BOLD, 39));
		btn_insert.setBounds(12, 453, 410, 233);
		frame.getContentPane().add(btn_insert);
		
		
	}
}
