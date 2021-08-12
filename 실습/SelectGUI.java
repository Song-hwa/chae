package 실습;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SelectGUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectGUI window = new SelectGUI();
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
	public SelectGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 630, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC804\uCCB4 \uC870\uD68C");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(97, 10, 410, 42);
		frame.getContentPane().add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 64, 590, 401);
		frame.getContentPane().add(scrollPane);

		// 테이블의 컬럼 명 지정
		String[] col = { "아이디", "비밀번호", "이름", "나이" };

		// Controller를 통해 테이블 전체 조회
		Controller controll = new Controller();
		ArrayList<MemberVO> list = controll.selectAll(); // 전체 조회기능

		Object[][] data = new Object[list.size()][4];

		// list의 내용을 JTable에 저장하기 -> 실제 data에 삽입
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (j == 0) {
					data[i][j] = list.get(i).getId(); // 아이디
				}
				if (j == 1) {
					data[i][j] = list.get(i).getPw(); // 비밀번호
				}
				if (j == 2) {
					data[i][j] = list.get(i).getName(); // 이름
				}
				if (j == 3) {
					data[i][j] = list.get(i).getAge(); // 나이
				}
			}
		}

		table = new JTable(data, col);
		scrollPane.setViewportView(table);
	}
}
