package myPage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MileageViewPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MileageViewPanel() {
		setBackground(new Color(60, 55, 56));
		setBounds(477, 399, 908, 613);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("적립 마일리지 :");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 42));
		lblNewLabel.setBounds(191, 239, 328, 109);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("0P");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 42));
		lblNewLabel_1.setBounds(531, 239, 243, 109);
		add(lblNewLabel_1);
	}
}
