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
	//ex_01에서 로그인 버튼을 클릭시 실행되는 창
	//클래스의 필드(속성, 데이터)부분

	private JFrame frame;
	String id;

	/**
	 * Launch the application.
	 */
	//프로그램의 시작 메소드부터 같은 환경에서 데이터를 
	//넘겨주기 위하여 다른 main()은 사용하지 않는다
	
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
//생성자 메소드 오버로딩(중복정의)
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
		
		JLabel lblNewLabel = new JLabel(id + "환영합니다");
		lblNewLabel.setForeground(new Color(147, 112, 219));
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(72, 156, 281, 42);
		frame.getContentPane().add(lblNewLabel);
		
		//이미지를 불러오기 위한 작성법
		//ImageIcon - 이미지를추가하기 위한 클래스
		ImageIcon img = new ImageIcon("image/개.jpg");
		//ImageIcon으로 부터 실제 이미지만 가지고 올수 있도록 처리
		//getImage(): Image클래스를 통해서 실제 이미지만 가지고 올 수 있는 기능
		
		Image pic = img.getImage();
		Image changepic = pic.getScaledInstance(172, 109, 0);
		
		//변경된 이미지를 띄울 ImageIcon생성
		ImageIcon changeImg = new ImageIcon(changepic);
		
		//이미지 액션을 위한 새로운 이미지 추가하기
		ImageIcon img2 = new ImageIcon("image/세서미.jpg");
		Image pic2 = img2.getImage();
		Image changepic2 = pic2.getScaledInstance(374,123,0);
		ImageIcon changeImg2 = new ImageIcon(changepic2);
		
		
		//이미지를 삽입하기 위한 라벨
		
		JLabel lbl_img = new JLabel(changeImg);
		lbl_img.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			//마우스가 라벨의 영역 안으로 들어왔을때
				lbl_img.setIcon(changeImg2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				//마우스가 라벨영역을 벗어났을때(원본이미지)
				lbl_img.setIcon(changeImg2);
			}
		});
		lbl_img.setIcon(new ImageIcon("C:\\Users\\SM2141\\Desktop\\\uAC1C.jpg"));
		lbl_img.setBounds(123, 37, 172, 109);
		frame.getContentPane().add(lbl_img);
	}

}
