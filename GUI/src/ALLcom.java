import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JEditorPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ALLcom {

	private JFrame frame;
	private JTextField txt_name;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ALLcom window = new ALLcom();
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
	public ALLcom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(Color.BLACK);
		frame.getContentPane().add(tabbedPane, "name_11969545984100");
		
		
		//������ ����ϱ� ���Ͽ� ������� panel
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("ȭ��1", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 19));
		lblNewLabel.setBounds(12, 10, 59, 30);
		panel.add(lblNewLabel);
		
		txt_name = new JTextField();
		txt_name.setBounds(105, 19, 177, 21);
		panel.add(txt_name);
		txt_name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC131\uBCC4");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(12, 72, 59, 31);
		panel.add(lblNewLabel_1);
		
		JRadioButton ra_1 = new JRadioButton("\uB0A8");
		buttonGroup.add(ra_1);
		ra_1.setBounds(105, 78, 121, 23);
		panel.add(ra_1);
		
		JRadioButton rd_female = new JRadioButton("\uC5EC");
		buttonGroup.add(rd_female);
		rd_female.setBounds(277, 78, 121, 23);
		panel.add(rd_female);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uCDE8\uBBF8");
		lblNewLabel_1_1.setFont(new Font("����", Font.PLAIN, 26));
		lblNewLabel_1_1.setBounds(12, 138, 59, 31);
		panel.add(lblNewLabel_1_1);
		
		JCheckBox ch_1 = new JCheckBox("\uB180\uAE30");
		ch_1.setBounds(90, 146, 115, 23);
		panel.add(ch_1);
		
		JCheckBox ch_2 = new JCheckBox("\uC601\uD654\uBCF4\uAE30");
		ch_2.setBounds(248, 146, 115, 23);
		panel.add(ch_2);
		
		JLabel favfood = new JLabel("\uC88B\uC544\uD558\uB294\uC74C\uC2DD");
		favfood.setFont(new Font("����", Font.PLAIN, 18));
		favfood.setBounds(12, 191, 141, 31);
		panel.add(favfood);
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(12, 283, 405, 121);
		panel.add(editorPane);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"chicken", "pizza", "cheesebuger", "icecream"}));
		comboBox.setBounds(147, 196, 178, 23);
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("\uC791\uC131\uC644\uB8CC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//��ư�� Ŭ���Ǹ� �ۼ��� ������� �о����
				
				//TextPane�� ������ �����ϱ� ���� ����
				String message;
				
				String name = txt_name.getText();
				message = txt_name.getText();
				
				//���� ��ư ���ð� �������� isSelected(): boolean ����
				
				if(ra_1.isSelected()) {
					String gender = ra_1.getText();
					message +="\n"+ gender;
					
				}else {
					String gender = rd_female.getText();
					message += "\n"+ gender;
					
					
				}
				
				if(ch_1.isSelected()) {
					message += "\n" + ch_1.getText();
					
				}if(ch_2.isSelected()) {
					message +="\n" + ch_2.getText();
				
				
				}
				//ComboBox ���� ���� ��������
				//getSelecteditem()
				message += "\n"+comboBox.getSelectedItem();
				
				//���ڿ��� �����;� �� ���
				//1. ����ȯ : (String)
				//2.�Լ� ��� : toString()> JDBC ��� �� ���� Ȱ��
				
			
				
				
				//TextPane�� �Է�, ���� �� ����ֱ�
				editorPane.setText(message);
				
				
//				textPane.setText(name);
//				textPane.setText(gender);
				
			}
		});
		btnNewButton.setBounds(129, 245, 97, 23);
		panel.add(btnNewButton);
		
		
		

		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.PINK);
		tabbedPane.addTab("ȭ��2", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 20, 352, 317);
		panel_2.add(scrollPane);
		
		//tABLE ������ �����
		String[] col = {"�̸�", "����"};
		Object[][]data = {{"ä��ȭ", 32}, {"ä��ȭ",32}, {"ä��ȭ",32}, {"ä��ȭ",32}};
		//�����Ϳ� �������� ������ �������� ���ԵǸ� ��� ���¸� ��Ƴ��� �ִ� object�� ������ش�
	
		
		//jTABLE(������, �÷��̸�);
		
		table = new JTable(data, col);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\uCC44\uC1A1\uD654", new Integer(32), "\uC5EC\uC790"},
				{"\uCC44\uC1A1\uD654", new Integer(32), "\uC5EC"},
				{"\uCC44\uC1A1\uD654", new Integer(32), "2"},
				{"\uCC44\uC1A1\uD654", new Integer(32), "3"},
			},
			new String[] {
				"\uC774\uB984", "\uB098\uC774", "\uC131\uBCC4"
			}
		));
		scrollPane.setViewportView(table);
		
		//table ���� �Ӽ�
		//1. �� �̵� �Ұ�
		table.getTableHeader().setReorderingAllowed(false);
		
		//2. �� ũ�� ���� ����
		table.getTableHeader().setReorderingAllowed(false);
		//3. �� ���� �����ϱ�
		table.setRowHeight(30);
		
		
		
		
		
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("ȭ��3", null, panel_1, null);
	
        JPanel panel_3 = new JPanel();
        tabbedPane.addTab("ȭ��4", null, panel_3, null);
	
	}
}
