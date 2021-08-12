import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Ex_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			//���� �������� ����ֱ� ���� �޼ҵ�
			public void run() {
				
				//�ڹ��� ����
				//1.������ ���� : ������ �߸��Ǿ�����
				//2. ��Ÿ�� ���� : �������� �߸��� ������ ����� ������ �߻��Ǵ� ��
				//
				  try {
					Ex_GUI window = new Ex_GUI();
					//���� ȭ�鿡 �������� ����ִ� �޼ҵ� boolean ������ ���� ���� �ִ�.
					//true :â�� ���̰� / false :â�� ������ �ʰ�
					window.frame.setVisible(true);
				} catch (Exception e) {
				 e.printStackTrace();
		//		}
			}
			}
		});
	}

	/**
	 * Create the application.
	 */
	//����������, Ŭ������ �̸��� ����> ������ �޼ҵ�
	public Ex_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 *
	 */
	//���� �������� ���� ��ɵ��� ����
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 100, 0));
		frame.setBackground(new Color(153, 102, 153));
		//setBounds()>�������� ũ��� ��ġ�� �����ϴ� �޼ҵ�
		//(x��,  y��, ����, ����)
		frame.setBounds(300, 150, 600, 400);
		//�������� �ݾ��ִ� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		////////////////////////////////////////////////////
		
		
		JLabel lblNewLabel = new JLabel("\uBC18\uAC11\uC2B5\uB2C8\uB2E4 \uC5EC\uB7EC\uBD84");
		lblNewLabel.setBounds(0, 0, 584, 20);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(0, 100, 0));
		//�������� �⺻���� �����Ǿ� �ִ� ���� �ɼ��� Ǯ���ִ� ���
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 17));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uD074\uB9AD");
		btnNewButton.setBounds(0, 338, 584, 23);
		btnNewButton.setBackground(new Color(0, 100, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(31, 45, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(245, 123, 97, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(441, 218, 97, 23);
		frame.getContentPane().add(btnNewButton_3);
	//������: �������� �������� ���α׷� ��ü�� ���ư��� ��
		//�ۼ��� : �����Ӱ� ���ÿ� ���α׷��� ������ ���
	}
}
