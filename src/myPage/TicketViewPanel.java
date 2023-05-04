package myPage;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicketViewPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public TicketViewPanel() {
		setBackground(new Color(60, 55, 56));
		setBounds(477, 399, 908, 613);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(110, 60, 270, 510);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("시간 충전");
		lblNewLabel.setBounds(60, 25, 140, 40);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("상품명");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1.setBounds(12, 93, 57, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("잔여시간");
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(12, 118, 72, 15);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("유효기간");
		lblNewLabel_1_2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(12, 143, 72, 15);
		panel.add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("시간 충전하기");
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 28));
		btnNewButton.setBounds(20, 410, 220, 80);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(500, 60, 270, 510);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("기간 충전");
		lblNewLabel_2.setBounds(60, 25, 140, 40);
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("상품명");
		lblNewLabel_1_3.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(12, 99, 57, 15);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("잔여기간");
		lblNewLabel_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(12, 124, 72, 15);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("유효기간");
		lblNewLabel_1_2_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1_2_1.setBounds(12, 149, 72, 15);
		panel_1.add(lblNewLabel_1_2_1);
		
		JButton btnNewButton_1 = new JButton("기간 충전하기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 28));
		btnNewButton_1.setBounds(22, 409, 220, 80);
		panel_1.add(btnNewButton_1);
	}
}
