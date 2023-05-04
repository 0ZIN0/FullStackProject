package myPage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InformationViewPanel extends JPanel {
	
	ModifyInfoDialog modifyInfo;
	/**
	 * Create the panel.
	 */
	public InformationViewPanel() {
		setBackground(new Color(60, 55, 56));
		setBounds(477, 399, 908, 613);
		setLayout(null);
	
		JLabel phoneNum = new JLabel("휴대전화");
		phoneNum.setForeground(new Color(255, 255, 255));
		phoneNum.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		phoneNum.setBounds(70, 110, 150, 60);
		add(phoneNum);
		
		JLabel phoneNumFormat = new JLabel("010 - XXXX - 1234");
		phoneNumFormat.setForeground(Color.WHITE);
		phoneNumFormat.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		phoneNumFormat.setBounds(320, 110, 300, 60);
		add(phoneNumFormat);
		
		JLabel birthFormat = new JLabel("00월 00일");
		birthFormat.setForeground(Color.WHITE);
		birthFormat.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		birthFormat.setBounds(320, 220, 300, 60);
		add(birthFormat);
		
		JLabel remainTimeFormat = new JLabel("00 번");
		remainTimeFormat.setForeground(Color.WHITE);
		remainTimeFormat.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		remainTimeFormat.setBounds(320, 330, 300, 60);
		add(remainTimeFormat);
		
		JLabel birth = new JLabel("생일");
		birth.setForeground(new Color(255, 255, 255));
		birth.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		birth.setBounds(70, 220, 150, 60);
		add(birth);
		
		JLabel remainTime = new JLabel("사물함");
		remainTime.setForeground(Color.WHITE);
		remainTime.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		remainTime.setBounds(70, 330, 150, 60);
		add(remainTime);
		
		JButton updateInfoButton = new JButton("정보 수정");
		updateInfoButton.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		updateInfoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modifyInfo.setVisible(true);
			}
		});
		updateInfoButton.setBounds(717, 530, 179, 73);
		add(updateInfoButton);
	}
	
	public void getModifyInfo(ModifyInfoDialog modifyInfo) {
		this.modifyInfo = modifyInfo;
	}

}
