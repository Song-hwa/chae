import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MusicPlayerGUI {

	private JFrame frame;
	
	MusicPlayer mp = new MusicPlayer();
	Music song;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicPlayerGUI window = new MusicPlayerGUI();
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
	public MusicPlayerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.RED);
		frame.setBounds(100, 100, 1152, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 1112, 220);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lbl_info = new JLabel("Music Info");
		lbl_info.setForeground(Color.RED);
		lbl_info.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_info.setFont(new Font("HY�ü�B", Font.PLAIN, 99));
		panel.add(lbl_info, "name_266209462350700");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 240, 1112, 211);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("\u25C0\u25C0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				song = mp.prePlay();
				lbl_info.setText(mp.musicInfo(song));
				
			}
		});
		btnNewButton.setFont(new Font("����", Font.PLAIN, 99));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("\u25B6");
		//��ư�� �׼��� ������ �� �ִ� �޼ҵ� �ο��ϱ�
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				song = mp.play();
				
				//��ư�� ������ ���� ����� ���� ����ֱ� : musicInfo();
				//�󺧿� ������ ���� ���� ����
				//setText() : �󺧿� ������ �����ϱ� ���� �޼ҵ�(String)
				//getText() : �󺧿� �ִ� ������ �������� ���� �޼ҵ�(String)
				lbl_info.setText(mp.musicInfo(song));
				
				
			}
		});
		btnNewButton_2.setFont(new Font("����", Font.PLAIN, 99));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u25A0");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp.stop();
				lbl_info.setText("�뷡�� �����Ǿ����ϴ�.");
			}
		});
		btnNewButton_3.setFont(new Font("����", Font.PLAIN, 99));
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("\u25B6\u25B6");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				song = mp.nextPlay();
				lbl_info.setText(mp.musicInfo(song));
			}
		});
		btnNewButton_1.setFont(new Font("����", Font.PLAIN, 99));
		panel_1.add(btnNewButton_1);
	}
}
