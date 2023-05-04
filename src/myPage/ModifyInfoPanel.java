package myPage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ModifyInfoPanel extends JLayeredPane {
	private JTextField centerNumField;
	private JTextField lastNumField;
	private JTextField birthField;
	NumberKeypad numPad = new NumberKeypad();

	/**
	 * Create the panel.
	 */
	public ModifyInfoPanel() {
		
		setBackground(new Color(68, 43, 48));
		setBounds(477, 399, 908, 613);
		setLayout(null);
		
		JLabel phoneNumLabel = new JLabel("휴대전화 : 010");
		phoneNumLabel.setForeground(new Color(255, 255, 255));
		phoneNumLabel.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		phoneNumLabel.setBounds(49, 224, 165, 76);
		add(phoneNumLabel);
		
		centerNumField = new JTextField();
		centerNumField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				numPad.setTextField(centerNumField);
			}
		});
		centerNumField.setBounds(245, 250, 80, 40);
		add(centerNumField);
		centerNumField.setColumns(10);
		
		JLabel hyphen2 = new JLabel("-");
		hyphen2.setForeground(new Color(255, 255, 255));
		hyphen2.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		hyphen2.setBounds(348, 250, 33, 18);
		add(hyphen2);
		
		JLabel hyphen1 = new JLabel("-");
		hyphen1.setForeground(new Color(255, 255, 255));
		hyphen1.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		hyphen1.setBounds(222, 250, 33, 18);
		add(hyphen1);
		
		lastNumField = new JTextField();
		lastNumField.setColumns(10);
		lastNumField.setBounds(371, 250, 80, 40);
		add(lastNumField);
		
		JLabel birthLabel = new JLabel("생일       :");
		birthLabel.setForeground(new Color(255, 255, 255));
		birthLabel.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		birthLabel.setBounds(49, 321, 116, 56);
		add(birthLabel);
		
		birthField = new JTextField();
		birthField.setBounds(177, 330, 116, 37);
		add(birthField);
		birthField.setColumns(10);
		
		
		numPad.setBounds(475, 116, 400, 400);
		add(numPad);
		
		JButton btnNewButton = new JButton("닫기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(12, 493, 97, 23);
		add(btnNewButton);
		
		
	}
}
