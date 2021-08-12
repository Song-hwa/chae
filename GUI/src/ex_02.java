import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ex_02 {
	//ex_01���� �α��� ��ư�� Ŭ���� ����Ǵ� â
	//Ŭ������ �ʵ�(�Ӽ�, ������)�κ�

	private JFrame frame;
	String id;

	/**
	 * Launch the application.
	 */
	//���α׷��� ���� �޼ҵ���� ���� ȯ�濡�� �����͸� 
	//�Ѱ��ֱ� ���Ͽ� �ٸ� main()�� ������� �ʴ´�
	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ex_02 window = new ex_02();
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
	public ex_02() {
		initialize();
	}
//������ �޼ҵ� �����ε�(�ߺ�����)
	public ex_02(String id) {
		this.id = id;
	
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
		
		JLabel lblNewLabel = new JLabel(id + "ȯ���մϴ�");
		lblNewLabel.setForeground(new Color(147, 112, 219));
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(72, 156, 281, 42);
		frame.getContentPane().add(lblNewLabel);
		
		//�̹����� �ҷ����� ���� �ۼ���
		//ImageIcon - �̹������߰��ϱ� ���� Ŭ����
		ImageIcon img = new ImageIcon("image/��.jpg");
		//ImageIcon���� ���� ���� �̹����� ������ �ü� �ֵ��� ó��
		//getImage(): ImageŬ������ ���ؼ� ���� �̹����� ������ �� �� �ִ� ���
		
		Image pic = img.getImage();
		Image changepic = pic.getScaledInstance(172, 109, 0);
		
		//����� �̹����� ��� ImageIcon����
		ImageIcon changeImg = new ImageIcon(changepic);
		
		//�̹��� �׼��� ���� ���ο� �̹��� �߰��ϱ�
		ImageIcon img2 = new ImageIcon("image/������.jpg");
		Image pic2 = img2.getImage();
		Image changepic2 = pic2.getScaledInstance(374,123,0);
		ImageIcon changeImg2 = new ImageIcon(changepic2);
		
		
		//�̹����� �����ϱ� ���� ��
		
		JLabel lbl_img = new JLabel(changeImg);
		lbl_img.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			//���콺�� ���� ���� ������ ��������
				lbl_img.setIcon(changeImg2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				//���콺�� �󺧿����� �������(�����̹���)
				lbl_img.setIcon(changeImg2);
			}
		});
		lbl_img.setIcon(new ImageIcon("C:\\Users\\SM2141\\Desktop\\\uAC1C.jpg"));
		lbl_img.setBounds(123, 37, 172, 109);
		frame.getContentPane().add(lbl_img);
	}

}
