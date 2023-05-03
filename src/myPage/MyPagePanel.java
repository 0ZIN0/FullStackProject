package myPage;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class MyPagePanel extends JPanel {
	
	InformationViewPanel infoPanel = new InformationViewPanel();
	TicketViewPanel ticketPanel = new TicketViewPanel();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private BufferedImage image;
	
	/**
	 * Create the panel.
	 */
	public MyPagePanel() {
		try {
            image = ImageIO.read(new File("resources/background.png"));
        } catch (IOException ex) {
            // 예외 처리
        }
		
		ticketPanel.setVisible(false);
		
		setBounds(0, 0, 1920, 1080);
		setBackground(new Color(73, 67, 68));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(63, 58, 60));
		panel.setBounds(111, 211, 811, 138);
		add(panel);
		panel.setLayout(null);
		
		JToggleButton informationViewBtn = new JToggleButton("정보 보기");
		informationViewBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				infoPanel.setVisible(true);
			}
			
		});
		
		informationViewBtn.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		buttonGroup.add(informationViewBtn);
		informationViewBtn.setBounds(212, 20, 192, 100);
		panel.add(informationViewBtn);
		
		JToggleButton ticketViewBtn = new JToggleButton("이용권");
		ticketViewBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ticketPanel.setVisible(true);
			}
		});
		ticketViewBtn.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		buttonGroup.add(ticketViewBtn);
		ticketViewBtn.setBounds(420, 20, 182, 100);
		panel.add(ticketViewBtn);
		
		JToggleButton mileageViewBtn = new JToggleButton("마일리지");
		mileageViewBtn.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		buttonGroup.add(mileageViewBtn);
		mileageViewBtn.setBounds(617, 20, 182, 100);
		panel.add(mileageViewBtn);
		
		JLabel myPageLabel = new JLabel("<html>0000님의<br>마이페이지</html>");
		myPageLabel.setFont(new Font("맑은 고딕", Font.BOLD, 28));
		myPageLabel.setForeground(new Color(255, 255, 255));
		myPageLabel.setBounds(20, 20, 180, 100);
		panel.add(myPageLabel);
		
		JSeparator tapSep1 = new JSeparator();
		tapSep1.setForeground(new Color(255, 255, 255));
		tapSep1.setBackground(new Color(255, 255, 255));
		tapSep1.setOrientation(SwingConstants.VERTICAL);
		tapSep1.setBounds(412, 18, 10, 110);
		panel.add(tapSep1);
		
		JSeparator tapSep2 = new JSeparator();
		tapSep2.setForeground(new Color(255, 255, 255));
		tapSep2.setOrientation(SwingConstants.VERTICAL);
		tapSep2.setBounds(608, 18, 10, 110);
		panel.add(tapSep2);
		
		add(infoPanel);
		add(ticketPanel);
		
		JButton btnNewButton = new JButton("닫기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					System.exit(0);
			}
		});
		btnNewButton.setBounds(1774, 10, 117, 112);
		add(btnNewButton);

	}
	
	 protected void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 g.drawImage(image, 0, 0, this);
	 }
}
