package 실습;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateGUI {

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateGUI window = new UpdateGUI();
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
	public UpdateGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(12, 56, 86, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uBCC0\uACBD\uD560PW");
		lblNewLabel_1.setBounds(12, 125, 86, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		txt_id = new JTextField();
		txt_id.setBounds(110, 57, 282, 40);
		frame.getContentPane().add(txt_id);
		txt_id.setColumns(10);
		
		txt_pw = new JTextField();
		txt_pw.setColumns(10);
		txt_pw.setBounds(110, 125, 282, 40);
		frame.getContentPane().add(txt_pw);
		
		JButton btn_update = new JButton("\uBCC0\uACBD");
		btn_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				
				Controller controll = new Controller();
				int cnt = controll.update(id, pw);
				
				if(cnt > 0) {
					System.out.println("변경 완료");
				}else {
					System.out.println("변경 실패");
				}
			}
		});
		btn_update.setBounds(12, 214, 282, 271);
		frame.getContentPane().add(btn_update);
	}

}
